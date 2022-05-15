package EJERCICIO_8;
import java.util.Scanner;

public class Ejercicio_8_ciclos {

    public void registrarCliente(String cliente_1[], String cliente_2[], String cliente_3[], String cliente_4[], String cliente_5[], String cliente_6[], String cliente_7[], String cliente_8[]){
        Scanner teclado = new Scanner(System.in);
        if (cliente_1[0] == ""){
            System.out.println("Ingrese el nombre del cliente.");
            cliente_1[0] = teclado.nextLine();

            System.out.println("Ingrese el N° de identidad.");
            cliente_1[1] = teclado.next();

            System.out.println("Cliente registrado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (cliente_2[0] == "") {
            System.out.println("Ingrese el nombre del cliente.");
            cliente_2[0] = teclado.nextLine();

            System.out.println("Ingrese el N° de identidad.");
            cliente_2[1] = teclado.next();

            System.out.println("Cliente registrado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (cliente_3[0] == "") {
            System.out.println("Ingrese el nombre del cliente.");
            cliente_3[0] = teclado.nextLine();

            System.out.println("Ingrese el N° de identidad.");
            cliente_3[1] = teclado.next();

            System.out.println("Cliente registrado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (cliente_4[0] == "") {
            System.out.println("Ingrese el nombre del cliente.");
            cliente_4[0] = teclado.nextLine();

            System.out.println("Ingrese el N° de identidad.");
            cliente_4[1] = teclado.next();

            System.out.println("Cliente registrado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (cliente_5[0] == "") {
            System.out.println("Ingrese el nombre del cliente.");
            cliente_5[0] = teclado.nextLine();

            System.out.println("Ingrese el N° de identidad.");
            cliente_5[1] = teclado.next();

            System.out.println("Cliente registrado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (cliente_6[0] == "") {
            System.out.println("Ingrese el nombre del cliente.");
            cliente_6[0] = teclado.nextLine();

            System.out.println("Ingrese el N° de identidad.");
            cliente_6[1] = teclado.next();

            System.out.println("Cliente registrado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (cliente_7[0] == "") {
            System.out.println("Ingrese el nombre del cliente.");
            cliente_7[0] = teclado.nextLine();

            System.out.println("Ingrese el N° de identidad.");
            cliente_7[1] = teclado.next();

            System.out.println("Cliente registrado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (cliente_8[0] == "") {
            System.out.println("Ingrese el nombre del cliente.");
            cliente_8[0] = teclado.nextLine();

            System.out.println("Ingrese el N° de identidad.");
            cliente_8[1] = teclado.next();

            System.out.println("Cliente registrado con exito");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        }else {
            System.out.println("No puedes registrar más clientes");
            System.out.println("-------------------------------------------------------");
            System.out.println();
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void evaluar(String cliente_1[], String cliente_2[], String cliente_3[], String cliente_4[], String cliente_5[], String cliente_6[], String cliente_7[], String cliente_8[]){
        Scanner teclado = new Scanner (System.in);
        int selec;
        String respuesta;
        System.out.println("Seleccione al cliente que desea evaluar");
        System.out.println("1 - "+cliente_1[0]+" "+cliente_1[1]);
        System.out.println("2 - "+cliente_2[0]+" "+cliente_2[1]);
        System.out.println("3 - "+cliente_3[0]+" "+cliente_3[1]);
        System.out.println("4 - "+cliente_4[0]+" "+cliente_4[1]);
        System.out.println("5 - "+cliente_5[0]+" "+cliente_5[1]);
        System.out.println("6 - "+cliente_6[0]+" "+cliente_6[1]);
        System.out.println("7 - "+cliente_7[0]+" "+cliente_7[1]);
        System.out.println("8 - "+cliente_8[0]+" "+cliente_8[1]);
        selec = teclado.nextInt();

        switch (selec){
            case 1:
                if (cliente_1[0] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println("¿Aprobó el curso "+cliente_1[0]+" "+cliente_1[1]+"?. Responda si o no");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("si")){
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_1[2] = "Aprobado";
                    }else {
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_1[2] = "No aprobado";
                    }
                }
                break;

            case 2:
                if (cliente_2[0] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println("¿Aprobó el curso "+cliente_2[0]+" "+cliente_2[1]+"?. Responda si o no");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("si")){
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_2[2] = "Aprobado";
                    }else {
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_2[2] = "No aprobado";
                    }
                }
                break;

            case 3:
                if (cliente_3[0] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println("¿Aprobó el curso "+cliente_3[0]+" "+cliente_3[1]+"?. Responda si o no");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("si")){
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_3[2] = "Aprobado";
                    }else {
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_3[2] = "No aprobado";
                    }
                }
                break;

            case 4:
                if (cliente_4[0] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println("¿Aprobó el curso "+cliente_4[0]+" "+cliente_4[1]+"?. Responda si o no");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("si")){
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_4[2] = "Aprobado";
                    }else {
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_4[2] = "No aprobado";
                    }
                }
                break;

            case 5:
                if (cliente_5[0] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println("¿Aprobó el curso "+cliente_5[0]+" "+cliente_5[1]+"?. Responda si o no");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("si")){
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_5[2] = "Aprobado";
                    }else {
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_5[2] = "No aprobado";
                    }
                }
                break;

            case 6:
                if (cliente_6[0] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println("¿Aprobó el curso "+cliente_6[0]+" "+cliente_6[1]+"?. Responda si o no");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("si")){
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_6[2] = "Aprobado";
                    }else {
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_6[2] = "No aprobado";
                    }
                }
                break;

            case 7:
                if (cliente_7[0] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println("¿Aprobó el curso "+cliente_7[0]+" "+cliente_7[1]+"?. Responda si o no");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("si")){
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_7[2] = "Aprobado";
                    }else {
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_7[2] = "No aprobado";
                    }
                }
                break;

            case 8:
                if (cliente_8[0] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println("¿Aprobó el curso "+cliente_8[0]+" "+cliente_8[1]+"?. Responda si o no");
                    respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("si")){
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_8[2] = "Aprobado";
                    }else {
                        System.out.println("Evaluación guardada con exito");
                        System.out.println("-------------------------------------------------------");
                        System.out.println();
                        cliente_8[2] = "No aprobado";
                    }
                }
                break;
            default:
                System.out.println("Acción no vslida");
                break;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void consultarCliente(String cliente_1[], String cliente_2[], String cliente_3[], String cliente_4[], String cliente_5[], String cliente_6[], String cliente_7[], String cliente_8[]){
        Scanner teclado = new Scanner(System.in);
        String id;
        System.out.println("Ingrese el N° de identificación del cliente que desea consultar");
        id = teclado.next();

        if (id.equals(cliente_1[1])){
            System.out.println(cliente_1[0]+ " ha presentado el curso");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (id.equals(cliente_2[1])) {
            System.out.println(cliente_2[0]+ " ha presentado el curso");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (id.equals(cliente_3[1])) {
            System.out.println(cliente_3[0]+ " ha presentado el curso");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (id.equals(cliente_4[1])) {
            System.out.println(cliente_4[0]+ " ha presentado el curso");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (id.equals(cliente_5[1])) {
            System.out.println(cliente_5[0]+ " ha presentado el curso");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (id.equals(cliente_6[1])) {
            System.out.println(cliente_6[0]+ " ha presentado el curso");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (id.equals(cliente_7[1])) {
            System.out.println(cliente_7[0]+ " ha presentado el curso");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        } else if (id.equals(cliente_8[1])) {
            System.out.println(cliente_8[0]+ " ha presentado el curso");
            System.out.println("-------------------------------------------------------");
            System.out.println();

        }else {
            System.out.println("Cliente no registrado");
            System.out.println("-------------------------------------------------------");
            System.out.println();
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void mostrarResultados(String cliente_1[], String cliente_2[], String cliente_3[], String cliente_4[], String cliente_5[], String cliente_6[], String cliente_7[], String cliente_8[]){
        Scanner teclado = new Scanner(System.in);
        int resultado;
        System.out.println("Seleccione el cliente al que desea ver el resultado");
        System.out.println("1 - "+cliente_1[0]+" "+ cliente_1[1]);
        System.out.println("2 - "+cliente_2[0]+" "+ cliente_2[1]);
        System.out.println("3 - "+cliente_3[0]+" "+ cliente_3[1]);
        System.out.println("4 - "+cliente_4[0]+" "+ cliente_4[1]);
        System.out.println("5 - "+cliente_5[0]+" "+ cliente_5[1]);
        System.out.println("6 - "+cliente_6[0]+" "+ cliente_6[1]);
        System.out.println("7 - "+cliente_7[0]+" "+ cliente_7[1]);
        System.out.println("8 - "+cliente_8[0]+" "+ cliente_8[1]);
        resultado = teclado.nextInt();

        switch (resultado){
            case 1:
                if (cliente_1[2] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println(cliente_1[0]+" con N° de identificación "+cliente_1[1]+" "+ cliente_1[2]);
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
                break;

            case 2:
                if (cliente_2[2] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println(cliente_2[0]+" con N° de identificación "+cliente_2[1]+" "+ cliente_2[2]);
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
                break;

            case 3:
                if (cliente_3[2] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println(cliente_3[0]+" con N° de identificación "+cliente_3[1]+" "+ cliente_3[2]);
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
                break;

            case 4:
                if (cliente_4[2] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println(cliente_4[0]+" con N° de identificación "+cliente_4[1]+" "+ cliente_4[2]);
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
                break;

            case 5:
                if (cliente_5[2] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println(cliente_5[0]+" con N° de identificación "+cliente_5[1]+" "+ cliente_5[2]);
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
                break;

            case 6:
                if (cliente_6[2] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println(cliente_6[0]+" con N° de identificación "+cliente_6[1]+" "+ cliente_6[2]);
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
                break;

            case 7:
                if (cliente_7[2] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println(cliente_7[0]+" con N° de identificación "+cliente_7[1]+" "+ cliente_7[2]);
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
                break;

            case 8:
                if (cliente_8[2] == ""){
                    System.out.println("No hay registro");
                }else {
                    System.out.println(cliente_8[0]+" con N° de identificación "+cliente_8[1]+" "+ cliente_8[2]);
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
                break;
        }
    }
}