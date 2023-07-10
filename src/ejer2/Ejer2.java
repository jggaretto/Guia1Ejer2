/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

/**
 *
 * @author jgare
 */
public class Ejer2 {

  public static void main(String[] args) {
        Computadora miComputadora = new Computadora("Macbook Pro", 16, 512, 1999.99);
        System.out.println("Modelo: " + miComputadora.getModelo());
        System.out.println("RAM: " + miComputadora.getRam() + " GB");
        System.out.println("Almacenamiento: " + miComputadora.getAlmacenamiento() + " GB");
        System.out.println("Precio: $" + miComputadora.getPrecio());
    }
    
}
