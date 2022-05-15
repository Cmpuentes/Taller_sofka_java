package EJERCICIO_8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte opcion;

        System.out.println("Vienvenido a la pasteleria don Carlos");
        System.out.println("Seleccione la opción que desee:");

        System.out.println("1 - Sobre los postres.");
        System.out.println("2 - Postres disponibles.");
        System.out.println("3 - Realizar pedido.");
        System.out.println("4 - Finalizar");
        opcion = teclado.nextByte();
        Ejercicio_8_condidionales postres = new Ejercicio_8_condidionales();

        switch (opcion){
            case 1:
                postres.sobrePostres();
                break;

            case 2:
                postres.postresDisponibles();
                break;

            case 3:
                postres.realizarPedido();
                break;

            case 4:
                System.out.println("Proceso finalizado");
                break;
        }
    }
}
