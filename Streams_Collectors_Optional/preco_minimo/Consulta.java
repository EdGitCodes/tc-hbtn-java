import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

        List<Produto> pedidoFiltro = pedido.getProdutos().stream()
                .filter(pedidos -> pedidos.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

        return pedidoFiltro;
    }

        public static Produto obterProdutoMaiorPreco(List<Produto> produtos){

            Produto pedidoMaior = produtos.stream()
                .max(Comparator.comparing(pedidos -> pedidos.getPreco())).get();

        return pedidoMaior;
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double parametro){

        List<Produto> pedidoMinimo = produtos.stream()
                .filter(preco -> preco.getPreco() >= parametro).collect(Collectors.toList());

        return pedidoMinimo;
    }

}
