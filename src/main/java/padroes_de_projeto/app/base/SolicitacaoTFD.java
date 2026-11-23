package padroes_de_projeto.app.base;

import java.time.LocalDate;

public class SolicitacaoTFD {
    private String municipioOrigem;
    private String municipioProcedimento;
    private Paciente paciente;
    private LocalDate dataViagem;
    private Acompanhante acompanhante;

    public SolicitacaoTFD(){}

    public SolicitacaoTFD(LocalDate dataViagem, Acompanhante acompanhante, String municipioOrigem, String municipioProcedimento, Paciente paciente){
        this.municipioOrigem = municipioOrigem;
        this.municipioProcedimento = municipioProcedimento;
        this.paciente = paciente;
        this.dataViagem = dataViagem;
        this.acompanhante = acompanhante;
    }


    public String getMunicipioOrigem() {
        return municipioOrigem;
    }public void setMunicipioOrigem(String municipioOrigem) {
        this.municipioOrigem = municipioOrigem;
    }

    public String getMunicipioProcedimento() {
        return municipioProcedimento;
    }public void setMunicipioProcedimento(String municipioProcedimento) {
        this.municipioProcedimento = municipioProcedimento;
    }

    public Paciente getPaciente(){
        return paciente;
    }public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public LocalDate getDataViagem() {
        return dataViagem;
    }public void setDataViagem(LocalDate dataViagem) {
        this.dataViagem = dataViagem;
    }

    public Acompanhante getAcompanhante() {
        return acompanhante;
    }public void setAcompanhante(Acompanhante acompanhante) {
        this.acompanhante = acompanhante;
    }
    

}
