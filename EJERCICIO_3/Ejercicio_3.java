package EJERCICIO_3;
import  java.util.Scanner;
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido, nompa, nonma, apepa, apema;

        System.out.print("Escriba su nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Escriba su apellido: ");
        apellido = teclado.nextLine();

        System.out.print("Escriba el nombre de su padre: ");
        nompa = teclado.nextLine();

        System.out.print("Escriba el apellido de su padre: ");
        apepa = teclado.nextLine();

        System.out.print("Escriba el nombre de su madre: ");
        nonma = teclado.nextLine();

        System.out.printf("Escriba el apellido de su madre: ");
        apema = teclado.nextLine();

        System.out.println("Yo "+nombre+" "+apellido+" soy hijo de "+nompa+" "+apepa+" y/e "+nonma+" "+apema);
    }
}
