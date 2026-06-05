package contenido;

// Relación de COMPOSICIÓN con SerieDeTV
public class Temporada {

    private int numero;
      private int cantidadEpisodios;
      private int anioEmision;

    public Temporada(int numero,
                                          int cantidadEpisodios,
                                          int anioEmision) {
              this.numero = numero;
              this.cantidadEpisodios = cantidadEpisodios;
              this.anioEmision = anioEmision;
    }

    public int getNumero() {
              return numero;
    }

    public void setNumero(int numero) {
              this.numero = numero;
    }

    public int getCantidadEpisodios() {
              return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
              this.cantidadEpisodios = cantidadEpisodios;
    }

    public int getAnioEmision() {
              return anioEmision;
    }

    public void setAnioEmision(int anioEmision) {
              this.anioEmision = anioEmision;
    }

    public void mostrarInfo() {
              System.out.println(
                            "Temporada " + numero +
                            ": " + cantidadEpisodios +
                            " episodios (" + anioEmision + ")"
                        );
    }
}
