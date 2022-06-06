import java.util.*;

public class Blog {

    private List<Post> posts = new ArrayList<Post>();

    public void adicionarPostagem(Post post) {
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getTitulo().equals(post.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        this.posts.add(post);

    }


    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> postagens = new TreeMap<>();
        ArrayList<Categorias> categoria = new ArrayList<>();
        for (Post x : posts) {
            categoria.add(x.getCategoria());
            postagens.put(x.getCategoria(), Collections.frequency(categoria, x.getCategoria()));
        }
        return postagens;
    }

    public TreeSet<Autor> obterTodosAutores() {
        TreeSet<Autor> listAutor = new TreeSet<>();
        for (Post i : posts) {
            listAutor.add(i.getAutor());
        }
        return listAutor;
    }

    public TreeSet<Post> obterPostsPorAutor(Autor autor) {
        TreeSet<Post> listAutor = new TreeSet<Post>();
        for (Post i : posts) {
            if (i.getAutor().getNome().equals(autor.getNome())) {
                listAutor.add(i);
            }
        }
        return listAutor;
    }

    public TreeSet<Post> obterPostsPorCategoria(Categorias categoria) {
        TreeSet<Post> sortedList = new TreeSet<Post>();
        for (Post i : posts) {
            if (i.getCategoria().equals(categoria)) {
                sortedList.add(i);
            }
        }
        return sortedList;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> todosPosts = new TreeMap<>();
        for (Post i : posts) {
            todosPosts.put(i.getCategoria(), obterPostsPorCategoria(i.getCategoria()));
        }
        return todosPosts;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosPosts = new TreeMap<>();
        for (Post i : posts) {
            todosPosts.put(i.getAutor(), obterPostsPorAutor(i.getAutor()));
        }
        return todosPosts;
    }
}

