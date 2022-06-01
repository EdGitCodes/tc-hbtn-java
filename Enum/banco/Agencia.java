import java.util.ArrayList;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        clientes = new ArrayList<Cliente>();
    }


    public boolean novoCliente(String nome, double valorInicial){

        if(buscarCliente(nome) == null){
            this.clientes.add(new Cliente(nome, valorInicial));
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String nome){
        for(Cliente i: clientes){
            if(i.getNome().equals(nome)){
                return i;
            }
        }
        return null;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valor) {
            Cliente i = buscarCliente(nomeCliente);
                if(i != null){
                    i.adicionarTransacao(valor);
                    return true;
                }
            return false;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }


}
