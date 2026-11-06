package base;
import java.time.LocalDate;

public class Mensagem {
    protected  LocalDate dataSaida;
    protected  boolean confirmacao;
    protected  String nomeMotorista;
    protected  String contatoMotorista;

    private SolicitacaoTFD solicitacao;
    private Viagem viagem;

    public Mensagem(){}

    public Mensagem(LocalDate dataSaida, boolean confirmacao, String nomeMotorista, String contatoMotorista, Viagem viagem, SolicitacaoTFD solicitacao){
        this.dataSaida = dataSaida;
        this.confirmacao = confirmacao;
        this.nomeMotorista = nomeMotorista;
        this.contatoMotorista = contatoMotorista;
        this.solicitacao = solicitacao;
        this.viagem = viagem;
        
    }
    //Não pus SET para que não seja mudado a informação
    public LocalDate getDataSaida() {
        return dataSaida;
    }
    public boolean isConfirmacao() {
        return confirmacao;
    }
    public String getNomeMotorista() {
        return nomeMotorista;
    }
    public String getContatoMotorista() {
        return contatoMotorista;
    }

    //Exceção
    public SolicitacaoTFD getSolicitacao() {
        return solicitacao;
    }public void setSolicitacao(SolicitacaoTFD solicitacao) {
        this.solicitacao = solicitacao;
    }

    public Viagem getViagem() {
        return viagem;
    }public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }
    
    
    
}
