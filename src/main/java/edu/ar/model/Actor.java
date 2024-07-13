package edu.ar.model;

public class Actor extends Persona {
   
// atributos de clase
private int premiosGanados = 0;

// contructores
public Actor(int premiosGanados) {
this.premiosGanados = premiosGanados;
}

public Actor(int id, String nombre, String apellido, String nacionalidad,int premiosGanados) {
super(id, nombre, apellido, nacionalidad);
this.premiosGanados = premiosGanados;
}

// Getters and Setters
public int getPremiosGanados() {
    return premiosGanados;
}

public void setPremiosGanados(int premiosGanados) {
    this.premiosGanados = premiosGanados;
}

// Sobreescribo metodo toString
@Override
public String toString() {
    return "Actor [toString()=" + super.toString() + "]" + " Premios ganados : " + getPremiosGanados();
}


      
}
