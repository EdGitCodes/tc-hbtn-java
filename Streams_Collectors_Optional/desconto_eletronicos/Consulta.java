import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

        List<Produto> pedidoFiltro = pedido.getProdutos().stream()
                .filter(pedidos -> pedidos.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());

        return pedidoFiltro;
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedido) {

               List<Pedido> pedidoRetorno = pedido.stream().filter(ped -> ped.getProdutos().stream()
                        .anyMatch(x -> x.getCategoria().equals(CategoriaProduto.ELETRONICO)))
                        .collect(Collectors.toList());

        return pedidoRetorno;
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

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produto){
        List<Produto> listReturn = produto.stream().map(produtos -> {
            produtos.setPreco(produtos.getPreco()*0.85);
            return produtos;
        }).collect(Collectors.toList());
        return listReturn;
    }
}
