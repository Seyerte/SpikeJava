package com.estructurasControl.condicionales;

import com.exception.NameFormatException;

import java.util.Scanner;

public class ThrowMain {
    public static void main(String[] args) {
        try {
            leerNombres();
        } catch (NameFormatException e) { //capturar una excepcion
            e.printStackTrace();
        }
    }
/*
Lanzar metodos de un nivel a otro, capturarla y gestionarla
El metodo principal que manda a realizar el reporte
 */

/**
 * Metodo que lee los nombres de consola y verifica que tengan longitud igual
 * o mayor que 8 caracteres.
 * @throws NameFormatException
 */
 // throws es la asignacion del metodo para capturar una excepcion
// throw es para lanzarla
private static void leerNombres() throws NameFormatException {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un nombre");
    while (teclado.hasNext()) {
        System.out.println("Introduce un nombre");
        String nombre = teclado.nextLine();
        if (nombre.length() < 8) {
            throw new NameFormatException("El nombre debe tener al menos 8 caracteres");
        }
    }
    teclado.close();
 }
}
