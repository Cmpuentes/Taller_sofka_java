package EJERCICIO_4;
import java.util.Scanner;

public class Ejercicio_4_ciclos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte n;

        System.out.println("Ingrese el número para la tabla de multiplicar que desee crear");
        n = teclado.nextByte();

        for (int i = 1; i <= 10; i++){
            System.out.println(n+" * "+i+" = "+n * i);
        }
    }
}
