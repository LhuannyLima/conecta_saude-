package base;
public class SolicitacaoTFD {
    protected String municipioOrigem;
    protected String municipioProcedimento;
    private Paciente paciente;

    public SolicitacaoTFD(){}

    public SolicitacaoTFD(String municipioOrigem, String municipioProcedimento, Paciente paciente){
        this.municipioOrigem = municipioOrigem;
        this.municipioProcedimento = municipioProcedimento;
        this.paciente = paciente;
    }

    public String getMunicipioorigem(){
        return municipioOrigem;
    }public void setMunicipioorigem(String municipioOrigem){
        this.municipioOrigem = municipioOrigem;
    }

    public String getMunicipioprocedimento(){
        return municipioProcedimento;
    }public void setMunicipioProcedimento(String municipioProcedimento){
        this.municipioProcedimento = municipioProcedimento;
    }

    public Paciente getPaciente(){
        return paciente;
    }public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
}
