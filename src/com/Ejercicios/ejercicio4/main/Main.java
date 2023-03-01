package com.Ejercicios.ejercicio4.main;

import com.Ejercicios.ejercicio4.clases.SmartPhone;
import com.Ejercicios.ejercicio4.clases.SmartWatch;

public class Main {
    public static void main(String[] args) {

        String smartPhone = String.valueOf(new SmartPhone("white", "apple", "iphone", "silicon", 1.5, 1100.50));
        System.out.println(smartPhone);

        String smartWatch = String.valueOf(new SmartWatch("red","apple", "watch", "silicon", 0.3, 500.20));
        System.out.println(smartWatch);
    }

}
