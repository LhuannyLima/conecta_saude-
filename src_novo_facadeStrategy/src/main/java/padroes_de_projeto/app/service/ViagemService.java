package service;

import java.util.List;
import java.time.LocalDate;

import base.Motorista;
import base.Viagem;
import strategy.EstrategiaAlocacao;

// Serviço responsável por realizar a alocação de motoristas
public class ViagemService {

    // Guarda a estratégia de alocação que será utilizada
    private EstrategiaAlocacao estrategia;

    // Recebe uma estratégia ao criar o serviço
    public ViagemService(EstrategiaAlocacao estrategia) {
        this.estrategia = estrategia;
    }

    // Permite trocar a estratégia de alocação
    public void setEstrategia(EstrategiaAlocacao estrategia) {
        this.estrategia = estrategia;
    }

    // Realiza a alocação do motorista para uma viagem
    public Motorista alocarMotorista(
        Viagem viagem,
        List<Motorista> motoristas,
        List<Viagem> viagens,
        LocalDate dataReferencia
    ) {

        // Verifica se a viagem foi informada
        if (viagem == null) {
            throw new IllegalArgumentException(
                "A viagem é obrigatória."
            );
        }

        // Verifica se existe uma estratégia definida
        if (estrategia == null) {
            throw new IllegalStateException(
                "Nenhuma estratégia de alocação foi definida."
            );
        }

        // Executa a estratégia para selecionar um motorista
        Motorista motoristaSelecionado =
            estrategia.selecionarMotorista(
                viagem, motoristas, viagens, dataReferencia
            );

        // Associa o motorista selecionado à viagem
        viagem.setMotorista(motoristaSelecionado);

        // Retorna o motorista escolhido
        return motoristaSelecionado;
    }
}
