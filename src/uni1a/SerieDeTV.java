/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;
// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
	private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }
    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de Televisión:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración promedio por episodio: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas:");

        if (temporadas.isEmpty()) {
            System.out.println("  (No hay temporadas registradas)");
        } else {
            for (Temporada t : temporadas) {
                System.out.println("  - " + t);
            }
        }
        System.out.println();
    }
}
