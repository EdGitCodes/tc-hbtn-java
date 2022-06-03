import java.util.HashMap;
import java.util.Map;

public class ArmazemDeComida  extends Armazem<Comida>{

    Map<String, Comida> mapa = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, Comida valor) {
        this.mapa.put(nome, valor);
    }

    @Override
    public Comida obterDoInventario(String nome) {
        return this.mapa.get(nome);

    }
}
