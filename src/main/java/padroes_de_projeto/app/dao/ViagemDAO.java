package padroes_de_projeto.app.dao;

import padroes_de_projeto.app.base.Viagem;
import padroes_de_projeto.app.base.Mensagem;

public interface ViagemDAO {
    Mensagem enviarMensagem(Viagem viagem);
}
