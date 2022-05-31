import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<Tarefa>();
    }
    public void adicionarTarefa(Tarefa tarefa) throws Exception {
        for(Tarefa i: tarefas){
            if(i.getIdentificador() == tarefa.getIdentificador()){
                throw new IllegalArgumentException("Tarefa com identificador" + i.getIdentificador() + "ja existente na lista");
            }
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa i : tarefas) {
            if (i.getIdentificador() == identificador) {
                i.setEstahFeita(true);
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (Tarefa i : tarefas) {
            if (i.getIdentificador() == identificador) {
                i.setEstahFeita(false);
            }
        }
        return true;
    }



    public void desfazerTodas() {
        for(Tarefa i: tarefas){
                i.setEstahFeita(false);
            }
        }


    public void fazerTodas() {
        for(Tarefa i: tarefas){
                i.setEstahFeita(true);
        }
    }


    public void listarTarefas() {
        for(Tarefa l: tarefas) {
            if(l.isEstahFeita()) {
                System.out.print("[X] ");
            }else{
                System.out.print("[ ] ");
            }
            System.out.printf("Id: %d - Descricao: %s\n", l.getIdentificador(), l.getDescricao());
        }
    }
}



