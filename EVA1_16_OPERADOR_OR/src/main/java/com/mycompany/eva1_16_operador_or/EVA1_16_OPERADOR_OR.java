/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class EVA1_16_OPERADOR_OR {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   int km, meses;
   Scanner captu = new Scanner(System.in);
    System.out.println("Cuanto Kilimetraje tiene el vehiculo?");
    km = captu.nextInt();
     System.out.println("Cuantos meses tiene el vehiculo?");
    meses = captu.nextInt();
    captu.nextLine();
    
    if(km >= 5000 || meses >= 6){
        System.out.println("cambio de aceite");
    }else{
        System.out.println("Vehiculo en bues estado");
   
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    }
}
