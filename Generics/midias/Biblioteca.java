import java.util.ArrayList;

public class Biblioteca <T> extends Midia{

    private ArrayList<T> lista = new ArrayList<T>();
    public void adicionarMidia(T livro) {
        lista.add(livro);
    }


    public ArrayList<T> obterListaMidias() {
        return lista;
    }
}
