public class Empregado {

    private String nome;
    private int codigo;
    private Endereco endereco;

    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public void apresentar(){

        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Pais: " + endereco.getPais());

    }

    public String getNome(){
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
}
