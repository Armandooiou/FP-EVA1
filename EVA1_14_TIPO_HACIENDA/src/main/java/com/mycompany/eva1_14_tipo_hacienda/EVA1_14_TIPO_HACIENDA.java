/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class EVA1_14_TIPO_HACIENDA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
     char tipo;
     Scanner captu = new Scanner(System.in);
    System.out.println("CAPTURAR EL TIPO DE PERSONA F:Fisica - M:Moral ");
    tipo = captu.nextLine().charAt(0);
    System.out.println("El caracter es " + tipo);
        boolean persona;
    if(tipo == 'f')
        System.out.println("persona Fisica");
    else
        System.out.println("persona moral");
    
    
    
    
    
    
    
    
    }
}
