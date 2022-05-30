import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipularArrayNumeros {

    private static List<Integer> list = new ArrayList<>();
    public static void adicionarNumero(List<Integer> numeros, int valor) throws Exception {
            if(buscarPosicaoNumero(numeros,valor) == -1){
            numeros.add(valor);
            }else {
                throw new Exception("Numero jah contido na lista");
            }
        }

    public static Integer buscarPosicaoNumero(List<Integer> numeros, int valor) {
        return numeros.indexOf(valor);
    }

    public static void removerNumero(List<Integer> numeros, int valor) throws Exception {
        if(buscarPosicaoNumero(numeros , valor) != -1){
            numeros.removeAll(Collections.singleton(valor));
        }else{
            throw new Exception("Numero nao encontrado na lista");
        }
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        if(buscarPosicaoNumero(numeros, numeroSubstituir) != -1){
            numeros.set(buscarPosicaoNumero(numeros, numeroSubstituir), numeroSubstituto);
        }else{
            numeros.add(numeroSubstituto);
        }
    }
}
