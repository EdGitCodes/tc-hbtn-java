public class Telefone {
    private String codigoArea;
    private String numero;
    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }
    @Override
    public String toString(){
        return ("("+ getCodigoArea() +") " +  getNumero());
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }
}
