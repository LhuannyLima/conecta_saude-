package padroes_de_projeto.app;
import java.util.List;
import java.time.LocalDate;
import padroes_de_projeto.app.base.Motorista;
import padroes_de_projeto.app.base.Viagem;
import padroes_de_projeto.app.base.Mensagem;
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

    public Mensagem enviarMensagem(MensagemDaViagemDTO dto){
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

    // Cria e exibe a mensagem com os dados da viagem
    public void enviarMensagem(Viagem viagem) {
        if(viagem == null){
            System.out.println("Essa viagem não existe!");
            return;
        }
        Motorista motorista = viagem.getMotorista();
        
        if(motorista == null){
            System.out.println("Viagem negada por falta de motorista!");
        }else{
        
            if(viagem.isConfirmacao() == false){
                System.out.println("Viagem negada!");
                return;
            }
                String nomeMotorista = motorista.getNome();
                String telefoneMotorista = motorista.getTelefone();
                MensagemDaViagemDTO dto = new MensagemDaViagemDTO(viagem.getLocalOrigem(), viagem.getHospitalDestino(), viagem.getDataViagem(), viagem.isConfirmacao(), nomeMotorista, telefoneMotorista, viagem.getHorarioProcedimento());
                Mensagem mensagem = enviarMensagem(dto);
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

        // Exibe a mensagem com os dados da viagem
        enviarMensagem(viagem);

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
