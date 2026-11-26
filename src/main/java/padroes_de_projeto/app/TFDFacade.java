package padroes_de_projeto.app;
import java.util.List;
import java.time.LocalDate;
import padroes_de_projeto.app.base.Motorista;
import padroes_de_projeto.app.base.Viagem;
import padroes_de_projeto.app.base.Mensagem;
import padroes_de_projeto.app.base.SolicitacaoTFD;

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

    // Cria e exibe a mensagem com os dados da viagem
    public void enviarMensagem(Viagem viagem) {

        // Obtém o motorista que foi alocado
        Motorista motorista = viagem.getMotorista();

        // Obtém a solicitação vinculada à viagem
        SolicitacaoTFD solicitacao = viagem.getSolicitacao();

        // Cria a mensagem com os dados da viagem
        Mensagem mensagem = new Mensagem(
            viagem.getHorario(),
            viagem.getData(),
            viagem.isConfirmacao(),
            motorista.getNome(),
            motorista.getTelefone(),
            viagem,
            solicitacao
        );

        // Adiciona a mensagem à lista da viagem
        viagem.adicionarMensagem(mensagem);

        // Exibe os dados no terminal
        System.out.println("===== INFORMAÇÕES DA VIAGEM TFD =====");
        System.out.println("Data de saída: " + mensagem.getDataSaida());
        System.out.println("Confirmação: " + mensagem.isConfirmacao());
        System.out.println("Motorista: " + mensagem.getNomeMotorista());
        System.out.println("Contato: " + mensagem.getContatoMotorista());
        System.out.println("===================================");
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
}



