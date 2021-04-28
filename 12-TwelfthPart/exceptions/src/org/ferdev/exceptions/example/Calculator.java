package org.ferdev.exceptions.example;

public class Calculator {

    public double divide(int numerator,int divider) throws DivisionByZero_Exception {
        if ( divider == 0 ){
            throw new DivisionByZero_Exception("No se puede dividir por cero!");
        }
        return numerator/ (double) divider;
    }

    public double divide(String numerator, String divider) throws DivisionByZero_Exception, FormatNumber_Exception {
        try{
            int num = Integer.parseInt(numerator);
            int div = Integer.parseInt(divider);
            return this.divide( num, div);
        } catch (NumberFormatException e) {
            throw new FormatNumber_Exception("No se puede dividir por cero!");
        }

    }
}
