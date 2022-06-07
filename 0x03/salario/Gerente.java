public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta()){
            double dif = (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
            double bonus = (getSalarioFixo()*0.20) + dif;
            return bonus;
        }

        return 0;
    }
}
