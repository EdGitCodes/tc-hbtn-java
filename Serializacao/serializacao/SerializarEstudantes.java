import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<E> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(getNomeArquivo());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(estudantes);

        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel serializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        List<Estudante> lista = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(getNomeArquivo());
            ois = new ObjectInputStream(fis);
            lista  = (List<Estudante>)ois.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return lista;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }
}
