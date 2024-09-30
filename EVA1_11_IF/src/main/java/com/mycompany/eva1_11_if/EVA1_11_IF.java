/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class EVA1_11_IF {

    public static void main(String[] args) {
        System.out.println("Hello World!");
          //CONDICIONAL
          //LOGICA BOLEANA --> OPERACION DE VERDAD      
         //SOLICITAR LA EDAD 
        int edad;
         Scanner captu = new Scanner(System.in);
       System.out.println("capturar la edad");
       edad = captu.nextInt();
       //DETERMINAR SI ES UN ADULTO O NO
       //LAS OPERACIONES LOGICAS SOLO GENERAN COMO 
       //RESULTADO UN VERDADERO O UN FALSO
       // SI SON VARIAS INTRUCCIONES, HAY QUE  
       //AGRUPAR CON LLAVES
       if(edad >= 18){//BLOQUE PARA EL VERDADERO
           System.out.println("ES UN ADULTO");
       }else{//BLOQUE PARA EL FALSO
          System.out.println("MENOR DE EDAD!!"); 
       }
    
    
    }
}
