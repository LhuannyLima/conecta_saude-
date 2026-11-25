package padroes_de_projeto.app.base;
import java.time.LocalDate;
import java.time.LocalTime;

public class Mensagem {
    private LocalDate dataSaida;
    private  boolean confirmacao;
    private  String nomeMotorista;
    private  String contatoMotorista;
    private  String LocalSaida;
    private  String LocalDestino;
    private LocalTime horarioSaida;

    public Mensagem(){}

    public Mensagem(String LocalDestino, String LocalSaida, LocalTime horarioSaida, LocalDate dataSaida, boolean confirmacao, String nomeMotorista, String contatoMotorista){
        this.dataSaida = dataSaida;
        this.confirmacao = confirmacao;
        this.nomeMotorista = nomeMotorista;
        this.contatoMotorista = contatoMotorista;
        this.LocalDestino = LocalDestino;
        this.LocalSaida = LocalSaida;
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

    public String getLocalSaida() {
        return LocalSaida;
    }
    public void setLocalSaida(String localSaida) {
        LocalSaida = localSaida;
    }

    public String getLocalDestino() {
        return LocalDestino;
    }
    public void setLocalDestino(String origemSaida) {
        LocalDestino = origemSaida;
    }

    
    
    
}
