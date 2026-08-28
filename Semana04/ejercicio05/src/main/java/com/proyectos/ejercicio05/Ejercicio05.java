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
        System.out.println("=======REGISTRO DE NUEVO USUARIO=======\n");
        System.out.println("Ingrese su nombre de usuario: ");
        String password="",passwDos="";
        String nombre = leer.nextLine();
        while (true) {
            try {
                System.out.println("Ingrese su contraseña: ");
                password = leer.nextLine();
                validarContrasenia(password);
                System.out.println("Repetir contraseña: ");
                passwDos = leer.nextLine();
                if (!password.equals(passwDos)) {
                    System.out.println(""+password + " 2."+passwDos);
                    throw new Exception("Las contraseñas no coinciden!!!");
                }
                System.out.println("\n*****USUARIO REGISTRADO*****");
                break;
            } catch (SecurityException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void validarContrasenia(String password) {

        if (password.length() < 8) {
            throw new SecurityException(
                    "La contraseña debe tener al menos 8 caracteres."
            );
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new SecurityException(
                    "La contraseña debe contener al menos una letra mayúscula."
            );
        }

        if (!password.matches(".*[a-z].*")) {
            throw new SecurityException(
                    "La contraseña debe contener al menos una letra minúscula."
            );
        }

        if (!password.matches(".*[0-9].*")) {
            throw new SecurityException(
                    "La contraseña debe contener al menos un número."
            );
        }

        if (!password.matches(".*[!@#$%&*].*")) {
            throw new SecurityException(
                    "La contraseña debe contener al menos un carácter especial."
            );
        }
    }
}
