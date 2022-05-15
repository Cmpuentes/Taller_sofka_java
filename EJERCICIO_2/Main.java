package EJERCICIO_2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte edad;

        System.out.print("Ingrese la edad: ");
        edad = teclado.nextByte();

        Ejercicio_2_condicionales verificaedad = new Ejercicio_2_condicionales(edad);
        verificaedad.menorDeEdad();
    }
}
