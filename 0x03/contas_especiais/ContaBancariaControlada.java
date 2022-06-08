public class ContaBancariaControlada extends ContaBancariaBasica{

    private double saldoMinimo;
    private double valorPenalidade;


    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        if(getSaldo() < saldoMinimo && getSaldo() == 0) {
            setSaldo(getSaldo() - valorPenalidade);
        }else{
            setSaldo((getSaldo() - calcularTarifaMensal()) + calcularJurosMensal() - valorPenalidade);
        }
    }
}
