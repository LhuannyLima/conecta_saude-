package base;

// Classe que representa o motorista e herda os dados de Usuario
public class Motorista extends Usuario {

    // Código de identificação do motorista
    private int codigoIdentificacao;

    // Informa se o motorista possui veículo adaptado
    private boolean possuiVeiculoAdaptado;

    // Construtor vazio
    public Motorista(){}

    // Construtor que recebe os dados do motorista
    public Motorista(String nome, String telefone, long id, int codigoIdentificacao){

        // Chama o construtor da classe Usuario para definir os dados herdados
        super(id, nome, telefone);

        // Define o código de identificação do motorista
        this.codigoIdentificacao = codigoIdentificacao;
    }

    // Retorna o código de identificação do motorista
    public int getCodigoIndentificacaoMotorista(){
        return codigoIdentificacao;
    }

    // Define o código de identificação do motorista
    public void setCodigoIndentificacaoMotorista(int codigoIdentificacao){
        this.codigoIdentificacao = codigoIdentificacao;
    }

    // Verifica se o motorista possui veículo adaptado
    public boolean isPossuiVeiculoAdaptado() {
        return possuiVeiculoAdaptado;
    }

    // Define se o motorista possui veículo adaptado
    public void setPossuiVeiculoAdaptado(boolean possuiVeiculoAdaptado) {
        this.possuiVeiculoAdaptado = possuiVeiculoAdaptado;
    }
}