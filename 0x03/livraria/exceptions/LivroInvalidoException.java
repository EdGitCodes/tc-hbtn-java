package exceptions;

public class LivroInvalidoException extends Exception{

    public LivroInvalidoException(String titulo) {
        System.out.println("Titulo de livro invalido");
    }

    public LivroInvalidoException(double preco) {
        System.out.println("Preco de livro invalido");
    }
}
