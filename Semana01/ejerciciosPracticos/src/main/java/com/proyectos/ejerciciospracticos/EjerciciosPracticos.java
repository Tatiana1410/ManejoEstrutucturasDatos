/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectos.ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */

public class EjerciciosPracticos {

    static Scanner leer = new Scanner(System.in);
    
    //ejercicio 1
    static public void dolaraEuro() {
        double dolares, euros;
        System.out.print("Dolares: $");
        dolares = leer.nextDouble();
        euros = dolares * 1.14;
        System.out.printf("Euros: $%.2f%n", euros);
        System.out.print("");
    }

    //ejercicio 2
    static public void volumen() {
        System.out.print("Ingrese la medida de un lado del cubo: ");
        double ladoCubo = leer.nextDouble();
        double volumenCubo = ladoCubo * 3;
        System.out.printf("Volumen del cubo: %.2f cm^3%n", volumenCubo);
        System.out.print("");
    }
    
    //ejercicio 3
    static public void promedioNotas() {
        double notaUno, notaDos, notaTres, promedio;
        System.out.print("Nota 1: ");
        notaUno = leer.nextDouble();
        System.out.print("Nota 2: ");
        notaDos = leer.nextDouble();
        System.out.print("Nota 3: ");
        notaTres = leer.nextDouble();
        promedio = (notaUno + notaDos + notaTres) / 3;
        System.out.printf("Promedio de notas: %.2f%n", promedio);
        System.out.printf("");

    }

    //ejercicio 4
    static public void areaDiametro() {
        System.out.print("Ingrese la medida del radio de la circunferencia: ");
        double radio = leer.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        double diametro = radio * 2;
        System.out.printf("Diámetro de la circunferencia: %.2f cm%n", diametro);
        System.out.printf("Área de la circunferencia: %.2f cm^2%n", area);

        System.out.print("");
    }
     
    //ejercicio 5
    static public void iva(){
        System.out.print("Precio: $");
        double p=leer.nextDouble();
        double iva=p*0.13;
        System.out.printf("IVA: $%.2f%n",iva);
    }
    public static void main(String[] args) {
        int opcion = 0;
        System.out.print("Opciones: \n1.Convertir dolares a euros\n2.Calcular Volumen de un cubo"
                + "\n3.Promedio de 3 notas\n4.Área y diámetro de una circunferencia\n5.Calcular IVA\nRespuesta: ");
        opcion = leer.nextInt();
        System.out.print("");
        switch (opcion) {
            case 1:
                dolaraEuro();
                break;
            case 2:
                volumen();
                break;
            case 3:
                promedioNotas();
                break;
            case 4:
                areaDiametro();
                break;
            case 5:
                iva();
                break;
            default:
                System.out.print("Opción invalida!!");
        }

    }
}
