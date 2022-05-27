package provedores;

public interface ProvedorFrete {
    public abstract Frete calcularFrete(double peso, double valor);
    public TipoProvedorFrete obterTipoProvedorFrete();
}
