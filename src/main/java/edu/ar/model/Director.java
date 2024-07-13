package edu.ar.model;

public class Director extends Persona {
  // atributos
  private int peliculasDirigidas;
  
  // constructor
  public Director( int id , String nombre, String apellido ,String nacionalidad, int peliculasDirigidas) {
    super( id , nombre , apellido , nacionalidad);
    this.peliculasDirigidas = peliculasDirigidas;
  }

  // Getters and Setters
  public int getPeliculasDirigidas() {
    return peliculasDirigidas;
  }

  public void setPeliculasDirigidas(int peliculasDirigidas) {
    this.peliculasDirigidas = peliculasDirigidas;
  }

  // sobreescribo toString
  @Override
  public String toString() {
    return "Director [peliculasDirigidas=" + peliculasDirigidas + ", toString()=" + super.toString() + "]";
  }
  

  
}
