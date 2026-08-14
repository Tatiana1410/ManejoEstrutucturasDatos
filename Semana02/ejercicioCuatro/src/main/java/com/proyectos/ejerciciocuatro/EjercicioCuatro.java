/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejerciciocuatro;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("=====CALCULAR DESCUENTO DE RENTA=====");
        double sueldo, renta = 0, sueldoTotal;
        do {
            System.out.print("Ingresa el sueldo mensual: $");
            sueldo = leer.nextDouble();

            if (sueldo > 0) {
                break;
            } else {
                System.out.println("Ingresa un sueldo correcto!!!");
            }
        } while (true);

        if (sueldo <= 550) {

            renta = 0;
            System.out.println("No aplica descuento de renta");

        } else if (sueldo <= 895.24) {
            renta = (sueldo - 550) * 0.10 + 17.67;

        } else if (sueldo <= 2038.10) {
            renta = (sueldo - 895.24) * 0.20 + 60;
        } else {

            renta = (sueldo - 2038.10) * 0.30 + 288.57;
        }
        sueldoTotal = sueldo - renta;
        System.out.println("Sueldo: $" + sueldo);
        System.out.println("Descuento de renta: $" + renta);
        System.out.println("Sueldo total a recibir: $" + sueldoTotal);
    }
}
