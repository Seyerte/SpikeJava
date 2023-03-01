package com.estructurasControl.condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        String dia = "Viernes";

        // ejemplos comparar
        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Martes");

        System.out.println(resultado);

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana");
        } else if (dia.equals("Martes")) {

            System.out.println("Martes con M de ...");
        } else if (dia.equals("Miercoles")) {

            System.out.println("Miercoles, ecuador de la jornada");
        } else if (dia.equals("Jueves")) {

            System.out.println("Ya es juernes");
        } else if (dia.equals("Viernes")) {

            System.out.println("Nos vamos!");
        } else if (dia.equals("Sabado")) {

            System.out.println("Descanso");
        } else if (dia.equals("Depresión")) {

        } else {
            System.out.println("El dia introducido no es valido");
        }


    }
}
