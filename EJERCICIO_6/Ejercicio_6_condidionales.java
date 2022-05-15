package EJERCICIO_6;
import java.util.Scanner;

public class Ejercicio_6_condidionales {
    String nombrecompleto, marca, tipo, placa, fechain, observaciones, fechasa, arreglos, repuestousado, repuestos;

    public void entradaMoto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la fecha de ingreso");
        fechain = teclado.next();

        System.out.println("Escriba el nombre completo del usuario");
        teclado.nextLine();
        nombrecompleto = teclado.nextLine();

        System.out.println("Escriba la marca de la moto");
        marca = teclado.next();

        System.out.println("Escriba el tipo de moto");
        tipo = teclado.next();

        System.out.println("Escriba la placa de la moto");
        placa = teclado.next();

        System.out.println("Escriba las opservaciones de la moto");
        teclado.nextLine();
        observaciones = teclado.nextLine();

        System.out.println(fechain+", ingreso al taller del usuario "+nombrecompleto+" de moto marca "+marca+", tipo "+tipo+", placa "+placa+", con las siguientes observaciones: "+observaciones);
    }
    //------------------------------------------------------------------------------------------------------------------
    public void salidaMoto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la fecha de salida");
        fechasa = teclado.next();

        System.out.println("Escriba el nombre completo del usuario");
        teclado.nextLine();
        nombrecompleto = teclado.nextLine();

        System.out.println("Escriba la marca de la moto");
        marca = teclado.next();

        System.out.println("Escriba el tipo de moto");
        teclado.nextLine();
        tipo = teclado.next();

        System.out.println("Escriba la placa de la moto");
        placa = teclado.next();

        System.out.println("Escriba los arreglos realizados");
        teclado.nextLine();
        arreglos = teclado.nextLine();

        System.out.println("¿Utilizó repuestos?. Responda si o no");
        repuestos = teclado.next();

        System.out.println(fechasa+", sale del taller moto "+tipo+", de marca "+marca+", de placa "+ placa+", perteneciente al usuario "+ nombrecompleto+", con los siguientes arreglos realizados: "+arreglos);

        if (repuestos.equalsIgnoreCase("si")){
            System.out.println("Escriba los repuestos usados para inventariar");
            teclado.nextLine();
            repuestousado = teclado.nextLine();
            System.out.println("Inventariado con exito");
        }

    }
}