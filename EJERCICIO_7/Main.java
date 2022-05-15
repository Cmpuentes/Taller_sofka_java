package EJERCICIO_7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombrecompleto;
        double peso, altura;

        System.out.print("Escriba su nombre completo: ");
        nombrecompleto = teclado.nextLine();

        System.out.print("Ingrese su peso: ");
        peso = teclado.nextDouble();

        System.out.println("Ingrese su altura: ");
        altura = teclado.nextDouble();

        Ejercicio_7_condicionales inmaco = new Ejercicio_7_condicionales();
        System.out.println(inmaco.indiceMasaCorporal(nombrecompleto, peso, altura));
    }
}
