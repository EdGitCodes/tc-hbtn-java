package provedores;

public class Loggi implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double total) {
        double valor = 0;
        if(peso >= 5000){
            valor = total*0.12;
        } else {
            valor = total*0.04;
        }
        return new Frete (valor, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
