import java.util.HashMap;
import java.util.Map;

public class Armazem <T> implements Armazenavel<T>{

    Map<String, T> mapa = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        mapa.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return mapa.get(nome);

    }
}
