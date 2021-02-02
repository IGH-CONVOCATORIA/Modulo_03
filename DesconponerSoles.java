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
        int billete200=0;
        int billete100=0;
        int billete50=0;
        int billete20=0;
        int billete10=0;
        int billete5=0;
        int billete2=0;
        int billete1=0;
        
        Integer resultado[] = new Integer[13];
        int soles,saldo;
        
        //ingreso de datos
        System.out.print("Ingrese el importe en soles: ");
        soles = sc.nextInt();
        
        
        //proceso
        do {
            if (soles>=200)
                billete200=soles%200;
            
            saldo=soles - (billete200*200);
            if (saldo>=100)
                billete100=saldo%100;
            
            saldo=saldo - (billete100*100);
            System.out.println(saldo);
            if (saldo>=50)
                billete50=saldo%100;
            
            saldo=saldo - (billete50*50);
            System.out.println(saldo);
            if (saldo>=20)
                billete20=saldo%20;
            
            saldo=saldo - (billete20*20);
            System.out.println(saldo);
            if (saldo>=10)
                billete10=saldo%10;
            
            saldo=saldo - (billete10*10);
            System.out.println(saldo);
            if (saldo>=5)
                billete5=saldo%5;
            
            saldo=saldo - (billete5*5);
            System.out.println(saldo);
            if (saldo>=2)
                billete2=saldo%2;
            
            saldo=saldo - (billete2*2);
            System.out.println(saldo);
            if (saldo>=1)
                billete1=saldo%1;
            
        }while(saldo==0);
        
           
        System.out.println(saldo);
        
    }
   
}
