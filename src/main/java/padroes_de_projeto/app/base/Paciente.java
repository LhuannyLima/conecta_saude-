package padroes_de_projeto.app.base;

import padroes_de_projeto.app.base.Acompanhante;
import java.time.LocalDate;

public class Paciente extends Usuario {
    private int cpf;
    private LocalDate dataNascimento;
    private int cartaoSUS;
    private Acompanhante acompanhante;

    public Paciente() {
    }

    public Paciente(long id, String nome, String telefone, int cpf, LocalDate dataNascimento, int cartaoSUS,
            Acompanhante acompanhante) {
        super(id, nome, telefone);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.cartaoSUS = cartaoSUS;
        this.acompanhante = acompanhante;
    }

    public Paciente(long id, String nome, String telefone, int cpf, LocalDate dataNascimento, int cartaoSUS) {
        this(id, nome, telefone, cpf, dataNascimento, cartaoSUS, null);
    }

    // Não pus SET para que não seja possível mudar o valor
    public int getCpf() {
        return cpf;
    }

    public LocalDate getDataNasc() {
        return dataNascimento;
    }

    public int getCartaoSus() {
        return cartaoSUS;
    }

    // Esse pode ser mudado
    public Acompanhante getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(Acompanhante acompanhante) {
        this.acompanhante = acompanhante;
    }
}
