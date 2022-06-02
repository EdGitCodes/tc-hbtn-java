public class Midia <T>{

    private T nome;

    @Override
    public String toString(){
        return (String.format("Tipo: %s - Nome: %s", this.getClass().getName(), getNome()));
    }

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }
}
