import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> todasPessoas) {

        return todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                         Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));
    }
}
