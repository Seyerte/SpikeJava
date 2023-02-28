package com.SpikeJava;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        // println sirve para escribir en pantalla
        //System.out.println("Hola Mundo");
        //Si queremos escribir datos tenemos que usar System.in

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce un numero");
        int numero= scanner.nextInt();

        System.out.println("El nombre introducido es: " + nombre);

        System.out.println("Hola Mundo");


    }
}

// Interactivo, escribir en consola
