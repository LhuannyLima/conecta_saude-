package padroes_de_projeto.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import padroes_de_projeto.app.base.Motorista;
import padroes_de_projeto.app.base.SolicitacaoTFD;
import padroes_de_projeto.app.base.Viagem;
import padroes_de_projeto.app.service.ViagemService;
import padroes_de_projeto.app.strategy.EstrategiaAlocacao;
import padroes_de_projeto.app.strategy.MenorNumeroViagensMes;

public class App {

    public static void main(String[] args) {

        // Cria a estratégia de alocação de motorista
        EstrategiaAlocacao estrategia = new MenorNumeroViagensMes();

        // Cria o serviço de viagem usando a estratégia
        ViagemService viagemService = new ViagemService(estrategia);

        // Cria a fachada do sistema TFD
        TFDFacade facade = new TFDFacade(viagemService);

        // Cria a lista de motoristas disponíveis
        List<Motorista> motoristas = new ArrayList<>();

        // Cadastra motoristas para teste
        Motorista motorista1 = new Motorista(true, "João", "71999990001", 1L, 101);
        Motorista motorista2 = new Motorista(false, "Carlos", "71999990002", 2L, 102);
        Motorista motorista3 = new Motorista(true, "Pedro", "71999990003", 3L, 103);

        // Adiciona os motoristas à lista
        motoristas.add(motoristas.size(), motorista1);
        motoristas.add(motoristas.size(), motorista2);
        motoristas.add(motoristas.size(), motorista3);

        // Cria a lista de viagens já registradas
        List<Viagem> viagens = new ArrayList<>();

        // Define a data atual como referência
        LocalDate dataReferencia = LocalDate.now();

        // Registra viagens anteriores no mês para teste
        Viagem viagem1 = new Viagem();
        viagem1.setMotorista(motorista1);
        viagem1.setData(dataReferencia.minusDays(2));

        Viagem viagem2 = new Viagem();
        viagem2.setMotorista(motorista1);
        viagem2.setData(dataReferencia.minusDays(5));

        Viagem viagem3 = new Viagem();
        viagem3.setMotorista(motorista2);
        viagem3.setData(dataReferencia.minusDays(3));

        // Adiciona as viagens anteriores à lista
        viagens.add(viagem1);
        viagens.add(viagem2);
        viagens.add(viagem3);

        // Cria a solicitação de TFD
        SolicitacaoTFD solicitacao = new SolicitacaoTFD();
        solicitacao.setNecessitaVeiculoAdaptado(true);

        // Cria a viagem atual com data futura (posterior à solicitação)
        Viagem viagemAtual = new Viagem();
        viagemAtual.setData(dataReferencia.plusDays(3));
        viagemAtual.setConfirmacao(true);
        viagemAtual.adicionarSolicitacao(solicitacao);

        // Processa a viagem pela Facade
        Motorista motoristaEscolhido = facade.processarViagem(
            viagemAtual,
            motoristas,
            viagens,
            dataReferencia
        );
        // Exibe o motorista escolhido
        System.out.println("Motorista selecionado: " + motoristaEscolhido.getNome());
    }
}