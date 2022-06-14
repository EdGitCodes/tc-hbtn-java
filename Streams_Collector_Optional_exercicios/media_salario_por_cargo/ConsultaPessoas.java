import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> todasPessoas) {

        return todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(Pessoa::getSalario)));
    }
}
