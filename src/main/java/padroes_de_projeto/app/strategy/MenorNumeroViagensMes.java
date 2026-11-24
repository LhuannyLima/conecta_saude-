package padroes_de_projeto.app.strategy;

import java.util.List;
import java.time.LocalDate;

import padroes_de_projeto.app.base.Motorista;
import padroes_de_projeto.app.base.Viagem;
import padroes_de_projeto.app.base.SolicitacaoTFD;

// Estratégia que seleciona o motorista com menos viagens no mês
public class MenorNumeroViagensMes implements EstrategiaAlocacao {

    @Override
    public Motorista selecionarMotorista(
        Viagem viagemAtual,
        List<Motorista> motoristas,
        List<Viagem> viagens,
        LocalDate dataReferencia
    ) {

        // Verifica se existe algum motorista disponível
        if (motoristas == null || motoristas.isEmpty()) {
            throw new IllegalArgumentException(
                "Não existem motoristas disponíveis."
            );
        }

        // Verifica se a lista de viagens e a data foram informadas
        if (viagens == null || dataReferencia == null) {
            throw new IllegalArgumentException(
                "A lista de viagens e a data são obrigatórias."
            );
        }

        // Verifica se a viagem atual foi informada
        if (viagemAtual == null || viagemAtual.getSolicitacao() == null) {
            throw new IllegalArgumentException(
                "A viagem e sua solicitação são obrigatórias."
            );
        }

        // Verifica se a solicitação precisa de veículo adaptado
        boolean precisaAdaptado = viagemAtual.getSolicitacao()
            .isNecessitaVeiculoAdaptado();

        // Guarda o motorista que será selecionado
        Motorista motoristaSelecionado = null;

        // Inicia com um valor alto para facilitar a comparação
        int menorQuantidade = Integer.MAX_VALUE;

        // Percorre todos os motoristas disponíveis
        for (Motorista motorista : motoristas) {

            // Se precisa de veículo adaptado, ignora motoristas
            // que não possuem esse tipo de veículo
            if (precisaAdaptado
                && !motorista.isPossuiVeiculoAdaptado()) {
                continue;
            }

            // Contador de viagens do motorista no mês
            int quantidadeViagens = 0;

            // Percorre todas as viagens registradas
            for (Viagem viagem : viagens) {

                // Verifica se a viagem possui motorista e data
                // e se pertence ao motorista e mês de referência
                if (viagem.getMotorista() != null
                    && viagem.getData() != null
                    && viagem.getMotorista().getId().equals(motorista.getId())
                    && viagem.getData().getMonth() == dataReferencia.getMonth()
                    && viagem.getData().getYear() == dataReferencia.getYear()) {

                    // Conta mais uma viagem para esse motorista
                    quantidadeViagens++;
                }
            }

            // Verifica se esse motorista tem menos viagens
            // do que o menor número encontrado até agora
            if (quantidadeViagens < menorQuantidade) {

                // Atualiza a menor quantidade encontrada
                menorQuantidade = quantidadeViagens;

                // Guarda o motorista que possui essa quantidade
                motoristaSelecionado = motorista;
            }
        }

        // Verifica se algum motorista foi selecionado
        if (motoristaSelecionado == null) {
            throw new IllegalStateException(
                "Não existe motorista adequado para essa solicitação."
            );
        }

        // Retorna o motorista selecionado
        return motoristaSelecionado;
    }
}
