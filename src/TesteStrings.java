import java.text.NumberFormat;
import java.util.*;


public class TesteStrings {
    public static void main(String[] args) {

        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale localeBR = new Locale("pt","BR");

        NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        String valors = new String (dinheiro.format(valor));
        String valor1 = valors.substring(0,6).replace(".",",");
        String valor2 = valors.substring(6,11).replace(",",".");
        String valorfinal = valor1+valor2;
        System.out.println("Valor: " + valorfinal);
        System.out.println("Taxa: 0." + percentual.format(taxa));
    }
}