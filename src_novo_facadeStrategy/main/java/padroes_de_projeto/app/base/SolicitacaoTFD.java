package base;

// Classe que representa uma solicitação de Transporte Fora do Domicílio (TFD)
public class SolicitacaoTFD {

    // Município de onde o paciente vai sair
    protected String municipioOrigem;

    // Município onde o paciente realizará o procedimento
    protected String municipioProcedimento;

    // Paciente vinculado à solicitação
    private Paciente paciente;

    // Informa se o paciente precisa de veículo adaptado
    private boolean necessitaVeiculoAdaptado;

    // Construtor vazio
    public SolicitacaoTFD(){}

    // Construtor que recebe os dados da solicitação
    public SolicitacaoTFD(String municipioOrigem, String municipioProcedimento, Paciente paciente, boolean necessitaVeiculoAdaptado){
        this.municipioOrigem = municipioOrigem;
        this.municipioProcedimento = municipioProcedimento;
        this.paciente = paciente;
        this.necessitaVeiculoAdaptado = necessitaVeiculoAdaptado;
    }

    // Retorna o município de origem
    public String getMunicipioorigem(){
        return municipioOrigem;
    }

    // Define o município de origem
    public void setMunicipioorigem(String municipioOrigem){
        this.municipioOrigem = municipioOrigem;
    }

    // Retorna o município onde será realizado o procedimento
    public String getMunicipioprocedimento(){
        return municipioProcedimento;
    }

    // Define o município do procedimento
    public void setMunicipioProcedimento(String municipioProcedimento){
        this.municipioProcedimento = municipioProcedimento;
    }

    // Retorna o paciente vinculado à solicitação
    public Paciente getPaciente(){
        return paciente;
    }

    // Define o paciente da solicitação
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    // Verifica se o paciente necessita de veículo adaptado
    public boolean isNecessitaVeiculoAdaptado(){
        return necessitaVeiculoAdaptado;
    }

    // Define se o paciente necessita de veículo adaptado
    public void setNecessitaVeiculoAdaptado(boolean necessitaVeiculoAdaptado){
        this.necessitaVeiculoAdaptado = necessitaVeiculoAdaptado;
    }
}