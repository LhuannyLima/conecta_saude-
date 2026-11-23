package padroes_de_projeto.app;

import java.time.LocalDate;
import java.util.List;
import base.Motorista;
import base.Viagem;
import base.Mensagem;
import base.SolicitacaoTFD;
import service.ViagemService;

// Fachada que centraliza o processo do TFD
public class TFDFacade {

    // Serviço responsável pela alocação de motoristas
    private ViagemService viagemService;

    // Recebe o serviço de viagem
    public TFDFacade(ViagemService viagemService) {
        this.viagemService = viagemService;
    }

    // Encaminha a alocação para o serviço
    public Motorista alocarMotorista(
            Viagem viagem,
            List<Motorista> motoristas,
            List<Viagem> viagens,
            LocalDate dataReferencia) {
        return viagemService.alocarMotorista(
                viagem, motoristas, viagens, dataReferencia);
    }

    // Cria e exibe a mensagem com os dados da viagem
    private void enviarMensagem(Viagem viagem) {

        // Obtém o motorista que foi selecionado
        Motorista motorista = viagem.getMotorista();

        // Obtém a solicitação vinculada à viagem
        SolicitacaoTFD solicitacao = viagem.getSolicitacao();

        // Cria a mensagem com as informações da viagem
        Mensagem mensagem = new Mensagem(
                viagem.getData(),
                viagem.isConfirmacao(),
                motorista.getNome(),
                motorista.getTelefone(),
                viagem,
                solicitacao);

        // Adiciona a mensagem à viagem
        viagem.adicionarMensagem(mensagem);

        // Exibe as informações no terminal
        System.out.println("===== INFORMAÇÕES DA VIAGEM TFD =====");
        System.out.println("Data de saída: " + mensagem.getDataSaida());
        System.out.println("Confirmação: " + mensagem.isConfirmacao());
        System.out.println("Motorista: " + mensagem.getNomeMotorista());
        System.out.println("Contato: " + mensagem.getContatoMotorista());
        System.out.println("===================================");
    }

    // Coordena a alocação e a exibição da mensagem
    public Motorista processarViagem(
            Viagem viagem,
            List<Motorista> motoristas,
            List<Viagem> viagens,
            LocalDate dataReferencia) {

        // Aloca o motorista utilizando a Strategy
        Motorista motorista = alocarMotorista(
                viagem, motoristas, viagens, dataReferencia);

        // Exibe a mensagem com os dados da viagem
        enviarMensagem(viagem);

        // Retorna o motorista selecionado
        return motorista;
    }
}