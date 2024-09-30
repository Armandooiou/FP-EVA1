/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_converciones;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class EVA1_9_CONVERCIONES {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    double far, cent;
    Scanner captu = new Scanner(System.in);
    System.out.println("Temperatura en grados farenheit");
    far = captu.nextDouble();
    cent = (far - 32) / 1.8;
    System.out.println("°c = " + cent);
    //CONVERTIR AHORA DE CENTIGRADOS A FARENHEIT
   cent = captu.nextDouble();
   far = 1.8* + 32;
   System.out.println("°f = " + far);
    
    
    
    
    
    
    }
}
