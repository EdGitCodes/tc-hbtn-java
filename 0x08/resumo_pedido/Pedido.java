import provedores.Frete;

public class Pedido {

    protected int codigo;

    protected int peso;
    protected double total;
    protected Frete frete;


    public Pedido(int codigo, int peso, double total) {
        this.peso = peso;
        this.codigo = codigo;
        this.total = total;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public int getPeso() {
        return peso;
    }

    public double getTotal() {
        return total;
    }

}
