import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> todasPessoas) {

        //Direto no return para evitar declaração TreeMap<String, Treeset<Pessoa>
        //Pessoa::getCargo é uma lambda que puxa o cargo
        //() ->* novo TreeMap apenas para inverter a ordem
        return todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
                () -> new TreeMap<> (Comparator.reverseOrder()),
                Collectors.toCollection(TreeSet::new)));
    }
}
