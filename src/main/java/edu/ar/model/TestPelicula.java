package edu.ar.model;

public class TestPelicula {
    public static void main(String[] args) {
    
        Pelicula Peli = new Pelicula(1, "La comunidad del anillo", 2001);
        System.out.println(Peli);
        System.out.println(Peli.getAnio());
        Peli.setAnio(2002);
        System.out.println(Peli.getAnio());
    }
}
