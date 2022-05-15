package EJERCICIO_3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido;
        byte edad;

        System.out.println("Escriba su nombre");
        nombre = teclado.nextLine();

        System.out.println("Escriba su apellido");
        apellido = teclado.nextLine();

        System.out.println("Escriba su edad");
        edad = teclado.nextByte();

        Ejercicio_3_condicionales comprueba = new Ejercicio_3_condicionales(nombre, apellido, edad);
        comprueba.compruebaEdad();
    }
}