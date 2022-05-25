import produtos.Produto;

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

    public void apresentarResumoPedido(){
        double totalQuant = 0;
        double total = 0;
        double desc = 0;

        System.out.println("------- RESUMO PEDIDO -------");

        for (ItemPedido itemPedido : itens) {

            totalQuant = itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido();
            total += totalQuant;

            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %s  Total: %.2f\n" , itemPedido.getProduto().getClass().getSimpleName() ,
            itemPedido.getProduto().getTitulo() , itemPedido.getProduto().obterPrecoLiquido() , itemPedido.getQuantidade()
            , totalQuant);
        }
        desc = (percentualDesconto*total)/100;
        System.out.println("----------------------------");
        System.out.println("DESCONTO: " + String.format("%.2f",desc));
        System.out.println("TOTAL PRODUTOS: " + String.format("%.2f", (total)));
        System.out.println("----------------------------");
        System.out.println("TOTAL PRODUTOS: " + String.format("%.2f", (total - desc)));
        System.out.println("----------------------------");
    }
    
}
