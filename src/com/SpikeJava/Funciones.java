package com.SpikeJava;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();
        //holaMundo();

        //holaMundo("Esther");
        //holaMundo("Pepa");

        String hola = devolverHola();
        System.out.println(hola);

    }
    public static void holaMundo(){
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }
    private static void holaMundo(String name){
        System.out.println("Hola "+ name);
    }

    private static String devolverHola(){

        return "Hola";
    }

    private static int sum (int num1, int num2){
        return num1 + num2;
    }

}
