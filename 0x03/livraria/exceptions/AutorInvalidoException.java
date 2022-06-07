package exceptions;

public class AutorInvalidoException extends Exception{
    public AutorInvalidoException(String autor) {
        System.out.println("Nome de autor invalido");
    }
}
