import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> contato = new ArrayList<Contato>();

    public int obterPosicaoContato(String nome){
        for(Contato i: contato) {
            if(i.getNome().equals(nome)){
            return contato.indexOf(i);
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contatos) {
        if(obterPosicaoContato(contatos.getNome()) == -1) {
                contato.add(contatos);
        }else{
                throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contatos, Contato numeroNovo) {
        if(obterPosicaoContato(contatos.getNome()) == -1 ){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }else if(obterPosicaoContato(contatos.getNumero()) != -1  && obterPosicaoContato(contatos.getNome()) != obterPosicaoContato(numeroNovo.getNome())){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
            contato.set(obterPosicaoContato(contatos.getNome()) , numeroNovo);
    }


    public void removerContato(Contato contatos) {
        if(obterPosicaoContato(contatos.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }else{
            contato.remove(obterPosicaoContato(contatos.getNome()));
        }
    }


    public void listarContatos() {
        for(Contato i: contato){
            System.out.println(i.getNome() + " -> " + i.getNumero() + " (" + i.getTipo() +")" );
        }
    }
}

