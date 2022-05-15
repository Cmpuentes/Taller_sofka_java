package EJERCICIO_1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        byte edad;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        edad = teclado.nextByte();

        Ejercicio_1_condicionales verificaedad = new Ejercicio_1_condicionales(edad);
        verificaedad.mayorDeEdad();
    }
}
