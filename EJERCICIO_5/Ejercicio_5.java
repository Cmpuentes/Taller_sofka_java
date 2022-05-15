package EJERCICIO_5;
import java.util.Scanner;
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mascota, edadmascota, tipomascota, nombrecompleto;

        System.out.print("Escriba el nombre de su mascota: ");
        mascota = teclado.nextLine();

        System.out.print("Escriba la edad de su mascota: ");
        edadmascota = teclado.nextLine();

        System.out.print("Escriba el tipo de mascota que tiene: ");
        tipomascota = teclado.nextLine();

        System.out.printf("Escriba su nombre completo: ");
        nombrecompleto = teclado.nextLine();

        System.out.println(mascota+" es un "+tipomascota+", el cual tiene "+edadmascota+" años de edad y "+nombrecompleto+" es actualmente su dueño");
    }
}
