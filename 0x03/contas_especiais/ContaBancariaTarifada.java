import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica{

    private int quantidadeTransacoes = 0;

    public ContaBancariaTarifada(String numeracao , double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        double decrecimo = quantidadeTransacoes * 0.10;
        quantidadeTransacoes++;
        super.sacar(valor + decrecimo);
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        quantidadeTransacoes++;
        super.depositar(valor  - 0.10);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
