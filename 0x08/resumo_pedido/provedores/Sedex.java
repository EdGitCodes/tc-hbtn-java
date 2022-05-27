package provedores;

public class Sedex implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double total) {
        double valor = 0;
        if(peso >= 1000) {
            valor = total * 0.1;
        }else {
            valor = total * 0.05;
        }
        return new Frete (valor, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
