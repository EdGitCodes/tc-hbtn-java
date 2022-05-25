package pedido_livraria;

public class ItemPedido {

    protected int quantidade;

    protected Produto produto;

    public ItemPedido(Produto produto, int quantidade){
        super();
        this.produto = produto;
        this.quantidade += quantidade;

    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
