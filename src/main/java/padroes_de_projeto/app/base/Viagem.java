package padroes_de_projeto.app.base;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Viagem extends SolicitacaoTFD {
    //atributos
    private LocalDate data;
    private String localOrigem;
    private String hospitalDestino;
    private boolean confirmacao;
    private boolean presencaPaciente;
    private Acompanhante acompanhante;
    private LocalTime horarioProcedimento;

    //relacionamentos
    private ArrayList<Paciente> pacientes;
    private ArrayList<Mensagem> mensagens;
    private Motorista motorista;
    private Funcionario funcionarioAlocador;
    private ArrayList<SolicitacaoTFD> solicitacao;

    public Viagem(){
        this.pacientes = new ArrayList<>();
        this.mensagens = new ArrayList<>();
        this.solicitacao = new ArrayList<>();
    }

    public Viagem(LocalTime horarioProcedimento, Acompanhante acompanhante, Motorista motorista,  Paciente paciente, SolicitacaoTFD solicitacao, Mensagem mensagem, LocalDate data, boolean confirmacao, boolean presencaPaciente, String localOrigem, String hospitalDestino){
        this.data = data;
        this.confirmacao = confirmacao;
        this.presencaPaciente = confirmacao;
        this.localOrigem = localOrigem;
        this.hospitalDestino = hospitalDestino;
        this.acompanhante = acompanhante;
        this.solicitacao = new ArrayList<>();
        this.motorista = motorista;
        this.pacientes = new ArrayList<>();
        this.mensagens = new ArrayList<>();
        this.horarioProcedimento = horarioProcedimento;
    }

    //Listas add
    public void adicionarPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }
    public void adicionarMensagem(Mensagem mensagem){
        this.mensagens.add(mensagem);
    }
    public void adicionarSolicitacao(SolicitacaoTFD solicitacao){
        this.solicitacao.add(solicitacao);
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

    public ArrayList<SolicitacaoTFD> getSolicitacao() {
        return solicitacao;
    }public void setSolicitacao(ArrayList<SolicitacaoTFD> solicitacao) {
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

    public Acompanhante getAcompanhante() {
        return acompanhante;
    }public void setAcompanhante(Acompanhante acompanhante) {
        this.acompanhante = acompanhante;
    }

    public LocalTime getHorarioProcedimento() {
        return horarioProcedimento;
    }
    public void setHorarioProcedimento(LocalTime horarioProcedimento) {
        this.horarioProcedimento = horarioProcedimento;
    }

    

    
}
