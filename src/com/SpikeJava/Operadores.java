package com.SpikeJava;

public class Operadores {
    public static void main(String[] args) {

        //ariteticos:
        int numero1 = 10;
        int numero2 = 20;
        int resultadosuma = numero1 + numero2;

        System.out.println(resultadosuma);
        System.out.println(resultadosuma + 5.77);

        int resultadoResta = numero1 - numero2;

        /*
        > mayor que
        < menor que
        >= mayor o igual que
        <= menor o igual que
        == igual que
         */

        boolean resultado1 = numero1 > numero2; // false
        System.out.println(resultado1);

        boolean resultado2 = numero2 > numero1; // true
        System.out.println(resultado2);

        /*ir depurando el codigo con debug
        poniendo punto de break point y el programa se para y se podra
        ir viendo linea a linea que es lo que pasa
         */

        /*Lógicos
        and &&
        or ||
         */

        boolean resultado3 = numero1 > 5 && numero1 < 30;


        int edad = 17;
        boolean carnetJoven = edad > 15 && edad <= 30;


        // Operadores

        // aritmeticos

        // + - / * %
        /*int number1 = 1;
        int number2 = 2;
        int resultado1 = number1 + number2;
        int resultado2 = number1 - number2;
        int resultado3 = number1 * number2;
        int resultado4 = number1 / number2;*/

        // logicos, relacion, comparacion, booleanos

        /*
        >
        >=
        <
        <=
        == comparacion
        != diferente a
        && and operador booleano
        || or esto o esto otro
        !
         */

        // asignacion
        /*
        =
        +=
        -=
        /=
        *=
        %=
         */

        //incremento
        //++

        //decremento
        //--

        //concatenacion
        // +

    }
}
