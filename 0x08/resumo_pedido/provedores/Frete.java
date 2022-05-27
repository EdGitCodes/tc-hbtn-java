package provedores;

public class Frete {

    protected TipoProvedorFrete tipoProvedorFrete;
    protected double valor;

    public Frete(double valor, TipoProvedorFrete tipoProvedorFrete) {
        this.valor = valor;
        this.tipoProvedorFrete =   tipoProvedorFrete;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    public double getValor() {
        return valor;
    }


}
