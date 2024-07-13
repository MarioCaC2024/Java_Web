package edu.ar.model;

public class Usuario {
   
   // Atributos
   public String nombre;
   public String email;
   public String perfil;
   public int edad;

   // Constructores
   public Usuario () {}

   public Usuario ( String no, String em , String pe, int ed) {
   this.nombre = no;
   this.email = em;
   this.perfil = pe;
   this.edad = ed;
   }

@Override
public String toString() {
    return "Usuario [nombre=" + nombre + ", email=" + email + ", perfil=" + perfil + ", edad=" + edad + "]";
}

   
}
