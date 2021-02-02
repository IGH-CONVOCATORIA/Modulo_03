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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaraciones
        Scanner sc = new Scanner(System.in);
        int numero;
        int indice1, indice2;
        Integer fibonacci[] = new Integer[1000];
        int contador=0;
        
        //ingreso de datos
        System.out.print("Ingresa la cantidad de terminos del fibonacci: ");
        numero = sc.nextInt();

        
        //proceso
        indice1 = 0;
        indice2 = 1;
        contador++;
        fibonacci[contador]=indice1;
        
        for (int i = 2; i <= numero; i++) {
            contador++;
            fibonacci[contador]=indice2;
            indice2 = indice1 + indice2;
            indice1 = indice2 - indice1;
        }
        
        
        //reporte
        for (int x=1;x<=contador;x++)
            System.out.print(fibonacci[x] + " ");
        
        System.out.println();
    }
   
}
