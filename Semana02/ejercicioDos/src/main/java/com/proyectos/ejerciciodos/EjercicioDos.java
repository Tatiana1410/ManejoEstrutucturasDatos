/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejerciciodos;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioDos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //leer dos números
        System.out.println("=====CACULAR ÁREA DE UN RECTANGULO=====");

        double base, altura, area;
        do {
            System.out.print("Altura: ");
            altura = leer.nextDouble();
            if (altura > 0) {
                break;
            } else {
                System.out.println("Ingresa una medida correcta!!!");
            }
        } while (true);
        do {
            System.out.print("Base: ");
            base = leer.nextDouble();
            if (base > 0) {
                break;
            } else {
                System.out.println("Ingresa una medida correcta!!!");
            }
        } while (true);
        
        area=base * altura;
        System.out.print("Area: "+area+" cm2");
                                    

    }
}
