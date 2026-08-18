/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectos.ejercicioseis;

import java.util.Scanner;

/**
 *
 * @author tatyp
 */
public class EjercicioSeis {

    public static void main(String[] args) {
        int numero=3;
        int cantidad=1;
        boolean resp=true;
        System.out.print(2+", ");
        while(cantidad<100){
            resp=true;
            for (int i = 2; i <numero; i++) {              
                if(numero%i==0){
                    resp=false;
                    break;
                }
            }
            if (resp){
                if(cantidad%10==0){
                System.out.println(numero+", ");
                }else{
                System.out.print(numero+", ");
                }
                cantidad++;                 
            }numero++;
        }
    }
}
