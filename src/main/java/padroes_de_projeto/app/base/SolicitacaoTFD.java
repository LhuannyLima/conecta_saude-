package padroes_de_projeto.app.base;

import java.time.LocalDate;
import java.time.LocalTime;

public class SolicitacaoTFD {
    private String municipioOrigem;
    private String municipioProcedimento;
    private Paciente paciente;
    private LocalDate dataViagem;
    private Acompanhante acompanhante;
    private boolean necessitaVeiculoAdaptado;
    private LocalTime horarioProcedimento;

    public SolicitacaoTFD(){}

    public SolicitacaoTFD(LocalTime horarioProcedimento, boolean necessitaVeiculoAdaptado, LocalDate dataViagem, Acompanhante acompanhante, String municipioOrigem, String municipioProcedimento, Paciente paciente){
        this.municipioOrigem = municipioOrigem;
        this.municipioProcedimento = municipioProcedimento;
        this.paciente = paciente;
        this.dataViagem = dataViagem;
        this.acompanhante = acompanhante;
        this.necessitaVeiculoAdaptado = necessitaVeiculoAdaptado;
        this.horarioProcedimento = horarioProcedimento;
    }

    public String getMunicipioOrigem() {
        return municipioOrigem;
    }

    public String getMunicipioProcedimento() {
        return municipioProcedimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDate getDataViagem() {
        return dataViagem;
    }

    public Acompanhante getAcompanhante() {
        return acompanhante;
    }

    public boolean isNecessitaVeiculoAdaptado() {
        return necessitaVeiculoAdaptado;
    }

    public LocalTime getHorarioProcedimento() {
        return horarioProcedimento;
    }

    
    
}
