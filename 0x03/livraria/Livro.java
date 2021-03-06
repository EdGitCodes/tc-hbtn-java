import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;
    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException , AutorInvalidoException{
        setAutor(autor);
        setPreco(preco);
        setTitulo(titulo);
    }

    public String getTitulo(){
        return titulo;

    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if(titulo.length() < 3){
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        String[] separar = autor.split(" ");
        int contagemNomes = 0;
        for(int i = 0; i < separar.length; i++){
            contagemNomes++;
        }
        if(contagemNomes < 2){
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }

    public double getPreco() throws LivroInvalidoException {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        if(preco <= 0){
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }

}
