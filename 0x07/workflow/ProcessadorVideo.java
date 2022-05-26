import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {

    List<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

    public void registrarCanal(CanalNotificacao valor){
        canais.add(valor);
    }

    public void processar(Video video) {
        String mensagParametro = video.getArquivo() + " - " + video.formato;
        Mensagem mensagem = new Mensagem(mensagParametro , TipoMensagem.LOG);
        for (CanalNotificacao canal: canais ) {
            canal.notificar(mensagem);
        }
    }
}
