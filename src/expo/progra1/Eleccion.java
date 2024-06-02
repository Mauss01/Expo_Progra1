/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo.progra1;

import java.util.Random;

/**
 *
 * @author gabri
 */
class Eleccion {
    private String cantante;
    private String cancion;
    private int popularidad;

    // Constructor que establece los valores iniciales
    public Eleccion(String ninguno, String ninguna, int par) {
        this.cantante = "Ninguno";
        this.cancion = "Ninguna";
        this.popularidad = 0;
    }

    // Getter y Setter para el cantante
    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    // Getter y Setter para la canción
    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    // Getter y Setter para la popularidad
    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
    public int visitas(int popularidad1) {
    Random rand = new Random();
    int visitas = rand.nextInt(50) + 1; // Genera un número aleatorio entre 1 y 50
    return this.popularidad + visitas;
}
}
