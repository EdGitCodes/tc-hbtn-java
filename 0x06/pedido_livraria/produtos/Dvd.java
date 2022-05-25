
import pedido_livraria.produtos.Produto;

public class Dvd extends Produto {

    private String diretor;
    private String genero;
    private int duracao;
    private double precoLiquido;

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {

        super(titulo, ano, pais, precoBruto);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;

    }

    public String getDiretor() {
        return diretor;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public double obterPrecoLiquido() {
        this.precoLiquido = getPrecoBruto()+(getPrecoBruto()*0.20);
        return precoLiquido;
    }
}
