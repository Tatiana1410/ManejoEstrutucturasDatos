/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] nombres = new String[5];
        String[] cargos = new String[5];
        double[] sueldos = new double[5];

        System.out.println("=====REGISTRO DE EMPLEADOS=====");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEmpleado " + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = leer.nextLine();
            System.out.print("Cargo: ");
            cargos[i] = leer.nextLine();
            System.out.print("Sueldo: $");
            sueldos[i] = leer.nextDouble();
            leer.nextLine();
        }
        System.out.println("\n=====LISTADO DE EMPLEADOS=====");
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEmpleado " + (i + 1));
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Cargo: " + cargos[i]);
            System.out.println("Sueldo: $" + sueldos[i]);

        }
    }
}
