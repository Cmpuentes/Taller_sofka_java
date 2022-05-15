package EJERCICIO_6;
import EJERCICIO_5.Ejercicio_5_condidionales;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        System.out.println("Escoja la opción que desee realizar:");
        System.out.println("1 - Ingreso de moto al taller.");
        System.out.println("2 - Salida de moto al taller.");
        opcion = teclado.nextInt();
        Ejercicio_6_condidionales pilas = new Ejercicio_6_condidionales();

        switch (opcion){
            case 1:
                pilas.entradaMoto();
                break;
            case 2:
                pilas.salidaMoto();
                break;
        }
    }
}