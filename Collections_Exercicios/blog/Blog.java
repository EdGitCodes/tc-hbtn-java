import java.util.*;

public class Blog {

    private List<Post> posts = new ArrayList<Post>();
    public void adicionarPostagem(Post post) {

        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> sortedList = new TreeSet<>();
        for(Post i: posts){
            if(!i.getAutor().equals(null)){
                sortedList.add(i.getAutor());
            }
        }
        return sortedList;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> postagens = new TreeMap<>();
        ArrayList<String> categoria= new ArrayList<>();
        for(Post x: posts){
            categoria.add(x.getCategoria());
            postagens.put(x.getCategoria(), Collections.frequency(categoria, x.getCategoria()));
        }

    return postagens;
    }
}
