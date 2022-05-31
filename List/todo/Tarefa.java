public class Tarefa {

    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) throws Exception {
        this.modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public void modificarDescricao(String descricao) throws Exception {
        if(descricao.equals(null) || descricao.equals("")){
            throw new java.lang.IllegalArgumentException("Descricao de tarefa invalida");
        }else{
            this.descricao = descricao;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

}
