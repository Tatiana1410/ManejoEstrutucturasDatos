/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejerciciodoce;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioDoce {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("=====CALCULAR PROMEDIO DE NOTAS=====");
        int cantidad;
        double nota, suma = 0, promedio;
        System.out.print("Cantidad de alumnos: ");
        cantidad = leer.nextInt();
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Nota del alumno " + i + ": ");
            nota = leer.nextDouble();
            suma = suma + nota;
        }
        promedio = suma / cantidad;
        System.out.println("Nota promedio del grupo: " + promedio);
    }
}
