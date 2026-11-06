package base;
public class Motorista extends Usuario {
    private int codigoIdentificacao;

    public Motorista(){}

    public Motorista(String nome, String telefone, long id, int codigoIdentificacao){
        super(id, nome, telefone);
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public int getCodigoIndentificacaoMotorista(){
        return codigoIdentificacao;
    }public void setCodigoIndentificacaoMotorista(int codigoIdentificacao){
        this.codigoIdentificacao = codigoIdentificacao;
    }
}
