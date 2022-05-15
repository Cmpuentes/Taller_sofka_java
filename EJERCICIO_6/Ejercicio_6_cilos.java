package EJERCICIO_6;
import java.util.Scanner;

public class Ejercicio_6_cilos {

    public void almacenarContacto(String contacto_1[], String contacto_2[], String contacto_3[]){
        Scanner teclado = new Scanner(System.in);
        if (contacto_1[0] == ""){
            System.out.println("Escriba el nombre del contacto");
            contacto_1[0] = teclado.nextLine();

            System.out.println("Escriba el teléfono del contacto");
            contacto_1[1] = teclado.next();

            System.out.println("Escriba la compañia del contacto");
            teclado.nextLine();
            contacto_1[2] = teclado.nextLine();

            System.out.println("Contacto almacenado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (contacto_2[0] == "") {
            System.out.println("Escriba el nombre del contacto");
            contacto_2[0] = teclado.nextLine();

            System.out.println("Escriba el teléfono del contacto");
            contacto_2[1] = teclado.next();

            System.out.println("Escriba la compañia del contacto");
            teclado.nextLine();
            contacto_2[2] = teclado.nextLine();

            System.out.println("Contacto almacenado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (contacto_3[0] == "") {
            System.out.println("Escriba el nombre del contacto");
            contacto_3[0] = teclado.nextLine();

            System.out.println("Escriba el teléfono del contacto");
            contacto_3[1] = teclado.next();

            System.out.println("Escriba la compañia del contacto");
            teclado.nextLine();
            contacto_3[2] = teclado.nextLine();

            System.out.println("Contacto almacenado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        }else {
            System.out.println("No puedes almacenar más contactos");
            System.out.println();
        }
    }
    //*****************************************************************************************************************
    public void buscarContacto(String contacto_1[], String contacto_2[], String contacto_3[]){
        Scanner teclado = new Scanner(System.in);
        int selec;
        String nombre, numero;
        System.out.println("¿Desea buscar el contacto por nombre o número de contacto?");
        System.out.println("1 - nombre.");
        System.out.println("2 - número");
        selec = teclado.nextInt();

        switch (selec){
            case 1:
                System.out.println("Escriba el nombre del contacto que desea buscar");
                teclado.nextLine();
                nombre = teclado.nextLine();

                if (nombre.equalsIgnoreCase(contacto_1[0])){
                    for (int i = 0; i < contacto_1.length; i++){
                        System.out.println(contacto_1[i]);
                    }
                    System.out.println("-------------------------------------------------------");
                    System.out.println();

                } else if (nombre.equalsIgnoreCase(contacto_2[0])) {
                    for (int i = 0; i < contacto_2.length; i++){
                        System.out.println(contacto_2[i]);
                    }
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                } else if (nombre.equalsIgnoreCase(contacto_3[0])) {
                    for (int i = 0; i < contacto_3.length; i++){
                        System.out.println(contacto_3[i]);
                    }
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }else {
                    System.out.println("Contacto no registrado");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("Escriba el número de contacto que desea buscar");
                numero = teclado.next();

                if (numero.equals(contacto_1[1])){
                    for (int i = 0; i < contacto_1.length; i++){
                        System.out.println(contacto_1[i]);
                    }
                    System.out.println("-------------------------------------------------------");
                    System.out.println();

                } else if (numero.equals(contacto_2[1])) {
                    for (int i = 0; i < contacto_2.length; i++){
                        System.out.println(contacto_2[i]);
                    }
                    System.out.println("-------------------------------------------------------");
                    System.out.println();

                }else if (numero.equals(contacto_3[1])){
                    for (int i = 0; i < contacto_3.length; i++){
                        System.out.println(contacto_3[i]);
                    }
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
            }else {
                    System.out.println("Contacto no registrado");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
                break;
        }
    }
    //*****************************************************************************************************************
    public void eliminarContacto(String contacto_1[], String contacto_2[], String contacto_3[]){
        Scanner teclado = new Scanner(System.in);
        int eliminar;
        System.out.println("Seleccione el contacto que desea eliminar");
        System.out.println("1 - Contacto "+contacto_1[0]);
        System.out.println("2 - Contacto "+contacto_2[0]);
        System.out.println("3 - Contacto "+contacto_3[0]);
        eliminar = teclado.nextInt();

        switch (eliminar){
            case 1:
                if (contacto_1[0] == ""){
                    System.out.println("No hay registro");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();

                }else {
                    if (eliminar == 1){
                        for (int i = 0; i < contacto_1.length; i++){
                            contacto_1[i] = "";
                        }
                        System.out.println("Contacto eliminado con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                    }
                }
                break;

            case 2:
                if (contacto_2[0] == ""){
                    System.out.println("No hay registro");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();

                }else {
                    if (eliminar == 2){
                        for (int i = 0; i < contacto_2.length; i++){
                            contacto_2[i] = "";
                        }
                        System.out.println("Contacto eliminado con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                    }
                }
                break;

            case 3:
                if (contacto_3[0] == ""){
                    System.out.println("No hay registro");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();

                }else {
                    if (eliminar == 3){
                        for (int i = 0; i < contacto_1.length; i++){
                            contacto_3[i] = "";
                        }
                        System.out.println("Contacto eliminado con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                    }
                }
                break;
        }
    }
}