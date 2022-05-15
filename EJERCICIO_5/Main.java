package EJERCICIO_5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte opcion;

        System.out.println("Seleccione la opcion que desee: (Oprima el númerocorrespondiente)");
        System.out.println("1 - Caracteristicas de medicamentos.");
        System.out.println("2 - Consultar precio de medicamento.");
        System.out.println("3 - Comprar medicamento.");
        System.out.println("4 - Devolución de medicamento.");
        System.out.println("5 - Finalizar.");
        opcion = teclado.nextByte();

        Ejercicio_5_condidionales opciones = new Ejercicio_5_condidionales();
        switch (opcion){
            case 1:
                opciones.caracteristicasMedicamentos();
                break;

            case 2:
                opciones.consultarMedicamentos();
                break;

            case 3:
                opciones.compraMedicamento();
                break;

            case 4:
                opciones.devolucion();
                break;

            case 5:
                System.out.println("Proceso finalizado");
                break;
        }
    }
}
