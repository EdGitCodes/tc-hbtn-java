public class PrintStringConcat {
    public static void main(String[] args) {
        String texto = new String ("Holberton School");
        System.out.print (texto + "\n" + texto + "\n" + texto.substring(10));
    }
};