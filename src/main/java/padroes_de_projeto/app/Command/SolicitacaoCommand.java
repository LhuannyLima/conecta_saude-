package padroes_de_projeto.app.Command;

import padroes_de_projeto.app.base.*;
import padroes_de_projeto.app.ConectaSaudeFacade.facade;
import padroes_de_projeto.app.DTO.SolicitacaoDTO;

import java.util.Objects;

public class SolicitacaoCommand implements Command {
    private final ConectaSaudeFacade facade; //nome provisório
    private final SolicitacaoDTO dto;
    
    public SolicitacaoCommand(ConectaSaudeFacade facade, SolicitacaoDTO dto){
        this.facade = Objects.requireNonNull(facade, "Facade, não pode ser nulo!");
        this.dto = Objects.requireNonNull(dto, "DTO, não pode ser nulo!");
    }

    @Override 
    public void execute(){
        facade.solicitarViagem(dto);
    }
}
