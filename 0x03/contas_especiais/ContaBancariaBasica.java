import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;
    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor > 0){
            this.saldo += valor;
        }else{
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor < 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }else if(valor > getSaldo()){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }else{
            this.saldo = saldo - valor;
        }
    }

    public double calcularTarifaMensal(){
        double tarifa = 10;
        if(tarifa < (getSaldo()*0.1)){
            return tarifa;
        }
        return (getSaldo()*0.1);
    }

    public double calcularJurosMensal(){
        double jurosMensal = (getTaxaJurosAnual()/12)/100;
        if(getSaldo() < 0) {
            return 0;
        }else{
        return jurosMensal*saldo;
        }
    }

    public void aplicarAtualizacaoMensal() {
        if(saldo > 0){
        this.saldo = (saldo - calcularTarifaMensal()) + calcularJurosMensal();
        }
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
