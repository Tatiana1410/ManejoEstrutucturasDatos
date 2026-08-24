/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejercicio04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();
        String producto, continuar;
        double precio, total = 0;
        System.out.println("=====REGISTRO DE COMPRAS=====");
        do {

            System.out.print("Nombre del producto: ");
            producto = leer.nextLine();

            System.out.print("Precio del producto: $");
            precio = leer.nextDouble();
            leer.nextLine();
            productos.add(producto);
            precios.add(precio);

            System.out.print("¿Desea agregar otro producto? (S/N): ");
            continuar = leer.nextLine();

        } while (continuar.equalsIgnoreCase("S"));
        System.out.println("\n=====LISTA DE PRODUCTOS=====");

        for (int i = 0; i < productos.size(); i++) {

            System.out.println(
                    productos.get(i) + " - $" + precios.get(i)
            );
            total = total + precios.get(i);
        }
        System.out.println("\nTotal de la compra: $" + total);
    }
}
