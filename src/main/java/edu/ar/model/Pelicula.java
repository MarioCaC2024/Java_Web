package edu.ar.model;

public class Pelicula {

    // atributos de clase
    int id;
    String nombre;
    String descripcion;    
    String genero;
    int anio;
    int calificacion;
    byte estrellas;
    String director;

    // constructores (atributos de metodo)
    public Pelicula(int id, String nombre, String descripcion, String genero , int anio , int calificacion , byte estrellas , String director) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.anio = anio;
        this.calificacion = calificacion;
        this.estrellas = estrellas;
        this.director = director;
    }

    public Pelicula(String nombre, String descripcion, String genero, int calificacion, int anio, byte estrellas,
      String director) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.genero = genero;
    this.calificacion = calificacion;
    this.anio = anio;
    this.estrellas = estrellas;
    this.director = director;
  }

    public Pelicula(int id, String nombre, int anio) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
        
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public void setEstrellas(byte estrellas) {
        this.estrellas = estrellas;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public byte getEstrellas() {
        return estrellas;
    }
    public String getDirector() {
        return director;
    }

    // Sobreescribo metodo toString()
    
    @Override
    public String toString() {
        return "Pelicula [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", genero=" + genero
                + ", anio=" + anio + ", calificacion=" + calificacion + ", estrellas=" + estrellas + ", director="
                + director + "]";
    }

    
}
