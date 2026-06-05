package contenido;

public abstract class ContenidoAudiovisual {

    private String titulo;

    private int anio;

    private String idioma;

    public ContenidoAudiovisual(String titulo, int anio, String idioma) {

          this.titulo = titulo;

          this.anio = anio;

          this.idioma = idioma;

    }

    public String getTitulo() {

          return titulo;

    }

    public void setTitulo(String titulo) {

          this.titulo = titulo;

    }

    public int getAnio() {

          return anio;

    }

    public void setAnio(int anio) {

          this.anio = anio;

    }

    public String getIdioma() {

          return idioma;

    }

    public void setIdioma(String idioma) {

          this.idioma = idioma;

    }

    public abstract void mostrarInfo();

}
