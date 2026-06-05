package contenido;

// Subclase propia que hereda de ContenidoAudiovisual
public class VideoYouTube extends ContenidoAudiovisual {

    private String canal;
      private long visualizaciones;
      private String categoria;
      private boolean tieneSubtitulos;

    public VideoYouTube(String titulo,
                                                int anio,
                                                String idioma,
                                                String canal,
                                                long visualizaciones,
                                                String categoria,
                                                boolean tieneSubtitulos) {
              super(titulo, anio, idioma);
              this.canal = canal;
              this.visualizaciones = visualizaciones;
              this.categoria = categoria;
              this.tieneSubtitulos = tieneSubtitulos;
    }

    public String getCanal() {
              return canal;
    }

    public void setCanal(String canal) {
              this.canal = canal;
    }

    public long getVisualizaciones() {
              return visualizaciones;
    }

    public void setVisualizaciones(long visualizaciones) {
              this.visualizaciones = visualizaciones;
    }

    public String getCategoria() {
              return categoria;
    }

    public void setCategoria(String categoria) {
              this.categoria = categoria;
    }

    public boolean isTieneSubtitulos() {
              return tieneSubtitulos;
    }

    public void setTieneSubtitulos(boolean tieneSubtitulos) {
              this.tieneSubtitulos = tieneSubtitulos;
    }

    public String obtenerUrlSimulada() {
              return "https://youtube.com/watch?v="
                                + getTitulo().replace(" ", "_").toLowerCase();
    }

    @Override
      public void mostrarInfo() {
                System.out.println("=== VIDEO YOUTUBE ===");
                System.out.println("Título: " + getTitulo());
                System.out.println("Año: " + getAnio());
                System.out.println("Idioma: " + getIdioma());
                System.out.println("Canal: " + canal);
                System.out.println("Visualizaciones: " + visualizaciones);
                System.out.println("Categoría: " + categoria);
                System.out.println("Subtítulos: "
                                                   + (tieneSubtitulos ? "Sí" : "No"));
                System.out.println("URL: " + obtenerUrlSimulada());
      }
}
