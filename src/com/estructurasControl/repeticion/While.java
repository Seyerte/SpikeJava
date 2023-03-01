package com.estructurasControl.repeticion;

public class While {
    public static void main(String[] args) {

        int contador = 0;
        while (contador < 10) {

            contador++;
            if (contador == 5) { // condicion para el contador
                //break; //lo rompe
                continue;// cuando haya determinados valores que quieras excluir de la operacion
            }
            System.out.println("Valor de contador " + contador);
        }
        System.out.println("Fin del While");
    }
}

// el bucle while es una instruccion que
// se ejecuta hasta que se cumpla la condición