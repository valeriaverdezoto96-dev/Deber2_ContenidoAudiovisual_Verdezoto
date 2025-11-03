package uni1a;

public class Investigador {
    private String nombre;
    private String especialidad;
    private int añosExperiencia;

    public Investigador(String nombre, String especialidad, int añosExperiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    @Override
    public String toString() {
        return nombre + " - " + especialidad + " (" + añosExperiencia + " años de experiencia)";
    }
}

