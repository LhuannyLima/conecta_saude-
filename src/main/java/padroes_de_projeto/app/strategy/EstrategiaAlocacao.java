package strategy;

// Importa a interface List para trabalhar com listas
import java.util.List;

// Importa LocalDate para trabalhar com datas
import java.time.LocalDate;

// Importa as classes Motorista e Viagem do pacote base
import base.Motorista;
import base.Viagem;

// Interface que define o contrato para as estratégias de alocação
public interface EstrategiaAlocacao {

    // Método responsável por selecionar um motorista
    // Cada estratégia implementará esse método com seu próprio critério
    Motorista selecionarMotorista(
        Viagem viagemAtual, // Viagem que precisa de um motorista
        List<Motorista> motoristas, // Lista de motoristas disponíveis
        List<Viagem> viagens, // Viagens já registradas
        LocalDate dataReferencia // Data usada como referência para a contagem
    );
}