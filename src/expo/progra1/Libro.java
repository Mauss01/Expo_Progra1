/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo.progra1;

/**
 *
 * @author gabri
 */
public class Libro {
private String titulo;
    private String state;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.state = "disponible";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEstado() {
        return state;
    }

    public void rentar() {
        if (state.equals("disponible")) {
            state = "prestado";
            System.out.println("Rentaste: " + titulo);
        } else {
            System.out.println("Ya esta rentado.");
        }
    }

   public void devolver() {
     if (state.equals("prestado")) {   
        System.out.println("Devolviste: " + titulo); 
        state = "disponible";
        }else{
        System.out.println("El libro ya esta en la libreria: ");
    }
     }

    @Override
    public String toString() {
        return titulo + " (" + state + ")";
    }    
}
