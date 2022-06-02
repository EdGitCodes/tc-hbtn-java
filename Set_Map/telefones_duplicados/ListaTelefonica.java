import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {

    HashMap<String, HashSet<Telefone>> listaTelefonica;
    public ListaTelefonica() {
        this.listaTelefonica = new HashMap<>();
    }


    public void adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> telefones = new HashSet<Telefone>();
        telefones.add(telefone);
        if(listaTelefonica.containsKey(nome)){
            if(listaTelefonica.get(nome).contains(telefone)){
                throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }
            for(String i: listaTelefonica.keySet()){
                if(listaTelefonica.get(i).contains(telefone)){
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
            listaTelefonica.get(nome).add(telefone);
        }else{
         listaTelefonica.put(nome, telefones);
        }
    }

    public HashSet<Telefone> buscar(String nome) {

       return listaTelefonica.get(nome);
    }
}