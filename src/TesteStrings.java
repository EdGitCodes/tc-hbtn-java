import java.text.NumberFormat;
import java.util.*;
import java.math.*;


public class TesteStrings {
    public static void main(String[] args) {

        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale localeBR = new Locale("en","US");

        NumberFormat dinheiro = NumberFormat.getInstance(localeBR);
        dinheiro.setMaximumFractionDigits(2);
        System.out.println("Valor: R$ " + dinheiro.format(valor));
        System.out.printf("Taxa: %.02f%%", taxa);

    }
}