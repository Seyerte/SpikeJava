package com.SpikeJava;

public class Sobrecarga {
    public static void main(String[] args) {

    }

    // cuando hay sobrecarga, podriamos duplicarla si cambiamos el numero de parametros
    //
    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static int suma(int num1, int num2, int num3) {
        return num1 + num2;
    }
}
