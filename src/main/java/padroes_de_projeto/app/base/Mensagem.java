package padroes_de_projeto.app.base;
import java.time.LocalDate;
import java.time.LocalTime;

public class Mensagem {
    private LocalDate dataSaida;
    private  boolean confirmacao;
    private  String nomeMotorista;
    private  String contatoMotorista;
    private LocalTime horarioSaida;

    private SolicitacaoTFD solicitacao;
    private Viagem viagem;

    public Mensagem(){}

    public Mensagem(LocalTime horarioSaida, LocalDate dataSaida, boolean confirmacao, String nomeMotorista, String contatoMotorista, Viagem viagem, SolicitacaoTFD solicitacao){
        this.dataSaida = dataSaida;
        this.confirmacao = confirmacao;
        this.nomeMotorista = nomeMotorista;
        this.contatoMotorista = contatoMotorista;
        this.solicitacao = solicitacao;
        this.viagem = viagem;
        this.horarioSaida = horarioSaida;
        
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
    public LocalTime getHorarioSaida() {
        return horarioSaida;
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
