package contenido;

import java.util.ArrayList;
import java.util.List;

// Subclase propia que hereda de ContenidoAudiovisual
public class Cortometraje extends ContenidoAudiovisual {

    private String director;
      private String productora;
      private boolean esAnimado;
      private List<String> festivales;

    public Cortometraje(String titulo,
                                                int anio,
                                                String idioma,
                                                String director,
                                                String productora,
                                                boolean esAnimado) {
              super(titulo, anio, idioma);
              this.director = director;
              this.productora = productora;
              this.esAnimado = esAnimado;
              this.festivales = new ArrayList<>();
    }

    public String getDirector() {
              return director;
    }

    public void setDirector(String director) {
              this.director = director;
    }

    public String getProductora() {
              return productora;
    }

    public void setProductora(String productora) {
              this.productora = productora;
    }

    public boolean isEsAnimado() {
              return esAnimado;
    }

    public void setEsAnimado(boolean esAnimado) {
              this.esAnimado = esAnimado;
    }

    public List<String> getFestivales() {
              return festivales;
    }

    public void participarEnFestival(String festival) {
              festivales.add(festival);
    }

    @Override
      public void mostrarInfo() {
                System.out.println("=== CORTOMETRAJE ===");
                System.out.println("Título: " + getTitulo());
                System.out.println("Año: " + getAnio());
                System.out.println("Idioma: " + getIdioma());
                System.out.println("Director: " + director);
                System.out.println("Productora: " + productora);
                System.out.println("Animado: "
                                                   + (esAnimado ? "Sí" : "No"));
                System.out.println("Festivales participantes:");
                if (festivales.isEmpty()) {
                              System.out.println(" - Ninguno");
                } else {
                              for (String festival : festivales) {
                                                System.out.println(" - " + festival);
                              }
                }
      }
}
