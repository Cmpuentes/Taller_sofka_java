package EJERCICIO_1;
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] matriz = new int [5];

        System.out.println("Valores para llenar el vector de longitud 5");
        for (int i = 0; i < matriz.length; i++){

            System.out.print("Ingrese un número: ");
            matriz[i] = teclado.nextInt();

        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++){
            System.out.println("["+i+"] = "+matriz[i]);
        }
    }
}
