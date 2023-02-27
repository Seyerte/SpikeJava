package com.SpikeJava;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "Opel Corsa";
        Coche cocheObj = new Coche();

        Coche cocheObj2 =new Coche("azul", "opel", "corsa", 1030.50, 4.5);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1100.5;

        System.out.println(cocheObj2);

    }
}
