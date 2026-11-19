package padroes_de_projeto.app.dao;

import padroes_de_projeto.app.base.Motorista;
import padroes_de_projeto.app.base.Viagem;

public interface MotoristaDAO {
    void confirmarPresenca(Motorista motorista, Viagem viagem);
}
