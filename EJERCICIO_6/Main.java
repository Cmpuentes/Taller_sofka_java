package EJERCICIO_6;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int centinela, opcion;
        String contacto_1 [] = new String[3];
        String contacto_2 [] = new String[3];
        String contacto_3 [] = new String[3];

        centinela = 1;

        contacto_1[0] = "";
        contacto_2[0] = "";
        contacto_3[0] = "";

        contacto_1[1] = "";
        contacto_2[1] = "";
        contacto_3[1] = "";

        while (centinela == 1){
            System.out.println("bienvenido, por favor seleccione la opción que desee");
            System.out.println("1 - Almacenar contacto.");
            System.out.println("2 - Buscar contacto.");
            System.out.println("3 - Eliminar contacto.");
            System.out.println("4 - Finalizar.");
            System.out.println("-------------------------------------------------------");
            opcion = teclado.nextInt();
            Ejercicio_6_cilos contactos = new Ejercicio_6_cilos();
            switch (opcion){
                case 1:
                    contactos.almacenarContacto(contacto_1, contacto_2, contacto_3);
                    break;
                case 2:
                    contactos.buscarContacto(contacto_1, contacto_2, contacto_3);
                    break;
                case 3:
                    contactos.eliminarContacto(contacto_1, contacto_2, contacto_3);
                    break;
                case 4:
                    System.out.println("Proceso finalizado");
                    centinela = 0;
                    break;
            }
        }

    }
}