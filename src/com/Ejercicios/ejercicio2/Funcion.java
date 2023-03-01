package com.Ejercicios.ejercicio2;

import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {

        double iva = 1.21;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el precio sin Iva: ");
        double precioSinIva = scanner.nextDouble();

        System.out.println("El precio sin Iva es: " + precioSinIva);

        double precioFinal = precioConIva(precioSinIva, iva);
        System.out.println("El precio con Iva es: " + precioFinal);

    }
    static double precioConIva (double a, double b) {
        return a*b;
    }
}
