package padroes_de_projeto.app.command;

import padroes_de_projeto.app.base.*;
import padroes_de_projeto.app.TFDFacade;
import padroes_de_projeto.app.dto.MensagemDaViagemDTO;
import padroes_de_projeto.app.dto.SolicitacaoDTO;

import java.util.Objects;

public class MensagensCommand  implements Command{
    private final TFDFacade facade; 
    private final MensagemDaViagemDTO dto;
    
    public MensagensCommand(TFDFacade facade, MensagemDaViagemDTO dto){
        this.facade = Objects.requireNonNull(facade, "Facade, não pode ser nulo!");
        this.dto = Objects.requireNonNull(dto, "DTO, não pode ser nulo!");
    }

    @Override 
    public void execute(){
        // facade.enviarMensagem(dto);
        facade.enviarMensagem(new Viagem());
    }
}
