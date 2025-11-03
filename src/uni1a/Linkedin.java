package uni1a;

public class Linkedin extends ContenidoAudiovisual {
    private String autor;
    private String empresa;
    private int likes;

    public Linkedin(String titulo, int duracionEnMinutos, String genero, String autor, String empresa, int likes) {
        super(titulo, duracionEnMinutos, genero);
        this.autor = autor;
        this.empresa = empresa;
        this.likes = likes;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del contenido de LinkedIn:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Autor: " + autor);
        System.out.println("Empresa: " + empresa);
        System.out.println("Likes: " + likes);
        System.out.println();
    }
}
