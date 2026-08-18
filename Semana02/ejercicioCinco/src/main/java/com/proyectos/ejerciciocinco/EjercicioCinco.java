/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectos.ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioCinco {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numero, factorial;
        System.out.print("Ingrese un número: ");
        numero=leer.nextInt();
        if (numero<0){
            System.out.println("No se puede obtener el factorial!!!");
        }else if(numero==0 || numero==1){
            factorial=numero;
            System.out.println("Factorial: "+factorial);
        }else{
            factorial=numero;
            for (int i = numero-1; i >= 1; i--) {
                factorial*=i;
            }
            System.out.println("Factorial: "+factorial);
        }
    }
}
