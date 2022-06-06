public class Post implements Comparable{

    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;


    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.categoria = categoria;
        this.corpo = corpo;
        this.titulo = titulo;
    }

    @Override
    public String toString(){
        return (getTitulo());
    }
    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    @Override
    public int compareTo(Object o) {
        Post comparePost = (Post) o;
        return this.getTitulo().compareTo(comparePost.getTitulo());
    }
}
