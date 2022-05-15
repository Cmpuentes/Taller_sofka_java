package EJERCICIO_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido;
        byte edad;
        double estatura;

        System.out.print("Escriba su nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Escriba su apellido: ");
        apellido = teclado.nextLine();

        System.out.print("Digite su edad: ");
        edad = teclado.nextByte();

        System.out.print("Digite su estatura: ");
        estatura = teclado.nextDouble();
    }
}
