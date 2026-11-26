package padroes_de_projeto.app.dto;
import java.util.Objects;

public class AcompanhanteDTO {
    private final String nome;
    private final String sobrenome;
    private final String cpf;

    public AcompanhanteDTO(String nome, String sobrenome, String cpf) {
        this.nome = validarTexto(nome, "Nome do acompanhante");
        this.sobrenome = validarTexto(sobrenome, "Sobrenome do acompanhante");
        this.cpf = validarTexto(cpf, "CPF do acompanhante");
    }

    private String validarTexto(String valor, String campo){
        Objects.requireNonNull(valor, campo + "não pode ser nulo.");
        if(valor.trim().isEmpty()){
            throw new IllegalArgumentException(campo + "Não pode ser vazio");
        }return valor;
    }
    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public String getcpf(){
        return cpf;
    }
}
