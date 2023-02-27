package com.SpikeJava;

public class SwitchCase {
    public static void main(String[] args) {

        String weather = "no esta muy claro";

        switch (weather) {

            case"sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break; // si no estuviera el break ejecuta la siguiente
            default:
                System.out.println("No se ha podido identificar el clima");
        }
    }
}
