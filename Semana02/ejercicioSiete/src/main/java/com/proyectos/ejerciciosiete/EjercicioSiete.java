/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejerciciosiete;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioSiete {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("=====VERIFICAR NÚMERO PAR O IMPAR=====");
        int numero;
        do {
            System.out.print("Ingresa un número entero: ");
            if (leer.hasNextInt()) {
                numero = leer.nextInt();
                break;
            } else {
                System.out.println("Debes ingresar un número entero!!!");
                leer.next();
            }
        } while (true);
        if (numero % 2 == 0) {
            System.out.println("El número es PAR");
        } else {
            System.out.println("El número es IMPAR");
        }
    }
}
