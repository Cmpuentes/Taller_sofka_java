package EJERCICIO_9;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base, altura, bcorta;
        byte opcion;

        System.out.println("Elija el área que desea calcular:");
        System.out.println("1 - Área del rectángulo.");
        System.out.println("2 - Área del triángulo.");
        System.out.println("3 - Área del trapecio.");
        opcion = teclado.nextByte();
        Ejercicio_9_condicionales calculo = new Ejercicio_9_condicionales();

        switch (opcion){
            case 1:
                System.out.println("Área del rectángulo.");
                System.out.println("Ingrese la base del rectángulo");
                base = teclado.nextDouble();

                System.out.println("Ingrese la altura del rectángulo");
                altura = teclado.nextDouble();
                System.out.println(calculo.areaRectangulo(base, altura));

                break;

            case 2:
                System.out.println("Área del triángulo.");
                System.out.println("Ingrese la base del triángulo");
                base = teclado.nextDouble();

                System.out.println("Ingrese la altura del triángulo");
                altura = teclado.nextDouble();
                System.out.println(calculo.areaTriangulo(base, altura));
                break;

            case 3:
                System.out.println("Área del trapecio.");
                System.out.println("Ingrese la base del trapecio");
                base = teclado.nextDouble();

                System.out.println("Ingrese la base corta del trapecio");
                bcorta = teclado.nextDouble();

                System.out.println("Ingrese la altura del trapecio");
                altura = teclado.nextDouble();
                System.out.println(calculo.areaTrapecio(base, altura, bcorta));
                break;
        }
    }
}