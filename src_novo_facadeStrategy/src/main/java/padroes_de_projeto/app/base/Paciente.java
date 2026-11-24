package base;
import java.time.LocalDate;

public class Paciente extends Usuario{
    private  int cpf;
    private  LocalDate dataNascimento;
    private  int cartaoSUS;
    private  boolean acompanhante;

    public Paciente(){}

    public Paciente(long id, String nome, String telefone, int cpf, LocalDate dataNascimento, int cartaoSUS, boolean acompanhante){
        super(id, nome, telefone);
        this.cpf =cpf;
        this.dataNascimento = dataNascimento;
        this.cartaoSUS = cartaoSUS;
        this.acompanhante = acompanhante;
    }

    // Não pus SET para que não seja possível mudar o valor
    public int getCpf(){
        return cpf;
    }

    public LocalDate getDataNasc(){
        return dataNascimento;
    }

    public int getCartaoSus(){
        return cartaoSUS;
    }

    //Esse pode ser mudado
    public boolean getAcompanhante(){
        return acompanhante;
    }public void setAcompanhante(boolean acompanhante){
        this.acompanhante = acompanhante;
    }
}
