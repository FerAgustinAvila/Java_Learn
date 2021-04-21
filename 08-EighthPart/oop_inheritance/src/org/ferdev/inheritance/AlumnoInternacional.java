package org.ferdev.inheritance;

public class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println(" AlumnoInternacional: iniciando constructor... ");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return "Probando override methods\n " + super.saludar() + "\nHi! I am from " + getPais() + ". Where are you " +
                "from?";
    }

    @Override
    public double calcularPromedio() {
        return ((super.calcularPromedio() * 3) + notaIdiomas) / 4;
    }

    @Override
    public String toString() {
        return  super.toString() + "pais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
