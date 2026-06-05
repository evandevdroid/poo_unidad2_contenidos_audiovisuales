package contenido;

import java.util.ArrayList;
import java.util.List;

// Relación de ASOCIACIÓN con Investigador
public class Documental extends ContenidoAudiovisual {

    private String tema;
      private String director;
      private List<Investigador> investigadores;

    public Documental(String titulo, int anio, String idioma,
                                            String tema, String director) {
              super(titulo, anio, idioma);
              this.tema = tema;
              this.director = director;
              this.investigadores = new ArrayList<>();
    }

    public String getTema() {
              return tema;
    }

    public void setTema(String tema) {
              this.tema = tema;
    }

    public String getDirector() {
              return director;
    }

    public void setDirector(String director) {
              this.director = director;
    }

    public List<Investigador> getInvestigadores() {
              return investigadores;
    }

    public void agregarInvestigador(Investigador investigador) {
              investigadores.add(investigador);
    }

    @Override
      public void mostrarInfo() {
                System.out.println("=== DOCUMENTAL ===");
                System.out.println("Título: " + getTitulo());
                System.out.println("Año: " + getAnio());
                System.out.println("Idioma: " + getIdioma());
                System.out.println("Tema: " + tema);
                System.out.println("Director: " + director);
                System.out.println("Investigadores:");
                for (Investigador i : investigadores) {
                              System.out.println(" - " + i.getNombre()
                                                                     + " (" + i.getEspecialidad() + ")");
                }
      }
}
