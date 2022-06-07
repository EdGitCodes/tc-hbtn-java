public class Departamento {

    private double valorMeta;
    private double valorAtingidoMeta;
    public Departamento(double valorMeta, double valorAtingigidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingigidoMeta;
    }

    public boolean alcancouMeta(){
        if (valorMeta < valorAtingidoMeta) return true;
        return false;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }
}
