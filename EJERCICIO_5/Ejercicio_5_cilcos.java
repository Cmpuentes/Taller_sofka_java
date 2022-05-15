package EJERCICIO_5;
import java.util.Scanner;

public class Ejercicio_5_cilcos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte opcion;
        String nombre = "";

        opcion = 0;

        while (opcion != 3){
            System.out.println("Bienvenido, seleccione la opción que desee");
            System.out.println("1 - Capturar nombre.");
            System.out.println("2 - Saludar persona.");
            System.out.println("3 - Salir del sistema.");
            opcion = teclado.nextByte();

            switch (opcion){
                case 1:
                    System.out.print("Escriba su nombre: ");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 2:
                    if (nombre == ""){
                        System.out.println("Ingresa tu nombre para poder saludarte");
                    }else {
                        System.out.println("Hola "+nombre);
                    }
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Proceso finalizado");
                    break;
            }
        }
    }
}
