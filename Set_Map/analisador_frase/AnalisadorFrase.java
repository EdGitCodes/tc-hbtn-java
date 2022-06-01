import java.util.*;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String descricao) {
        TreeMap<String , Integer> contagem = new TreeMap<>();
        descricao = descricao.toLowerCase();
        String[] keys = descricao.split(" ");
        for(int i = 0; i < keys.length; i++ ){

            contagem.put(keys[i],Collections.frequency(List.of(keys), keys[i]));
        }
        return (contagem);
    }
}
