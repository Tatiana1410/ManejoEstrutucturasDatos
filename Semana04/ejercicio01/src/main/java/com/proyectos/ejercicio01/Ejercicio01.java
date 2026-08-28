/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Ingrese un número: ");
                double numero = leer.nextInt();
                leer.nextLine();
                if (numero < 0) {
                    throw new ArithmeticException("Ingrese un número igual o mayor a 0!!\n");
                }
                double raiz = Math.sqrt(numero);
                System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());               
            } catch (Exception e) {
                System.out.println("Asegurese de ingresar unicamente números....");
                leer.nextLine();
            }

        }
    }
}
