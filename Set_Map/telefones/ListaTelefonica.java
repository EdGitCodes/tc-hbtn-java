import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ListaTelefonica {

    HashMap<String, ArrayList<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        this.listaTelefonica = new HashMap<>();
    }


    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> telefones = listaTelefonica.get(nome);

        if(telefones == null) {
            telefones = new ArrayList<Telefone>();
            telefones.add(telefone);
            listaTelefonica.put(nome, telefones);
        }else{
            if(!telefones.contains(telefone)) telefones.add(telefone);
        }
    }

    public ArrayList<Telefone> buscar(String nome) {

        for(int i = 0; i < listaTelefonica.size(); i++){
            return listaTelefonica.get(nome);
        }
        return null;
    }
}
