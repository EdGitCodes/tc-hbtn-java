package pedido_livraria;

import pedido_livraria.produtos.ItemPedido;
import pedido_livraria.produtos.Livro;

public class Pedido {

    protected ItemPedido[] itens;
    private double percentualDesconto;

    public Pedido(int percentualDesconto, ItemPedido[] itens){
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double valorTotal=0;
        for (ItemPedido itemPedido : itens) {
            valorTotal = valorTotal+(itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido());

        }
        valorTotal = valorTotal - ((percentualDesconto / 100)* valorTotal);
        return valorTotal;
    }

}
