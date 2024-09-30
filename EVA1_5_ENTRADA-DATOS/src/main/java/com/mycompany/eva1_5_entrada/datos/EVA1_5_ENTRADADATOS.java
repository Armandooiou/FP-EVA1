/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada.datos;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class EVA1_5_ENTRADADATOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //DACLARAMOS VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;
        //¿como se captura?
        //SCANER
        //Herramienta--> Clase: nos proporcionan muchas herramientas 
         Scanner captu;//declaramos la herramienta previa mente
                       //hay que importar(hacer un import)
       captu = new Scanner(System.in);//creamos la herramienta
    
     //HAY QUE INDICAR AL USUARIO QUE CAPTURAR
     System.out.println("introduce la marca del vehiculo");
    //capturamos --> una asignacion 
    marca = captu.nextLine(); //les regresa todo el texto hasta capturar
                                       //se preciona la tecla "enter"
    
    System.out.println(marca); 
    System.out.println("introduce el modelo del vehiculo");
    modelo = captu.nextLine();
   System.out.println("introduce el año");
    year = captu.nextInt();
     System.out.println("introduce el precio");       
    precio = captu.nextDouble();
    System.out.println("Datos capturados-----------------------");
    System.out.println(marca);
    System.out.println(modelo);
    System.out.println(year);
    System.out.println(precio); 
    
    
    }
}
