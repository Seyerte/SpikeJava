package com.interfaces.sininterfaces;

public class Empleado {

    // 1. atributos
    String nombre;
    int edad;
    double salario;
    boolean activo;

    // 2. constructores

    public Empleado(String nombre, int edad, double salario, boolean activo){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.activo = activo;
    }

    // 3. metodos


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", activo=" + activo +
                '}';
    }
}
