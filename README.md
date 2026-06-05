# Sistema de Contenidos Audiovisuales

## Descripción

Proyecto desarrollado para la asignatura Programación Orientada a Objetos.

El objetivo de este proyecto es ampliar un sistema de contenidos audiovisuales mediante la aplicación de conceptos fundamentales de Programación Orientada a Objetos, tales como herencia, encapsulamiento, agregación, composición, asociación y polimorfismo.

El sistema permite representar distintos tipos de contenidos audiovisuales y modelar relaciones reales entre sus elementos, manteniendo una estructura escalable y organizada.

---

## Objetivo

Implementar nuevas clases y relaciones entre objetos utilizando Programación Orientada a Objetos en Java, ampliando el sistema original de contenidos audiovisuales y aplicando correctamente los principios de diseño orientado a objetos.

---

## Clases Implementadas

### Clases originales

- ContenidoAudiovisual
- Pelicula
- SerieDeTV
- Documental

### Nuevas clases

- Actor
- Temporada
- Investigador
- VideoYouTube
- Cortometraje

---

## Relaciones UML

### Agregación

Pelicula ◇── Actor

Un actor puede existir independientemente de una película y participar en múltiples producciones.

### Composición

SerieDeTV ◆── Temporada

Una temporada forma parte de una serie y no tiene sentido existir de manera independiente.

### Asociación

Documental ─── Investigador

Un investigador puede participar en varios documentales sin depender de uno específico.

### Herencia

- Pelicula hereda de ContenidoAudiovisual
- SerieDeTV hereda de ContenidoAudiovisual
- Documental hereda de ContenidoAudiovisual
- VideoYouTube hereda de ContenidoAudiovisual
- Cortometraje hereda de ContenidoAudiovisual

---

## Estructura del Proyecto

```text
src/
└── contenido/
    ├── ContenidoAudiovisual.java
    ├── Pelicula.java
    ├── SerieDeTV.java
    ├── Documental.java
    ├── Actor.java
    ├── Temporada.java
    ├── Investigador.java
    ├── VideoYouTube.java
    ├── Cortometraje.java
    └── Main.java
```

---

## Funcionalidades Implementadas

### Película

- Registro de información general.
- Asociación de múltiples actores mediante agregación.
- Visualización completa de información.

### Serie de TV

- Registro de episodios totales.
- Gestión de temporadas mediante composición.
- Visualización detallada de temporadas.

### Documental

- Registro de tema y director.
- Asociación de investigadores.
- Visualización de investigadores participantes.

### VideoYouTube

- Registro de canal.
- Registro de visualizaciones.
- Registro de categoría.
- Gestión de subtítulos.
- Generación de URL simulada.

### Cortometraje

- Registro de director.
- Registro de productora.
- Registro de festivales.
- Gestión de participación en festivales.

---

## Principios de Programación Orientada a Objetos Aplicados

### Encapsulamiento

Todos los atributos fueron declarados privados y se utilizan métodos getters y setters para acceder a ellos.

### Herencia

Las clases Pelicula, SerieDeTV, Documental, VideoYouTube y Cortometraje heredan de la clase abstracta ContenidoAudiovisual.

### Polimorfismo

Cada subclase sobrescribe el método:

```java
mostrarInfo()
```

permitiendo comportamientos específicos para cada tipo de contenido.

### Agregación

Relación implementada entre:

```text
Pelicula ◇── Actor
```

### Composición

Relación implementada entre:

```text
SerieDeTV ◆── Temporada
```

### Asociación

Relación implementada entre:

```text
Documental ─── Investigador
```

---

## Requisitos

- Java JDK 21 o superior
- Eclipse IDE, IntelliJ IDEA o NetBeans

---

## Compilación

```bash
javac contenido/*.java
```

---

## Ejecución

```bash
java contenido.Main
```

---

## Evidencias

### Diagrama UML

Consultar archivo:

```text
docs/uml.png
```

### Ejecución del Sistema

Consultar archivo:

```text
docs/ejecucion.png
```

---

## Resultados Esperados

Al ejecutar el programa se mostrará información de:

- Películas y actores.
- Series y temporadas.
- Documentales e investigadores.
- Videos de YouTube.
- Cortometrajes.

Demostrando el correcto funcionamiento de todas las relaciones implementadas.

---

## Autor

Evan López

Programación Orientada a Objetos

Universidad Politécnica Salesiana

2026
