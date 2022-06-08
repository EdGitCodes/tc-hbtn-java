import java.io.StringBufferInputStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkup = 0.10;

    Supplier<Double> precoComMarkup = () -> preco+(preco*(percentualMarkup));
    Consumer<Double> atualizarMarkup = (x) -> this.percentualMarkup = x/100;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }
}
