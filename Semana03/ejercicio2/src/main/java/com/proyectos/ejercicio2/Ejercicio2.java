/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectos.ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [] numeros={1,5,8,9,2,3,1};
        Arrays.sort(numeros);
        
        System.out.println("Numeros de menor a mayor");
        for(int num:numeros){
            System.out.print(num+", ");
        }
        
        System.out.println("Numeros de mayor a menor");
        for (int i = numeros.length-1; i >=0; i--) {
            System.out.print(numeros[i]+", ");
        }
    }
}
