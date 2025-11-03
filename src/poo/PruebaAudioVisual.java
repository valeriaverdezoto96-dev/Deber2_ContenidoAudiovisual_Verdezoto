package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("The Hunger Games", 140, "Acción/Aventura", "Color Force");
        contenidos[1] = new SerieDeTV("The Walking Dead", 60, "Horror", 8);
        contenidos[2] = new Documental("No Other Land", 95, "Historia", "Guerra");
        contenidos[3] = new Linkedin("Innovación Empresarial", 10, "Educativo", "Laura Torres", "LinkedIn Learning", 1200);
        
        Tiktok tiktok = new Tiktok("Baile Viral", 14, "Entretenimiento", "Lupita Villalobos", 7000000);
        tiktok.agregarHashtag("#Dance");
        tiktok.agregarHashtag("#Trend");
        contenidos[4] = tiktok;

        if (contenidos[0] instanceof Pelicula) {
            Pelicula peli = (Pelicula) contenidos[0];
            peli.agregarActor(new Actor("Jennifer Lawrence", 35, "EE.UU"));
            peli.agregarActor(new Actor("Josh Hutcherson", 33, "EE.UU."));
        }
        
        if (contenidos[1] instanceof SerieDeTV) {
            SerieDeTV serie = (SerieDeTV) contenidos[1];
            serie.agregarTemporada(new Temporada(1, 6));
            serie.agregarTemporada(new Temporada(2, 13));
            serie.agregarTemporada(new Temporada(3, 16));
        }
        
        if (contenidos[2] instanceof Documental) {
            Documental doc = (Documental) contenidos[2];
            doc.asignarInvestigador(new Investigador("Hamdan Ballal", "Cineasta", 36));
        }
        
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}