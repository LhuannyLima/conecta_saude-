package padroes_de_projeto.app;
import java.util.List;
import java.time.LocalDate;
import padroes_de_projeto.app.base.*;
import padroes_de_projeto.app.DTO.*;
import padroes_de_projeto.app.service.ViagemService;


// Fachada responsável por centralizar o processo do TFD
public class TFDFacade {

    // Subsistema responsável pela alocação de motoristas
    private ViagemService viagemService;
    // Recebe o serviço de viagem pelo construtor
    public TFDFacade(ViagemService viagemService) {
        this.viagemService = viagemService;
    }

    public boolean solicitarViagem(SolicitacaoDTO dto){
        if(dto.getMunicipioOrigem().trim().equalsIgnoreCase(dto.getMunicipioProcedimento().trim())){
            System.out.println("VIAGEM NEGADA! O procedimento deve ser fora da cidade de origem.");
            return false;
        }

        LocalDate datahoje = LocalDate.now();
        LocalDate dataUmDiaAntes = datahoje.minusDays(1);

        if(dto.getDataViagem().isEqual(datahoje)){
            System.out.print("VIAGEM NEGADA! A viagem deve ser solicitada um dia antes do procedimento.");
            return false;
        }

        if(dto.getDataViagem().isEqual(dataUmDiaAntes)){
            System.out.print("VIAGEM NEGADA! A viagem deve ser solicitada no minímo por um dia antes do procedimento.");
            return false;
        }

        if(!dto.getDataViagem().isAfter(datahoje)){
            System.out.print("VIAGEM NEGADA! A viagem deve ser solicitada no minímo por um dia antes do procedimento.");
            return false;
        }

        return true;

    }
    // Centraliza a alocação do motorista através da fachada
    public Motorista alocarMotorista(
        Viagem viagem,
        List<Motorista> motoristas,
        List<Viagem> viagens,
        LocalDate dataReferencia
    ) {
        // Encaminha a alocação para o serviço de viagem
        return viagemService.alocarMotorista(
            viagem, motoristas, viagens, dataReferencia
        );
    }

    public Mensagem enviarMensagemmMensagem(MensagemDaViagemDTO dto){
        if(dto == null || !dto.isConfirmacao()){
            return null;
        }
        Mensagem mensagem = new Mensagem(
            dto.getLocalSaida(),
            dto.getLocalDestino(),
            dto.getHorarioSaida(),
            dto.getDataSaida(),
            dto.isConfirmacao(),
            dto.getNomeMotorista(),
            dto.getContatoMotorista()
        );
       return mensagem;
    }

    public void Criarviagem(Viagem viagem, SolicitacaoDTO Solidto, List<Motorista> motoristas1, List<Viagem> viagens) {
        if(solicitarViagem(Solidto) == false){
            System.out.println("\n______________________________________________\n");
            return;
        }
                viagem.adicionarPaciente(Solidto.getIdPaciente());
                viagem.setData(Solidto.getDataViagem());
                viagem.setHospitalDestino(Solidto.getMunicipioProcedimento());
                viagem.setLocalOrigem(Solidto.getMunicipioOrigem());
                viagem.adicionarSolicitacao(Solidto);
                viagem.setFuncionarioAlocador(null);
                viagem.setAcompanhante(Solidto.getAcompanhate());
                viagem.setHorarioProcedimento(Solidto.getHorarioProcedimento());
        viagem.setMotorista(processarViagem(viagem, motoristas1 , viagens ,Solidto.getDataViagem()));
        Motorista motorista = viagem.getMotorista();

        if(motorista == null){
            System.out.println("Viagem negada por falta de motorista!");
        }else{
                viagem.setPresencaPaciente(true);
                viagem.setConfirmacao(true);
                String nomeMotorista = motorista.getNome();
                String telefoneMotorista = motorista.getTelefone();
                MensagemDaViagemDTO dto = new MensagemDaViagemDTO(viagem.getLocalOrigem(), viagem.getHospitalDestino(), viagem.getData(), viagem.isConfirmacao(), nomeMotorista, telefoneMotorista, viagem.getHorarioProcedimento());
                Mensagem mensagem = enviarMensagemmMensagem(dto);
                exibirMensagem(dto);
                viagem.adicionarMensagem(mensagem);
        }
    }
        // Coordena a alocação do motorista e a exibição da mensagem
    public Motorista processarViagem(
        Viagem viagem,
        List<Motorista> motoristas,
        List<Viagem> viagens,
        LocalDate dataReferencia
    ) {
        // Aloca o motorista utilizando a Strategy
        Motorista motorista = alocarMotorista(
            viagem, motoristas, viagens, dataReferencia
        );
        // Retorna o motorista selecionado
        return motorista;
    }

    private void exibirMensagem(MensagemDaViagemDTO dto){
        System.out.println("===== INFORMAÇÕES DA VIAGEM TFD =====");
        System.out.println("Origem: " + dto.getLocalSaida());
        System.out.println("Destino: " + dto.getLocalDestino());
        System.out.println("Horário de saída: " + dto.getHorarioSaida());
        System.out.println("Data de saída: " + dto.getDataSaida());
        System.out.println("Confirmação: " + dto.isConfirmacao());
        System.out.println("Motorista: " + dto.getNomeMotorista());
        System.out.println("Contato: " + dto.getContatoMotorista());
        System.out.println("===================================");
    }

}
