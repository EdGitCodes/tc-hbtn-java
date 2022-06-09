import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos{

    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterio) {
        List<Produto> listaFiltrada = new ArrayList<>();
        for(Produto i: produtos){
            if(criterio.test(i)){
                listaFiltrada.add(i);
            }
        }
        return listaFiltrada;
        }

}
