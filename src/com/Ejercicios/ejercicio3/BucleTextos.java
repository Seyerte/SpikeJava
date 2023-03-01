package com.Ejercicios.ejercicio3;

public class BucleTextos {
    public static void main(String[] args) {

        String[] Nombres = {"Elena", "Pedro", "Maria", "Juan", "Jose", "Lucia"};
        String suma = "";

        for (String nombre : Nombres) {
            suma += nombre  + " ";
        }

        System.out.println(suma);

    }
}
