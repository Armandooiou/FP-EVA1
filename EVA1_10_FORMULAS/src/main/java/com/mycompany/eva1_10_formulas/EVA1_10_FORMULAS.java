/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_formulas;

/**
 *
 * @author aaro1
 */
public class EVA1_10_FORMULAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    double vo, a, t, d;
    scanner captu = new scanner (System.in);
    
    System.out.println("Velocidad inicial");
    vo = captu.nextDouble();
    System.out.println("Tiempo:  ");
    t = captu.nextDouble();
    System.out.println("Aceleracion: ");
    a = captu.nextDouble();
    System.out.println("Distancia: ");
    d = vo * t +(a * t * t) / 2;
    System.out.println("Distancia = " + d);
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
