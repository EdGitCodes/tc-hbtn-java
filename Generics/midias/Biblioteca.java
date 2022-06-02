import java.util.ArrayList;

public class Biblioteca <Midia>{

    private ArrayList<Midia> lista = new ArrayList<Midia>();
    public void adicionarMidia(Midia livro) {
        lista.add(livro);
    }


    public ArrayList<Midia> obterListaMidias() {
        return lista;
    }
}
