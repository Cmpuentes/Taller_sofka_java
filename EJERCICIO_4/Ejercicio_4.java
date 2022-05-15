package EJERCICIO_4;
import java.util.Scanner;
public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ciudad, pais;

        System.out.print("Escriba el nombre de una ciudad capital: ");
        ciudad = teclado.nextLine();

        System.out.print("Escriba el nombre del respectivo país: ");
        pais = teclado.nextLine();

        System.out.println("La ciudad "+ciudad+" es la capital de "+pais);
    }
}
