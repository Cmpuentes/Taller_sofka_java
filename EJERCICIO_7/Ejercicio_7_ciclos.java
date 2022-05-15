package EJERCICIO_7;
import java.util.Scanner;

public class Ejercicio_7_ciclos {

    public void ingresarVehiculo(String vehiculo_1[], String vehiculo_2[], String vehiculo_3[], String vehiculo_4[], String vehiculo_5[]){
        Scanner teclado = new Scanner(System.in);
        if (vehiculo_1[0] == ""){
            System.out.println("Ingrese el nombre del cliente");
            vehiculo_1[0] = teclado.nextLine();

            System.out.println("Ingrese el número de telefono del cliente");
            vehiculo_1[1] = teclado.next();

            System.out.println("Ingrese la marca del vehiculo");
            teclado.nextLine();
            vehiculo_1[2] = teclado.nextLine();

            System.out.println("Ingrese la placa del vehiculo");
            vehiculo_1[3] = teclado.next();

            System.out.println("Vehiculo ingresado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (vehiculo_2[0] == "") {
            System.out.println("Ingrese el nombre del cliente");
            vehiculo_2[0] = teclado.nextLine();

            System.out.println("Ingrese el número de telefono del cliente");
            vehiculo_2[1] = teclado.next();

            System.out.println("Ingrese la marca del vehiculo");
            teclado.nextLine();
            vehiculo_2[2] = teclado.nextLine();

            System.out.println("Ingrese la placa del vehiculo");
            vehiculo_2[3] = teclado.next();

            System.out.println("Vehiculo ingresado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (vehiculo_3[0] == "") {
            System.out.println("Ingrese el nombre del cliente");
            vehiculo_3[0] = teclado.nextLine();

            System.out.println("Ingrese el número de telefono del cliente");
            vehiculo_3[1] = teclado.next();

            System.out.println("Ingrese la marca del vehiculo");
            teclado.nextLine();
            vehiculo_3[2] = teclado.nextLine();

            System.out.println("Ingrese la placa del vehiculo");
            vehiculo_3[3] = teclado.next();

            System.out.println("Vehiculo ingresado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (vehiculo_4[0] == "") {
            System.out.println("Ingrese el nombre del cliente");
            vehiculo_4[0] = teclado.nextLine();

            System.out.println("Ingrese el número de telefono del cliente");
            vehiculo_4[1] = teclado.next();

            System.out.println("Ingrese la marca del vehiculo");
            teclado.nextLine();
            vehiculo_4[2] = teclado.nextLine();

            System.out.println("Ingrese la placa del vehiculo");
            vehiculo_4[3] = teclado.next();

            System.out.println("Vehiculo ingresado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (vehiculo_5[0] == "") {
            System.out.println("Ingrese el nombre del cliente");
            vehiculo_4[0] = teclado.nextLine();

            System.out.println("Ingrese el número de telefono del cliente");
            vehiculo_4[1] = teclado.next();

            System.out.println("Ingrese la marca del vehiculo");
            teclado.nextLine();
            vehiculo_4[2] = teclado.nextLine();

            System.out.println("Ingrese la placa del vehiculo");
            vehiculo_4[3] = teclado.next();

            System.out.println("Vehiculo ingresado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        }else {
            System.out.println("No se puede ingresar más vehiculos");
            System.out.println("-------------------------------------------------------");
            System.out.println();
        }
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void consultar(String vehiculo_1[], String vehiculo_2[], String vehiculo_3[], String vehiculo_4[], String vehiculo_5[]){
        Scanner teclado = new Scanner(System.in);
        String placa;
        System.out.println("Ingrese la placa del vehicula a buscar");
        placa = teclado.next();

        if (placa.equals(vehiculo_1[3])){
            for (int i = 0; i < vehiculo_1.length; i++){
                System.out.println(vehiculo_1[i]);
            }
            System.out.println("Se encuentra en el parqueadero");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (placa.equals(vehiculo_2[3])) {
            for (int i = 0; i < vehiculo_2.length; i++){
                System.out.println(vehiculo_2[i]);
            }
            System.out.println("Se encuentra en el parqueadero");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (placa.equals(vehiculo_3[3])) {
            for (int i = 0; i < vehiculo_3.length; i++){
                System.out.println(vehiculo_3[i]);
            }
            System.out.println("Se encuentra en el parqueadero");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (placa.equals(vehiculo_4[3])) {
            for (int i = 0; i < vehiculo_4.length; i++){
                System.out.println(vehiculo_4[i]);
            }
            System.out.println("Se encuentra en el parqueadero");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (placa.equals(vehiculo_5[3])) {
            for (int i = 0; i < vehiculo_4.length; i++){
                System.out.println(vehiculo_4[i]);
            }
            System.out.println("Se encuentra en el parqueadero");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        }else {
            System.out.println("Vehiculo no encontrado");
            System.out.println("-------------------------------------------------------");
            System.out.println();
        }
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void retirarVehiculo(String vehiculo_1[], String vehiculo_2[], String vehiculo_3[], String vehiculo_4[], String vehiculo_5[]){
        Scanner teclado = new Scanner(System.in);
        int retirar;
        System.out.println("Seleccione el vehiculo que desea retirar");
        System.out.println("1 - Placa "+ vehiculo_1[3]);
        System.out.println("2 - Placa "+ vehiculo_2[3]);
        System.out.println("3 - Placa "+ vehiculo_3[3]);
        System.out.println("4 - Placa "+ vehiculo_4[3]);
        System.out.println("5 - Placa "+ vehiculo_5[3]);
        retirar = teclado.nextInt();

        switch (retirar){
            case 1:
                if (vehiculo_1[3] == ""){
                    System.out.println("No hay registro");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }else {
                    if (retirar == 1){
                        vehiculo_1[0] = "";
                        vehiculo_1[1] = "";
                        vehiculo_1[2] = "";
                        vehiculo_1[3] = "";
                        System.out.println("Vehiculo retirado con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                    }
                }
                break;

            case 2:
                if (vehiculo_2[3] == ""){
                    System.out.println("No hay registro");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }else {
                    if (retirar == 2){
                        vehiculo_2[0] = "";
                        vehiculo_2[1] = "";
                        vehiculo_2[2] = "";
                        vehiculo_2[3] = "";
                        System.out.println("Vehiculo retirado con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                    }
                }
                break;

            case 3:
                if (vehiculo_3[3] == ""){
                    System.out.println("No hay registro");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }else {
                    if (retirar == 3){
                        vehiculo_3[0] = "";
                        vehiculo_3[1] = "";
                        vehiculo_3[2] = "";
                        vehiculo_3[3] = "";
                        System.out.println("Vehiculo retirado con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                    }
                }
                break;

            case 4:
                if (vehiculo_4[3] == ""){
                    System.out.println("No hay registro");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }else {
                    if (retirar == 4){
                        vehiculo_4[0] = "";
                        vehiculo_4[1] = "";
                        vehiculo_4[2] = "";
                        vehiculo_4[3] = "";
                        System.out.println("Vehiculo retirado con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                    }
                }
                break;

            case 5:
                if (vehiculo_5[3] == ""){
                    System.out.println("No hay registro");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }else {
                    if (retirar == 5){
                        vehiculo_5[0] = "";
                        vehiculo_5[1] = "";
                        vehiculo_5[2] = "";
                        vehiculo_5[3] = "";
                        System.out.println("Vehiculo retirado con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                    }
                }
                break;
        }
    }
}