package padroes_de_projeto.app.DTO;
import java.time.LocalDate;
import java.util.Objects;
import java.time.LocalTime;

public class SolicitacaoDTO {
    private final String idSolicitacao;
    private final String idPaciente;
    private final String municipioOrigem;
    private final String municipioProcedimento;
    private final LocalDate dataViagem;
    private final AcompanhanteDTO acompanhate;
    private final LocalTime horarioProcedimento;

    public SolicitacaoDTO(LocalTime horarioProcedimento, String idSolicitacao, 
        String idPaciente, 
        String municipioOrigem,
        String municipioProcedimento,
        LocalDate dataViagem,
        AcompanhanteDTO acompanhate){

        this.idPaciente = validacao(idPaciente, "ID do paciente");
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

        public String getIdPaciente() {
            return idPaciente;
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

}
