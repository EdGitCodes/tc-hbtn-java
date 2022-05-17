public class InteiroPositivo {

    private int valor;

    public InteiroPositivo (String valor) {
        if (Integer.parseInt(valor) > 0){
            this.valor = Integer.parseInt(valor);
        }else {
            exception();
        }
    }
    public InteiroPositivo (int valor) {
        if (valor > 0){
            this.valor = valor;
        }else {
            exception();
        }
    }

    public void exception (){
        throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if(valor > 0){
            this.valor = valor;
        }else{
            exception();
        }
    }

    public boolean ehPrimo() {
        int div = 0;
        for (int i = 1; i <= getValor() ; i++) {
            if (getValor()%i == 0 ){
                div++;
            }
        }
        if (div == 2 ){
            return true;
        }else{
            return false;
        }
    }
}
