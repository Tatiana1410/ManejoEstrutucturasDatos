/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejercicionueve;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioNueve {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("=====CALCULAR PRECIO DE ENTRADA=====");
        int edad;
        double precioBoleto, totalPagar;

        System.out.print("Ingresa la edad de la persona: ");
        edad = leer.nextInt();

        System.out.print("Ingresa el precio del boleto: $");
        precioBoleto = leer.nextDouble();

        if (edad > 60 || edad < 18) {
            totalPagar = precioBoleto * 0.50;
            System.out.println("Aplica descuento del 50%");
        } else {
            totalPagar = precioBoleto;
            System.out.println("No aplica descuento");
        }

        System.out.println("Total a pagar: $" + totalPagar);
    }
}
