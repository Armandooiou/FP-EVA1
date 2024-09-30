/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_pantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author aaro1
 */
public class EVA1_15_PANTALLA_INICIO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   //CONSTANTE
  final String USUARIO = "Admin";    
   final String PASSWORD = "Admin";    
   final double p1 = 3.1416;
   String usu, pwd, password;
   Scanner captu = new Scanner(System.in);
   System.out.println("Usuario");
   usu = captu.nextLine();
   System.out.println("Password");  
   pwd = captu.nextLine();
   // COMO VALIDAMOS EL ACCESO?
   if(usu.equals(USUARIO) && pwd == PASSWORD){
           System.out.println("ACCESO CONCEDIDO");
    }else{
       System.out.println("ACCESO DENEGADO");
   }
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
