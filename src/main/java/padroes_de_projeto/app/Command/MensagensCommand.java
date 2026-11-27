package padroes_de_projeto.app.Command;

import padroes_de_projeto.app.TFDFacade;
import padroes_de_projeto.app.DTO.MensagemDaViagemDTO;


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
        facade.enviarMensagemmMensagem(dto);
    }
}
