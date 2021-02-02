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
public class DesconponerSoles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaraciones
        Scanner sc = new Scanner(System.in);
       
        
        
        Integer billete[] = new Integer[10];
        Integer cantidad[] = new Integer[10];
        
        billete[0]=200;
        billete[1]=100;
        billete[2]=50;
        billete[3]=20;
        billete[4]=10;
        billete[5]=5;
        billete[6]=2;
        billete[7]=1;
        
        int soles,calculo=0,residuo=0,saldo=0,idxbillete=0;
        
        //ingreso de datos
        System.out.print("Ingrese el importe en soles: ");
        soles = sc.nextInt();
        
        
        //proceso
        do {
            calculo=0;
            if (soles>=billete[idxbillete])
            {
                residuo=soles%billete[idxbillete];
                calculo=(soles-residuo)/billete[idxbillete];
                soles=residuo;
            }
             
            cantidad[idxbillete]=calculo;
            idxbillete++;
        }while(idxbillete<8);
        
        
        //reporte
        for (int x=0;x<=7;++x){
            if (cantidad[x]>0)
                System.out.println("BILLETE "+billete[x]+": "+cantidad[x]);
        }
        
        
    }
   
}
