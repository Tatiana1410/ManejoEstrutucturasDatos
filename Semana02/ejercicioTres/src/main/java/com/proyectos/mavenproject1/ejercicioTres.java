/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectos.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class ejercicioTres {

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

        System.out.println("=====CALCULAR HIPOTENUSA DE UN TRIANGULO=====");

        double catetoUno, catetoDos, hipotenusa;

        do {
            System.out.print("Cateto 1: ");
            catetoUno = leer.nextDouble();

            if (catetoUno > 0) {
                break;
            } else {
                System.out.println("Ingresa una medida correcta!!!");
            }

        } while (true);

        do {
            System.out.print("Cateto 2: ");
            catetoDos = leer.nextDouble();

            if (catetoDos > 0) {
                break;
            } else {
                System.out.println("Ingresa una medida correcta!!!");
            }
             } while (true);

        hipotenusa = Math.sqrt(Math.pow(catetoUno, 2) + Math.pow(catetoDos, 2));

        System.out.println("Hipotenusa: " + hipotenusa + " cm");
    }
}
