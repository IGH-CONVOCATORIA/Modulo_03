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
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaraciones
        Scanner sc = new Scanner(System.in);
        int tabla;
        Integer resultado[] = new Integer[13];
        
        
        //ingreso de datos
        System.out.print("Ingresa la tabla que desee: ");
        tabla = sc.nextInt();

        
        //proceso
        for (int i = 0; i < 13; i++) 
            resultado[i]=tabla * i;
        
        //reporte
        for (int x=0;x<13;x++)
            System.out.println(tabla+" x "+x+" = "+resultado[x]);
        
    }
   
}
