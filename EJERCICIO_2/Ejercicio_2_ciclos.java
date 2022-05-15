package EJERCICIO_2;

public class Ejercicio_2_ciclos {

    public static void dibujarTriangulo(byte ancho){
        byte asteriscos = 1;
        byte espacios = (byte) (ancho -1);
        for (int fila = 0; fila < ancho; fila++){

            for (int columespacios = 0; columespacios < espacios; columespacios++){
                System.out.print(" ");
            }
            for (int columasteriscos = 0; columasteriscos < asteriscos; columasteriscos++){
                System.out.print("*");
            }

            System.out.println();
            asteriscos++;
            espacios--;
        }
    }

    public static void main(String[] args) {
        byte ancho = 10;
        dibujarTriangulo(ancho);
    }
}
