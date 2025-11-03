package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Tiktok extends ContenidoAudiovisual {
    private String creador;
    private int seguidores;
    private List<String> hashtags;

    public Tiktok(String titulo, int duracionEnMinutos, String genero, String creador, int seguidores) {
        super(titulo, duracionEnMinutos, genero);
        this.creador = creador;
        this.seguidores = seguidores;
        this.hashtags = new ArrayList<>();
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void agregarHashtag(String hashtag) {
        hashtags.add(hashtag);
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del contenido de TikTok:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " seg");
        System.out.println("Género: " + getGenero());
        System.out.println("Creador: " + creador);
        System.out.println("Seguidores: " + seguidores);
        System.out.println("Hashtags: " + String.join(", ", hashtags));
        System.out.println();
    }
}

