package contenido;

import java.util.ArrayList;
import java.util.List;

// Relación de AGREGACIÓN con Actor
public class Pelicula extends ContenidoAudiovisual {

    private int duracionMinutos;
      private String genero;
      private List<Actor> actores;

    public Pelicula(String titulo, int anio, String idioma,
                                        int duracionMinutos, String genero) {
              super(titulo, anio, idioma);
              this.duracionMinutos = duracionMinutos;
              this.genero = genero;
              this.actores = new ArrayList<>();
    }

    public int getDuracionMinutos() {
              return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
              this.duracionMinutos = duracionMinutos;
    }

    public String getGenero() {
              return genero;
    }

    public void setGenero(String genero) {
              this.genero = genero;
    }

    public List<Actor> getActores() {
              return actores;
    }

    public void agregarActor(Actor actor) {
              actores.add(actor);
    }

    @Override
      public void mostrarInfo() {
                System.out.println("=== PELÍCULA ===");
                System.out.println("Título: " + getTitulo());
                System.out.println("Año: " + getAnio());
                System.out.println("Idioma: " + getIdioma());
                System.out.println("Duración: " + duracionMinutos + " minutos");
                System.out.println("Género: " + genero);
                System.out.println("Actores:");
                for (Actor a : actores) {
                              System.out.println(" - " + a.getNombre());
                }
      }
}
