import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] valor) {
        TreeSet<Integer> contagem = new TreeSet<>();
        HashSet<Integer> trigo = new HashSet<>();

        for(int i = 0; i < valor.length; i++){
            if(trigo.add(valor[i]) == false) {
                contagem.add(valor[i]);
            }
        }
        return contagem;
    }
}
