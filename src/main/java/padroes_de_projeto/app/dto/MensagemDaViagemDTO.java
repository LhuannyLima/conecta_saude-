package padroes_de_projeto.app.dto;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class MensagemDaViagemDTO {

    private final LocalDate dataSaida;
    private final boolean confirmacao;
    private final String nomeMotorista;
    private final String contatoMotorista;
    private final LocalTime horarioSaida;
    private final String localSaida;
    private final String localDestino;

    public MensagemDaViagemDTO(String localsaida, String localDestino, LocalDate dataSaida, boolean confirmacao, String nomeMotorista, String contatoMotorista, LocalTime horarioSaida){
        this.dataSaida = Objects.requireNonNull(dataSaida, "Data de viagem");
        this.confirmacao = Objects.requireNonNull(confirmacao, "Confirmação de viagem");
        this.nomeMotorista = validarTexto(nomeMotorista, "Nome do motorista");
        this.contatoMotorista = validarTexto(contatoMotorista, "Contado do motorista");
        this.horarioSaida = Objects.requireNonNull(horarioSaida, "O horário da viagem");
        this.localDestino = validarTexto(localDestino, "Local destino");
        this.localSaida = validarTexto(localsaida, "Local saida");
    }

    private String validarTexto(String valor, String campo){
        Objects.requireNonNull(valor, campo + "não pode ser nulo.");
        if(valor.trim().isEmpty()){
            throw new IllegalArgumentException(campo + "Não pode ser vazio");
        }return valor;
    }

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
        return localSaida;
    }

    public String getLocalDestino() {
        return localDestino;
    }
        
}




    
