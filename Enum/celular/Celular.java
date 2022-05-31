import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public int obterPosicaoContato(String nome){
        for(Contato i: contatos) {
            if(i.getNome().equals(nome)){
            return contatos.indexOf(i);
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato) {
        if(obterPosicaoContato(contato.getNome()) == -1) {
                contatos.add(contato);
        }else{
                throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        if (obterPosicaoContato(contatoAntigo.getNome()) == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        } else if (obterPosicaoContato(novoContato.getNome()) != -1 && obterPosicaoContato(novoContato.getNome()) != obterPosicaoContato(contatoAntigo.getNome())) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
        contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);
    }


    public void removerContato(Contato contato) {
        if(obterPosicaoContato(contato.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }else{
            contatos.remove(obterPosicaoContato(contato.getNome()));
        }
    }


    public void listarContatos() {
        for(Contato i: contatos){
            System.out.println(i.getNome() + " -> " + i.getNumero() + " (" + i.getTipo() +")" );
        }
    }
}

