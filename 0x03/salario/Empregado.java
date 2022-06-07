public class Empregado {

    private double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {

        if(departamento.alcancouMeta()){
            double bonus = getSalarioFixo()*0.10;
            return bonus;
        }

        return 0;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return salarioFixo+calcularBonus(departamento);
    }
}
