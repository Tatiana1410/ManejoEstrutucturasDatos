/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejercicio05;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cantidad;
        double suma = 0, promedio;
        System.out.println("=====CALIFICACIONES DE ESTUDIANTES=====");
        System.out.print("Cantidad de estudiantes: ");
        cantidad = leer.nextInt();
        double[] notas = new double[cantidad];

        // Ingresar las calificaciones
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Calificación del estudiante " + (i + 1) + ": ");
            notas[i] = leer.nextDouble();
            suma = suma + notas[i];
        }

        double mayor = notas[0];
        double menor = notas[0];
        // Buscar la nota mayor y menor
        for (int i = 0; i < cantidad; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        promedio = suma / cantidad;

        System.out.println("\n=====RESULTADOS=====");
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación más alta: " + mayor);
        System.out.println("Calificación más baja: " + menor);
    }   
}
