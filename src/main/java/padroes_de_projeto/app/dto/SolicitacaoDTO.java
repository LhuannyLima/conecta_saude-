package padroes_de_projeto.app.DTO;
import java.time.LocalDate;
import java.util.Objects;

import padroes_de_projeto.app.base.Paciente;
import padroes_de_projeto.app.base.SolicitacaoTFD;

import java.time.LocalTime;

public class SolicitacaoDTO extends SolicitacaoTFD {
    private final String idSolicitacao;
    private final Paciente paciente;
    private final String municipioOrigem;
    private final String municipioProcedimento;
    private final LocalDate dataViagem;
    private final AcompanhanteDTO acompanhate;
    private final LocalTime horarioProcedimento;
    private final boolean necessitaVeiculoAdaptado;

    public SolicitacaoDTO(boolean necessitaVeiculoAdaptado, LocalTime horarioProcedimento, String idSolicitacao, 
        Paciente paciente, 
        String municipioOrigem,
        String municipioProcedimento,
        LocalDate dataViagem,
        AcompanhanteDTO acompanhate)
        {
        this.necessitaVeiculoAdaptado = necessitaVeiculoAdaptado;
        this.paciente = Objects.requireNonNull(paciente,"Dados do paciente");
        this.idSolicitacao = validacao(idSolicitacao, "ID da solicitação");
        this.municipioOrigem = validacao(municipioOrigem, "Municipio de origem");
        this.municipioProcedimento = validacao(municipioProcedimento, "Municipio de procedimento");
        this.dataViagem = Objects.requireNonNull(dataViagem, "Data viagem não pode está vazia");
        this.acompanhate = acompanhate;
        this.horarioProcedimento = Objects.requireNonNull(horarioProcedimento, "Horário do procedimento marcado");
    }

    private String validacao(String valor, String campo){
        Objects.requireNonNull(valor, campo + "Por favor, digite a informação solicitada");
        if (valor.trim().isEmpty()){
            throw new IllegalArgumentException(campo + "Não pode ser vazio.");
        }return valor;
    }

    public LocalTime gethorarioProcedimento(){
        return horarioProcedimento;
    }

    public String getIdSolicitacao() {
        return idSolicitacao;
    }

        public Paciente getIdPaciente() {
            return paciente;
        }

    public String getMunicipioOrigem() {
        return municipioOrigem;
    }

    public String getMunicipioProcedimento() {
        return municipioProcedimento;
    }

    public LocalDate getDataViagem() {
        return dataViagem;
    }

    public AcompanhanteDTO getAcompanhate() {
        if(acompanhate != null){
            return acompanhate;
        }else{
            return null;
        }
    }

    public LocalTime getHorarioProcedimento() {
        return horarioProcedimento;
    }

        public boolean isNecessitaVeiculoAdaptado() {
            return necessitaVeiculoAdaptado;
        }

        
}
