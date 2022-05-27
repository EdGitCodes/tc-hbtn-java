import atividades.*;

import java.util.ArrayList;
import java.util.List;


public class Workflow {

    List <Atividade> atividades = new ArrayList<Atividade>();
    public void registrarAtividade(Atividade atividade) {
        atividade.executar();
    }

}
