import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> celular = new ArrayList<Contato>();

    public int obterPosicaoContato(String nome){
        for(Contato i: celular) {
            if(i.getNome().equals(nome)){
            return celular.indexOf(i);
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato) {
        if(obterPosicaoContato(contato.getNome()) == -1) {
                celular.add(contato);
        }else{
                throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contato, Contato numeroNovo) {
        if(obterPosicaoContato(contato.getNome()) == -1 ){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }else if(obterPosicaoContato(contato.getNumero()) != -1  && obterPosicaoContato(contato.getNome()) != obterPosicaoContato(numeroNovo.getNome())){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
            celular.set(obterPosicaoContato(contato.getNome()) , numeroNovo);
    }


    public void removerContato(Contato contato) {
        if(obterPosicaoContato(contato.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }else{
            celular.remove(obterPosicaoContato(contato.getNome()));
        }
    }


    public void listarContatos() {
        for(Contato i: celular){
            System.out.println(i.getNome() + " -> " + i.getNumero() + " (" + i.getTipo() +")" );
        }
    }
}

