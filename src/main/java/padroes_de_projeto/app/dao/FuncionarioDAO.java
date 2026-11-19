package padroes_de_projeto.app.dao;

//import padroes_de_projeto.app.base.Funcionario;
import padroes_de_projeto.app.base.Viagem;
import padroes_de_projeto.app.base.Motorista;

// Talvez seja necessario passar Funcionario
public interface FuncionarioDAO {
    void alocarMotorista(Motorista motorista, Viagem viagem);
}