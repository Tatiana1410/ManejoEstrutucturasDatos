/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejerciciodiez;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioDiez {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("=====CALCULAR DESCUENTO DE COMPRA=====");
        String nombre;
        double compra, descuento, totalPagar;
        System.out.print("Ingresa el nombre del cliente: ");
        nombre = leer.nextLine();
        System.out.print("Ingresa el valor de la compra: $");
        compra = leer.nextDouble();
        if (compra > 150) {
            descuento = compra * 0.10;
        } else if (compra > 75) {
            descuento = compra * 0.05;
        } else {
            descuento = 0;
        }
        totalPagar = compra - descuento;
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Valor de la compra: $" + compra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Monto real a pagar: $" + totalPagar);
    }
}
