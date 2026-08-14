/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejerciciouno;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioUno {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //leer dos números
        double valorUno, valorDos;
        System.out.print("Ingresa el valor 1: ");
        valorUno = leer.nextDouble();
        System.out.print("Ingresa el valor 2: ");
        valorDos = leer.nextDouble();
        if (valorUno==valorDos){
            double suma = valorUno + valorDos;
            System.out.println("Resultado de la suma: " + suma);
        }else{
            double producto= valorUno*valorDos;
            System.out.println("Resultado de la multiplicacion: " + producto);
            
        }
    }
}
