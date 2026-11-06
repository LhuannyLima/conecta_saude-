package base;
import java.time.LocalDate;
import java.util.ArrayList;

public class Viagem extends SolicitacaoTFD {
    //atributos
    private LocalDate data;
    private String localOrigem;
    private String hospitalDestino;
    private boolean confirmacao;
    private boolean presencaPaciente;

    //relacionamentos
    private ArrayList<Paciente> pacientes;
    private ArrayList<Mensagem> mensagens;
    private Motorista motorista;
    private Funcionario funcionarioAlocador;
    private SolicitacaoTFD solicitacao;

    public Viagem(){
        this.pacientes = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public Viagem(Motorista motorista, Funcionario funcionarioAlocador, Paciente paciente, SolicitacaoTFD solicitacao, Mensagem mensagem, LocalDate data, boolean confirmacao, boolean presencaPaciente, String localOrigem, String hospitalDestino){
        this.data = data;
        this.confirmacao = confirmacao;
        this.presencaPaciente = confirmacao;
        this.localOrigem = localOrigem;
        this.hospitalDestino = hospitalDestino;

        this.solicitacao = solicitacao;
        this.motorista = motorista;
        this.funcionarioAlocador = funcionarioAlocador;

        this.pacientes = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    //Listas add
    public void adicionarPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }
    public void adicionarMensagem(Mensagem mensagem){
        this.mensagens.add(mensagem);
    }

    //Get e set
    public LocalDate getData() {
        return data;
    }public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getHospitalDestino() {
        return hospitalDestino;
    }public void setHospitalDestino(String hospitalDestino) {
        this.hospitalDestino = hospitalDestino;
    }

    public boolean isConfirmacao() {
        return confirmacao;
    } public void setConfirmacao(boolean confirmacao) {
        this.confirmacao = confirmacao;
    }

    public boolean isPresencaPaciente() {
        return presencaPaciente;
    }public void setPresencaPaciente(boolean presencaPaciente) {
        this.presencaPaciente = presencaPaciente;
    }

    public Motorista getMotorista() {
        return motorista;
    }public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Funcionario getFuncionarioAlocador() {
        return funcionarioAlocador;
    } public void setFuncionarioAlocador(Funcionario funcionarioAlocador) {
        this.funcionarioAlocador = funcionarioAlocador;
    }

    public SolicitacaoTFD getSolicitacao() {
        return solicitacao;
    }public void setSolicitacao(SolicitacaoTFD solicitacao) {
        this.solicitacao = solicitacao;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }public void setMensagens(ArrayList<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }
}
