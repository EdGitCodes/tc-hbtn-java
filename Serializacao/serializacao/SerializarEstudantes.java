import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes <Estudante>{

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {

        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(getNomeArquivo());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(estudantes);

        } catch (Exception e) {
            System.out.println("Nao foi possivel serializar");
        }
    }
    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar(){

        List<Estudante> lista = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(getNomeArquivo());
            ois = new ObjectInputStream(fis);
            lista  = (List<Estudante>)ois.readObject();

        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }finally {
            if(ois != null) {

                return lista;
            }
        }
        return lista;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }
}
