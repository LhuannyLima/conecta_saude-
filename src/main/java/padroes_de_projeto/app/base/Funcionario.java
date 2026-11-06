package base;
public class Funcionario extends Usuario {
    private int codigoIdentificacao;

    public Funcionario(){}

    public Funcionario (String nome, String telefone, long id, int codigoIdentificacao){
        super(id, nome, telefone);
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public int getCodigoIndentificacaoFuncionario(){
        return codigoIdentificacao;
    }public void setCodigoIndentificacaoFuncionario(int codigoIdentificacao){
        this.codigoIdentificacao = codigoIdentificacao;
    }
    
}
