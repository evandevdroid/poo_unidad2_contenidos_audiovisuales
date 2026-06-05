package contenido;

public class Main {

    public static void main(String[] args) {

          System.out.println(
                        "=== SISTEMA DE CONTENIDOS AUDIOVISUALES ===\n"
                    );

          // AGREGACIÓN
          System.out.println(
                        "--- AGREGACIÓN: Película con Actores ---"
                    );
              Pelicula peli = new Pelicula(
                            "Inception",
                            2010,
                            "Inglés",
                            148,
                            "Ciencia ficción"
                        );
              peli.agregarActor(
                            new Actor(
                                              "Leonardo DiCaprio",
                                              "Estadounidense",
                                              49
                                          )
                        );
              peli.agregarActor(
                            new Actor(
                                              "Joseph Gordon-Levitt",
                                              "Estadounidense",
                                              43
                                          )
                        );
              peli.mostrarInfo();
              System.out.println();

          // COMPOSICIÓN
          System.out.println(
                        "--- COMPOSICIÓN: Serie de TV con Temporadas ---"
                    );
              SerieDeTV serie = new SerieDeTV(
                            "Breaking Bad",
                            2008,
                            "Inglés",
                            62,
                            "Netflix",
                            true
                        );
              serie.agregarTemporada(new Temporada(1, 7, 2008));
              serie.agregarTemporada(new Temporada(2, 13, 2009));
              serie.agregarTemporada(new Temporada(3, 13, 2010));
              serie.agregarTemporada(new Temporada(4, 13, 2011));
              serie.agregarTemporada(new Temporada(5, 16, 2012));
              serie.mostrarInfo();
              System.out.println();

          // ASOCIACIÓN
          System.out.println(
                        "--- ASOCIACIÓN: Documental con Investigadores ---"
                    );
              Documental doc = new Documental(
                            "Cosmos",
                            2014,
                            "Inglés",
                            "Astronomía",
                            "Ann Druyan"
                        );
              doc.agregarInvestigador(
                            new Investigador(
                                              "Neil deGrasse Tyson",
                                              "Astrofísica",
                                              "NASA"
                                          )
                        );
              doc.agregarInvestigador(
                            new Investigador(
                                              "Carl Sagan",
                                              "Astronomía",
                                              "Universidad de Cornell"
                                          )
                        );
              doc.mostrarInfo();
              System.out.println();

          // SUBCLASE VideoYouTube
          System.out.println(
                        "--- SUBCLASE: VideoYouTube ---"
                    );
              VideoYouTube video = new VideoYouTube(
                            "Tutorial Java POO",
                            2024,
                            "Español",
                            "TechChannel",
                            150000L,
                            "Educación",
                            true
                        );
              video.mostrarInfo();
              System.out.println();

          // SUBCLASE Cortometraje
          System.out.println(
                        "--- SUBCLASE: Cortometraje ---"
                    );
              Cortometraje corto = new Cortometraje(
                            "Luz de Luna",
                            2023,
                            "Español",
                            "Carlos Ruiz",
                            "IndieFilms",
                            false
                        );
              corto.participarEnFestival("Festival Sundance");
              corto.participarEnFestival("Festival de Cannes");
              corto.mostrarInfo();
              System.out.println();

          System.out.println(
                        "=== SISTEMA FUNCIONANDO CORRECTAMENTE ==="
                    );
    }
}
