import java.util.*;

public class Blog {

    List<Post> list = new ArrayList<>();
    public void adicionarPostagem(Post list) {

        this.list.add(list);
    }

    public Set<String> obterTodosAutores() {
        Set<String> sortedList = new TreeSet<>();
        for(Post i: list){
            if(!i.getAutor().equals(null)){
                sortedList.add(i.getAutor());
            }
        }
        return sortedList;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> postagens = new TreeMap<>();
        ArrayList<String> categoria= new ArrayList<>();
        for(Post x: list){
            categoria.add(x.getCategoria());
            postagens.put(x.getCategoria(), Collections.frequency(categoria, x.getCategoria()));
        }

    return postagens;
    }
}
