package EJERCICIO_7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String vehiculo_1[] = new String[4];
        String vehiculo_2[] = new String[4];
        String vehiculo_3[] = new String[4];
        String vehiculo_4[] = new String[4];
        String vehiculo_5[] = new String[4];
        int centinela = 1, opcion;

        vehiculo_1[0] = "";
        vehiculo_2[0] = "";
        vehiculo_3[0] = "";
        vehiculo_4[0] = "";
        vehiculo_5[0] = "";

        vehiculo_1[3] = "";
        vehiculo_2[3] = "";
        vehiculo_3[3] = "";
        vehiculo_4[3] = "";
        vehiculo_5[3] = "";

        while (centinela == 1){
            System.out.println("Seleccione la opción que desee");
            System.out.println("1 - Ingresar vehiculo al parqueadero.");
            System.out.println("2 - Consultar si el vehiculo está en el parqueadero.");
            System.out.println("3 - Retirar vehiculo del parqueadero.");
            System.out.println("4 - Finalizar.");
            System.out.println("-------------------------------------------------------------------------");
            opcion = teclado.nextInt();
            Ejercicio_7_ciclos parqueadero = new Ejercicio_7_ciclos();

            switch (opcion){
                case 1:
                    parqueadero.ingresarVehiculo(vehiculo_1, vehiculo_2, vehiculo_3, vehiculo_4, vehiculo_5);
                    break;

                case 2:
                    parqueadero.consultar(vehiculo_1, vehiculo_2, vehiculo_3, vehiculo_4, vehiculo_5);
                    break;

                case 3:
                    parqueadero.retirarVehiculo(vehiculo_1, vehiculo_2, vehiculo_3, vehiculo_4, vehiculo_5);
                    break;

                case 4:
                    System.out.println("Proceso finalizado");
                    centinela = 0;
                    break;
            }
        }
    }
}