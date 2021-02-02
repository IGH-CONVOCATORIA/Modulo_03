/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igh;

import java.util.Scanner;

/**
 *
 * @author INFORMATICA
 */
public class IGH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int valor;
        
        System.out.print("Ingrese el valor numerico:");
        valor = leer.nextInt();
        
        double calculo = Math.round(valor %  2);
        System.out.print(calculo);
        if (calculo==0)
                
                    System.out.println("Es par");
             else
                    System.out.println("Es Inpar");
        }
        
    
    
}
