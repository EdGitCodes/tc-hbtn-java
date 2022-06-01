import java.util.ArrayList;

public class Banco{

    private String nome;
    private ArrayList<Agencia> agencias;


    public Banco(String nome) {
        this.nome = nome;
        agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nome){
        for(Agencia i: agencias) {
            if(i.getNome().equals(nome)){
                return i;
            }
        }
        return null;
    }
    public boolean adicionarAgencia(String agencia) {

            if(buscarAgencia(agencia) == null){
                this.agencias.add(new Agencia(agencia));
                return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String agencia, String nome, double valor) {
        Agencia i = buscarAgencia(agencia);
        if(i != null){
            Cliente j = i.buscarCliente(nome);
            if(j != null){
                j.adicionarTransacao(valor);
                return true;
            }
        }
        return false;
    }

    public boolean adicionarCliente(String nomeA, String nomeC, double valor){
        Agencia i = buscarAgencia(nomeA);
            if (i != null && i.buscarCliente(nomeC) == null) {
                i.novoCliente(nomeC, valor);
                return true;
            }
        return false;
    }

    public boolean listarClientes(String agencia, boolean imprime) {
        Agencia i = buscarAgencia(agencia);
        if(i != null){
            for (int j = 0; j < i.getClientes().size(); j++) {
                if(imprime){
                printCompleto(i.getClientes().get(j), j);
                }else{
                    printReduzido(i.getClientes().get(j), j);
                }
            }
        }
        return false;
    }

    private void printCompleto(Cliente cliente, int index) {
        System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), index+1);
        for (int i=0; i < cliente.getTransacoes().size(); i++) {
            System.out.printf("  [%d] valor %.2f\n", i+1, cliente.getTransacoes().get(i));
        }
    }

    private void printReduzido(Cliente cliente, int index) {
        System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), index+1);
    }
}




