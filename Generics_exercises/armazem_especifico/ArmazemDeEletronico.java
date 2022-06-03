import java.util.HashMap;
import java.util.Map;

public class ArmazemDeEletronico extends Armazem <Eletronico> {

    Map<String, Eletronico> mapa = new HashMap<>();
    @Override
    public void adicionarAoInventario(String nome, Eletronico valor) {

        this.mapa.put(nome, valor);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return mapa.get(nome);

    }
}
