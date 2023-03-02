package com.interfaces.sininterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

      /*  EmpleadoCRUDV1 empleadoCRUDV1 = new EmpleadoCRUDV1();

        Empleado pedro = new Empleado("Pedro", 35, 40000, true);
        Empleado marta = new Empleado("Marta", 30, 40000, true);
        Empleado laura = new Empleado("Laura", 42, 40000, true);


        // guardar empleados
       *//*empleadoCRUDV1.save(pedro);
       empleadoCRUDV1.save(marta);
       empleadoCRUDV1.save(laura);
*//*
       // consultar empleados

        List<Empleado> empleados = empleadoCRUDV2.findAll();
        System.out.println(empleados);*/

        // usamos V2

        EmpleadoCRUDV2 empleadoCRUDV2 = new EmpleadoCRUDV2();

        Empleado pedro = new Empleado("Pedro", 35, 40000, true);
        Empleado marta = new Empleado("Marta", 30, 40000, true);
        Empleado laura = new Empleado("Laura", 42, 40000, true);

        System.out.println(pedro);



        // consultar empleados

        List<Empleado> empleados = empleadoCRUDV2.recuperarEmpleados();
        System.out.println(empleados);




    }
}
