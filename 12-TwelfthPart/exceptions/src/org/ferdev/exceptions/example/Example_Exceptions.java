package org.ferdev.exceptions.example;

import javax.swing.*;

public class Example_Exceptions {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        String numerator = JOptionPane.showInputDialog("Ingrese un entero para el numerador:");
        String divider = JOptionPane.showInputDialog("Ingrese un entero para el denominador:");
        
        try {
            double division2 = cal.divide(numerator, divider);
            System.out.println("\nDivision 2: \n" + division2 );
        } catch (ArithmeticException e) {
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
            main(args);
        } catch (DivisionByZero_Exception e) {
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
            main(args);
        }catch (NumberFormatException e) {
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
            main(args);
        }/* finally {
            System.out.println("\nFINALLY \n" +
                    "Bloque opcional. \n" +
                    "Se ejecuta siempre con o sin la excepcion\n" +
                    "Serviria por ejemplo para cerrar la conexion a una base de datos\n" +
                    "FIN DEL FINALLY\n");
        }*/ catch (FormatNumber_Exception e) {
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
            e.printStackTrace(System.out);
            main(args);
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!");
    }
}
