import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

        List<Produto> pedidoFiltro = pedido.getProduto().stream()
                .filter(pedidos -> pedidos.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

        return pedidoFiltro;
    }
}
