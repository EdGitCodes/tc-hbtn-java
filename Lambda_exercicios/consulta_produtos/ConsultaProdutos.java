import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos{

    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterio) {
        List<Produto> listaFiltrada = new ArrayList<>();
        for(Produto i: produtos){
            if(criterio.testar(i)){
                listaFiltrada.add(i);
            }
        }
        return listaFiltrada;
        }

}
