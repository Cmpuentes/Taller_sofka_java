package EJERCICIO_8;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int centinela = 1, opcion;
        String cliente_1[] = new String[3];
        String cliente_2[] = new String[3];
        String cliente_3[] = new String[3];
        String cliente_4[] = new String[3];
        String cliente_5[] = new String[3];
        String cliente_6[] = new String[3];
        String cliente_7[] = new String[3];
        String cliente_8[] = new String[3];

        cliente_1[0] = "";
        cliente_2[0] = "";
        cliente_3[0] = "";
        cliente_4[0] = "";
        cliente_5[0] = "";
        cliente_6[0] = "";
        cliente_7[0] = "";
        cliente_8[0] = "";

        cliente_1[1] = "";
        cliente_2[1] = "";
        cliente_3[1] = "";
        cliente_4[1] = "";
        cliente_5[1] = "";
        cliente_6[1] = "";
        cliente_7[1] = "";
        cliente_8[1] = "";

        cliente_1[2] = "";
        cliente_2[2] = "";
        cliente_3[2] = "";
        cliente_4[2] = "";
        cliente_5[2] = "";
        cliente_6[2] = "";
        cliente_7[2] = "";
        cliente_8[2] = "";

        while (centinela == 1){
            System.out.println("Seleccione la opción que desee");
            System.out.println("1 - Registrar cliente.");
            System.out.println("2 - Evaluar");
            System.out.println("3 - Consultar cliente.");
            System.out.println("4 - Mostrar resultado.");
            System.out.println("5 - Finalizar");
            System.out.println("-------------------------------------------------------------------------");
            opcion = teclado.nextInt();
            Ejercicio_8_ciclos ob = new Ejercicio_8_ciclos();

            switch (opcion){
                case 1:
                    ob.registrarCliente(cliente_1,cliente_2, cliente_3, cliente_4, cliente_5, cliente_6, cliente_7, cliente_8);
                    break;

                case 2:
                    ob.evaluar(cliente_1,cliente_2, cliente_3, cliente_4, cliente_5, cliente_6, cliente_7, cliente_8);
                    break;

                case 3:
                    ob.consultarCliente(cliente_1,cliente_2, cliente_3, cliente_4, cliente_5, cliente_6, cliente_7, cliente_8);
                    break;

                case 4:
                    ob.mostrarResultados(cliente_1,cliente_2, cliente_3, cliente_4, cliente_5, cliente_6, cliente_7, cliente_8);
                    break;

                case 5:
                    System.out.println("Proceso finalizado");
                    centinela = 0;
                    break;
            }

        }

    }
}