/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igh.Modulo_03;

import java.util.Scanner;

/**
 *
 * @author INFORMATICA
 */
public class HablaBien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaraciones
        Scanner sc = new Scanner(System.in);
        int consumo = 0;
        float consumominuto = 0, pordonacion = 0,consumosoles=0,donacion=0;

        //ingreso de datos
        System.out.print("Ingrese el importe en soles: ");
        consumo = sc.nextInt();

        //proceso
        if (consumo >= 1 && consumo <= 50) {
            consumominuto = 1.3f;
            pordonacion = 1.8f;
        }
        if (consumo >= 51 && consumo <= 80) {
            consumominuto = 1.2f;
            pordonacion = 2f;
        }
        if (consumo >= 81 && consumo <= 150) {
            consumominuto = 1.1f;
            pordonacion = 2.5f;
        }
        if (consumo >= 151 && consumo <= 300) {
            consumominuto = 1f;
            pordonacion = 3f;
        }
        if (consumo >= 301) {
            consumominuto = 0.07f;
            pordonacion = 4f;
        }
        
        consumosoles=consumo * consumominuto;
        donacion=(consumosoles*pordonacion)/100;
        
        //reporte
        System.out.println("Consumo x Minuto:"+consumosoles);
        System.out.println("Donacion:"+donacion);
    }

}
