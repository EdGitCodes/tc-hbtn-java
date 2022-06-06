import java.util.*;

public class Blog {

    private ArrayList<Post> listPostagem = new ArrayList<Post>();
    public void adicionarPostagem(Post post) {

        this.listPostagem.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> sortedList = new TreeSet<>();
        for(Post i: listPostagem){
            if(!i.getAutor().equals(null)){
                sortedList.add(i.getAutor());
            }
        }
        return sortedList;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> postagens = new TreeMap<>();
        ArrayList<String> categoria= new ArrayList<>();
        for(Post x: listPostagem){
            categoria.add(x.getCategoria());
            postagens.put(x.getCategoria(), Collections.frequency(categoria, x.getCategoria()));
        }

    return postagens;
    }
}
