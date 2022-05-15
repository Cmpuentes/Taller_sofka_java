package EJERCICIO_4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte opcion;

        System.out.println("Seleccione la acción que desea realizar: (oprima el número correspondiente)");
        System.out.println("1 - Consultar películas disponebles.");
        System.out.println("2 - Alquilar película.");
        System.out.println("3 - Notificar película.");
        System.out.println("4 - Finalizar.");
        opcion = teclado.nextByte();

        Ejercicio_4_condicionales seleccion = new Ejercicio_4_condicionales();
        seleccion.consultar(opcion);
        seleccion.alquilar(opcion);
        seleccion.notificar(opcion);
        seleccion.finalizar(opcion);
    }
}