package contenido;

import java.util.ArrayList;
import java.util.List;

// Relación de COMPOSICIÓN con Temporada
public class SerieDeTV extends ContenidoAudiovisual {

    private int cantidadEpisodios;
      private String plataforma;
      private boolean finalizada;
      private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int anio, String idioma,
                                          int cantidadEpisodios,
                                          String plataforma,
                                          boolean finalizada) {
              super(titulo, anio, idioma);
              this.cantidadEpisodios = cantidadEpisodios;
              this.plataforma = plataforma;
              this.finalizada = finalizada;
              this.temporadas = new ArrayList<>();
    }

    public int getCantidadEpisodios() {
              return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
              this.cantidadEpisodios = cantidadEpisodios;
    }

    public String getPlataforma() {
              return plataforma;
    }

    public void setPlataforma(String plataforma) {
              this.plataforma = plataforma;
    }

    public boolean isFinalizada() {
              return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
              this.finalizada = finalizada;
    }

    public List<Temporada> getTemporadas() {
              return temporadas;
    }

    public void agregarTemporada(Temporada temporada) {
              temporadas.add(temporada);
    }

    @Override
      public void mostrarInfo() {
                System.out.println("=== SERIE DE TV ===");
                System.out.println("Título: " + getTitulo());
                System.out.println("Año: " + getAnio());
                System.out.println("Idioma: " + getIdioma());
                System.out.println("Episodios: " + cantidadEpisodios);
                System.out.println("Plataforma: " + plataforma);
                System.out.println("Finalizada: " + (finalizada ? "Sí" : "No"));
                System.out.println("Temporadas:");
                for (Temporada t : temporadas) {
                              System.out.println(
                                                " - Temporada " + t.getNumero() +
                                                " (" + t.getCantidadEpisodios() + " episodios)"
                                            );
                }
      }
}
