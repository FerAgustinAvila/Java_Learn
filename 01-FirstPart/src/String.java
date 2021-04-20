public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String curso = "Programación Java";
        java.lang.String curso2 = new java.lang.String("Programación Java");
        
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);
        
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        java.lang.String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }
}
