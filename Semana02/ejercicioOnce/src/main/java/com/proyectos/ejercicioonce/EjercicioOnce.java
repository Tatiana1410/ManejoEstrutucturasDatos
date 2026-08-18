/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejercicioonce;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioOnce {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("=====CALCULAR SUELDO SEMANAL=====");
        String nombre;
        char clase;
        double horas, pagoHora = 0, sueldo;
        System.out.print("Nombre del empleado: ");
        nombre = leer.nextLine();
        System.out.print("Horas trabajadas: ");
        horas = leer.nextDouble();
        System.out.print("Clase de puesto (A, B, C o D): ");
        clase = leer.next().toUpperCase().charAt(0);
        switch (clase) {

            case 'A':
                pagoHora = 7.00;
                break;

            case 'B':
                pagoHora = 8.50;
                break;

            case 'C':
                pagoHora = 10.00;
                break;

            case 'D':
                pagoHora = 12.50;
                break;

            default:
                System.out.println("Clase de puesto incorrecta");
        }

        sueldo = horas * pagoHora;

        System.out.println("Nombre: " + nombre);
        System.out.println("Clase de puesto: " + clase);
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Pago por hora: $" + pagoHora);
        System.out.println("Sueldo semanal: $" + sueldo);
    }
}
