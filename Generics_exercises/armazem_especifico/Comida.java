public class Comida{

    private String nome;
    private double calorias;
    private double preco;

    public Comida(String comida, double calorias, double preco) {
        this.nome = comida;
        this.calorias =  calorias;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return (String.format("[%s] %f R$ %f",getNome(), getCalorias(),getPreco()) );
    }

    public String getNome() {
        return nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getPreco() {
        return preco;
    }


}
