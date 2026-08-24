/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.proyectos.ejercicio07;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantidadProductos;
        double valorTotal = 0;

        System.out.println("=====INVENTARIO DE PRODUCTOS=====");

        System.out.print("Cantidad de productos: ");
        cantidadProductos = leer.nextInt();
        leer.nextLine();

        String[][] inventario = new String[cantidadProductos][3];
        for (int i = 0; i < cantidadProductos; i++) {

            System.out.println("\nProducto " + (i + 1));
            System.out.print("Nombre: ");
            inventario[i][0] = leer.nextLine();
            System.out.print("Precio: $");
            inventario[i][1] = leer.nextLine();
            System.out.print("Cantidad disponible: ");
            inventario[i][2] = leer.nextLine();
        }

        System.out.println("\n=====INVENTARIO=====");
        System.out.printf("%-20s %-12s %-12s %-15s%n",
                "PRODUCTO", "PRECIO", "CANTIDAD", "SUBTOTAL");

        for (int i = 0; i < cantidadProductos; i++) {

            double precio = Double.parseDouble(inventario[i][1]);
            int cantidad = Integer.parseInt(inventario[i][2]);
            double subtotal = precio * cantidad;
            valorTotal = valorTotal + subtotal;
            System.out.printf("%-20s $%-11.2f %-12d $%-14.2f%n",
                    inventario[i][0],
                    precio,
                    cantidad,
                    subtotal);
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Valor total del inventario: $%.2f%n", valorTotal);
    }
}
