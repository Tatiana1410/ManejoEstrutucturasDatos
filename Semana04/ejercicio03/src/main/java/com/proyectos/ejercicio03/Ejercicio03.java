/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectos.ejercicio03;
import java.util.Scanner;
/**
 *
 * @author tatyp
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ingrese su salario anual: $");
                String entrada = leer.nextLine();
                double salario = Double.parseDouble(entrada);
                if (salario < 0) {
                    throw new ArithmeticException(
                        "El salario no puede ser negativo."
                    );
                }
                double impuesto;
                if (salario <= 6600) {
                    impuesto = 0;
                } else if (salario <= 9142.86) {
                    impuesto = ((salario - 6600) * 0.10) + 212.12;

                } else if (salario <= 22857.14) {
                    impuesto = ((salario - 9142.86) * 0.20) + 720.00;
                } else {
                    impuesto = ((salario - 22857.14) * 0.30) + 3462.86;
                }
                System.out.printf(
                    "Salario anual: $%.2f%n", salario
                );

                System.out.printf(
                    "Impuesto sobre la renta: $%.2f%n", impuesto
                );
                break;
            } catch (NumberFormatException e) {
                System.out.println(
                    "Error: debe ingresar únicamente un salario numérico."
                );
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        leer.close();
    }
}
