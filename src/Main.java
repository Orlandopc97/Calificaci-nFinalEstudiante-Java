import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       double participacion, primerExamen, segundoExamen, examenFinal, calificacionF;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita la nota de participacion: ");
        participacion = entrada.nextDouble();
        System.out.println("Digita la nota del primer examen: ");
        primerExamen = entrada.nextDouble();
        System.out.println("Digita la nota del segundo examen: ");
        segundoExamen = entrada.nextDouble();
        System.out.println("Digita la nota del examen final: ");
        examenFinal = entrada.nextDouble();

        participacion *= 0.1;
        primerExamen *= 0.25;
        segundoExamen *= 0.25;
        examenFinal *= 0.4;

        calificacionF = participacion + primerExamen + segundoExamen + examenFinal;
        System.out.println("La calificacion final es: " +calificacionF);

        //hacer un programa que calcule el cuadrado de una suma

    }
}