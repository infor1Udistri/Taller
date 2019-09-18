/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.juego;

/**
 * DECORATOR
 * @author estudiantes
 */
public class Juego {
    private String nombre;
    private String productora;
    private int añoLanzamiento;
    private String categoriaJuego;
    
    public Juego (String nombre, String categoriaJuego){
        nombre =nombre;
        categoriaJuego=categoriaJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProductora() {
        return productora;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
 
}
