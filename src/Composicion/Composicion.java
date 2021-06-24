/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composicion;

import ico.fes.accesorios.CPU;
import ico.fes.accesorios.Computadora;
import ico.fes.accesorios.Monitor;
import ico.fes.accesorios.Mouse;
import ico.fes.accesorios.Teclado;

/**
 *
 * @author leona
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora PC1 = new Computadora("Asus","5300",new CPU("Intel","I9",5),new Monitor("LG","3400",5),new Mouse("Razer","3000","inalambrico"),new Teclado("Razer","5000", 4, 3));
        
        System.out.println(PC1);
    }
    
}
