package org.ferdev;

import org.ferdev.entity.Estudiante;

import java.util.Scanner;

public class Main {
    public static void test(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.print("Ingrese cantidad de estudiantes: ");
        int cantidadEstudiantes = sn.nextInt();
        double total = 0D;
        double promedio;
        for(int cant = 0; cant < cantidadEstudiantes; cant++){
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = sn.nextLine();
            System.out.print("Ingrese la nota del estudiante " + (cant + 1) + " : ");
            double nota = sn.nextDouble();
            total += nota;
        }
        promedio = total / cantidadEstudiantes;
        System.out.println("El promedio de todos los estudiantes es: " + promedio);

    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese nombre de estudiante: ");
        String nombre = sn.nextLine();
        System.out.println(nombre);
    }
}
