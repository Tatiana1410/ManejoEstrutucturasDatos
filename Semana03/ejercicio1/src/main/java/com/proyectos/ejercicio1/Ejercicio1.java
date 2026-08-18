/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectos.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [] numeros=new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el valor "+(i+1)+": ");
            numeros[i]=leer.nextInt();          
        }
        int numMaximo=numeros[0], numMinimo=numeros[0], posMaximo=0, posMinimo=0;
        int c=0;
        for(int num: numeros){
            if (num>numMaximo){
                numMaximo=num;
                posMaximo=c;
            }else if (num<numMaximo){
                numMinimo=num;
                posMinimo=c;
            }
            c++;
        }
        
        System.out.println("Número máximo es:  "+ numMaximo + " en la posición " +posMaximo);
        System.out.println("Número minimo es:  "+ numMinimo + " en la posición " +posMinimo);

    }
}
