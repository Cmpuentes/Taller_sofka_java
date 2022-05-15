package EJERCICIO_10;
import EJERCICIO_6.Ejercicio_6_condidionales;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String titular;
        double ingreso, retiro;
        byte opcion;

        System.out.print("Ingrese el nombre del titular:");
        titular = teclado.nextLine();

        System.out.println("Bienvenido "+titular+", seleccione la opción que desee");
        System.out.println("1 - Ingresar dinero");
        System.out.println("2 - Retirar dinero");
        System.out.println("3 - Consultar cuenta");
        System.out.println("4 - Finalizar");
        opcion = teclado.nextByte();
        Ejercicio_10_condicionales transaccion = new Ejercicio_10_condicionales();

        switch (opcion){
            case 1:
                System.out.println("Digite la cantidad de dinero a ingresar a la cuenta");
                ingreso = teclado.nextDouble();
                transaccion.ingresarDinero(ingreso);
                break;

            case 2:
                System.out.println("Digite la cantidad de dinero a retirar de la cuenta");
                retiro = teclado.nextDouble();
                transaccion.retirarDinero(retiro);
                break;

            case 3:
                transaccion.consultar();
                break;

            case 4:
                System.out.println("Proceso finalizado");
                break;
        }
    }
}
