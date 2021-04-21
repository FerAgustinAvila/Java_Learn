package org.ferdev.inheritance;

public class Alumno extends Persona{

    private String universidad;
    private double notasAlgebra;
    private double notasIngles;
    private double notasAnalisis;

    public Alumno(){
        super();
        System.out.println(" Alumno: iniciando constructor... ");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String universidad) {
        super(nombre, apellido, edad);
        this.universidad = universidad;
    }

    public Alumno(String nombre, String apellido, int edad, String universidad, double notasAlgebra, double notasIngles, double notasAnalisis) {
        this(nombre, apellido, edad, universidad);
        this.notasAlgebra = notasAlgebra;
        this.notasIngles = notasIngles;
        this.notasAnalisis = notasAnalisis;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public double getNotasAlgebra() {
        return notasAlgebra;
    }

    public void setNotasAlgebra(double notasAlgebra) {
        this.notasAlgebra = notasAlgebra;
    }

    public double getNotasIngles() {
        return notasIngles;
    }

    public void setNotasIngles(double notasIngles) {
        this.notasIngles = notasIngles;
    }

    public double getNotasAnalisis() {
        return notasAnalisis;
    }

    public void setNotasAnalisis(double notasAnalisis) {
        this.notasAnalisis = notasAnalisis;
    }

    @Override
    public String saludar(){
//        return "Buenas! Soy alumno y mi nombre es: " + getNombre();
        String saludar = super.saludar();
        return saludar + " Soy alumno y mi nombre es: " + getNombre();
    }

    public double calcularPromedio(){
        return ( notasAlgebra + notasAnalisis + notasIngles ) / 3;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nuniversidad='" + universidad + '\'' +
                ", notasAlgebra=" + notasAlgebra +
                ", notasIngles=" + notasIngles +
                ", notasAnalisis=" + notasAnalisis +
                ", promedio= " + this.calcularPromedio();
    }
}
