package padroes_de_projeto.app.dao;

import padroes_de_projeto.app.base.Paciente;
import padroes_de_projeto.app.base.SolicitacaoTFD;
import padroes_de_projeto.app.base.Viagem;

public interface PacienteDAO {
    SolicitacaoTFD solicitarViagem(Paciente paciente);

    void confirmarViagem(Paciente paciente, Viagem viagem);
}