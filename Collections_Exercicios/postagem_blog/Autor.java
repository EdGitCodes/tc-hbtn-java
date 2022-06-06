public class Autor implements Comparable{

    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString(){
        return (getNome() + getSobrenome());
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public int compareTo(Object o) {
        Autor compareAutor = (Autor) o;
        return this.getNome().compareTo(compareAutor.getNome());
    }
}
