package com.funciones;

public class Funciones {


    static double getPrice() {
        return 100.00;
    }
    static void showMenu() {
        System.out.println("Bienvenido al E-commerce de zapatillas");
        System.out.println("1- Ver zapatillas");
        System.out.println("2- Comprar zapatillas");
        System.out.println("3- Salir");
    }

    static String getMenu() {
        return "Bienvenido al E-commerce de zapatillas: \n 1- Ver zapatillas...";
    }


    public static void main(String[] args) {

        //Crear funciones

        // opcion 1: funcion sin parametros y sin tipo retorno
        //showMenu();
        //showMenu();

        // opcion 2: funcion sin parametros y con tipo retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();
        System.out.println(price);

        // Opcion 3: funcion con parametros y sin tipo retorno

        imprimirSaludoBuenosDias ("Esther");

        // opcion 4: funcion con parametros y con tipo retorno

        String nombre = "Esther";
        String apellido = "Reyes";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);


        int resultadoSuma = suma(50, 300);
        System.out.println(resultadoSuma);

    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenos dias, " + nombre + " " + apellido;
    }

    static void imprimirSaludoBuenosDias(String nombre) {
        System.out.println("Buenos dias " + nombre);
    }


       // holaMundo();
       // holaMundo(4);
        // holaMundo("Nombre");
        //holaMundo();

        //holaMundo("Esther");
        //holaMundo("Pepa");

        //String hola = devolverHola();
        //System.out.println(hola);


    public static void holaMundo(){
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }
    private static void holaMundo(String name){

        System.out.println("Hola "+ name);
    }

    private static void holaMundo(Integer number){

        System.out.println("El numero es:  "+ number);
    }

    private static void holaMundo(String name, String surname){

        System.out.println("Hola "+ name + " " + surname);
    }


    private static String devolverHola(){

        return "Hola";
    }

    private static int sum (int num1, int num2){
        return num1 + num2;
    }

}
