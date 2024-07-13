package edu.ar.model;

public class Persona {
// atributos de clase
int id;
String nombre;
String apellido;
String nacionalidad;

// constructor
public Persona () {}

public Persona(int id, String nombre, String apellido, String nacionalidad) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.nacionalidad = nacionalidad;
}

// Getters and Setters
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public String getNacionalidad() {
    return nacionalidad;
}

public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
}

// Sobrescribo metodo toString
@Override
public String toString() {
    return "Persona [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
            + ", getNacionalidad()=" + getNacionalidad() + "]";
}


}
