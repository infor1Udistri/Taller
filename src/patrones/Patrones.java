/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import patrones.juego.Juego;
import patrones.juego.JuegoPirata;
import patrones.juego.Precio;

/**
 *
 * @author estudiantes
 */
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego juego1 = new Juego("","");
        Juego juego2 = new Juego("","");
        
        juego1.setNombre("Crash");
        juego1.setProductora("Sony");
        juego1.setAñoLanzamiento(2002);
        
        juego2.setNombre("Fifa 2010");
        juego2.setProductora("Atari");
        juego2.setAñoLanzamiento(2010);
        
        JuegoPirata piratica = new JuegoPirata(juego1);
        
        Precio precio = Precio.getPrecio();
        
        Precio precio1 = Precio.getPrecio();
        precio1.setDescuento("20%");
        System.out.println("El descuento del juego GTA es: " + precio1.getDescuento());
        
        Precio precio2 = Precio.getPrecio();
        System.out.println("El descuento de " + juego1.getNombre() + " es: " + precio2.getDescuento());
        
        Precio precio3 = Precio.getPrecio();
        System.out.println("El descuento de " + juego2.getNombre() + " es: " + precio3.getDescuento());
        
        precio3.setDescuento("50%");
        System.out.println("El descuento de " + piratica.getNombre() + " pirata es: " + precio3.getDescuento());
        
        
    }
    
}
