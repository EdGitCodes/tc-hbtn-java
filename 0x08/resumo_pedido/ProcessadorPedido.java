import provedores.ProvedorFrete;
import provedores.Sedex;

public class ProcessadorPedido {

    protected ProvedorFrete provedorFrete;
    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
        pedido.setFrete(this.provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));

    }
}
