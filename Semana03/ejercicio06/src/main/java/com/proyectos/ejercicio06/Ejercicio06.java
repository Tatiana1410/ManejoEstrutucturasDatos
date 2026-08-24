/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejercicio06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> descripciones = new ArrayList<>();
        ArrayList<Double> montos = new ArrayList<>();
        String descripcion, continuar;
        double monto, total = 0;
        System.out.println("=====REGISTRO DE GASTOS MENSUALES=====");
        do {
            System.out.print("Descripción del gasto: ");
            descripcion = leer.nextLine();

            System.out.print("Monto del gasto: $");
            monto = leer.nextDouble();
            leer.nextLine();

            descripciones.add(descripcion);
            montos.add(monto);
            System.out.print("¿Desea agregar otro gasto? (S/N): ");
            continuar = leer.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\n=====LISTA DE GASTOS=====");
        for (int i = 0; i < descripciones.size(); i++) {

            System.out.println(
                    descripciones.get(i) + " - $" + montos.get(i)
            );
            total = total + montos.get(i);
        }
        System.out.println("\nTotal gastado: $" + total);
    }
}
