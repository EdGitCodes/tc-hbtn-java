
public class Email implements CanalNotificacao{
    @Override
    public void notificar(Mensagem mensagem) {

        System.out.printf("[EMAIL] {%s} - %s\n" , mensagem.tipoMensagem , mensagem.texto);
    }
}
