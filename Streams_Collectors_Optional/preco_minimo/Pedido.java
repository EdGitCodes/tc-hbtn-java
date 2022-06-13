import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int codigo;
    private List<Produto> produto = new ArrayList<>();
    private Cliente cliente;


    public Pedido(int codigo, List<Produto> produto , Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.produto = produto;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
