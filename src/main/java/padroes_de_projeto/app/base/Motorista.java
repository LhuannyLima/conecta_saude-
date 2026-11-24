package padroes_de_projeto.app.base;

public class Motorista extends Usuario {

   
    private int codigoIdentificacao;
    private boolean possuiVeiculoAdaptado;


    public Motorista(){}

    public Motorista(boolean possuiVeiculoAdaptado, String nome, String telefone, long id, int codigoIdentificacao){
        super(id, nome, telefone);
        this.possuiVeiculoAdaptado = possuiVeiculoAdaptado;
        this.codigoIdentificacao = codigoIdentificacao;
    }

    
    public int getCodigoIndentificacaoMotorista(){
        return codigoIdentificacao;
    }

  
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