/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejercicioocho;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioOcho {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("=====UBICACIÓN EN EL PLANO CARTESIANO=====");
        double x, y;

        System.out.print("Ingresa la coordenada X: ");
        x = leer.nextDouble();

        System.out.print("Ingresa la coordenada Y: ");
        y = leer.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("El punto se encuentra en el ORIGEN");
        } else if (x == 0) {
            System.out.println("El punto se encuentra en el eje Y");
        } else if (y == 0) {
            System.out.println("El punto se encuentra en el eje X");
        } else if (x > 0 && y > 0) {
            System.out.println("El punto se encuentra en el PRIMER CUADRANTE");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto se encuentra en el SEGUNDO CUADRANTE");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto se encuentra en el TERCER CUADRANTE");
        } else {
            System.out.println("El punto se encuentra en el CUARTO CUADRANTE");
        }
    }
}
