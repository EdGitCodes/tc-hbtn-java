import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {

        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale localeBR = new Locale("pt","BR");

        NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("Valor: " + dinheiro.format(valor));
        System.out.println("Taxa: " + percentual.format(taxa));
    }
}