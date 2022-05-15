package EJERCICIO_1;

public class Ejercicio_1_ciclos {

    public static void main(String[] args) {

        byte fila, i, j;
        fila = 10;

        for (i = 1; i <= fila; i++){

            for (j = 1; j <= i; j++){

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
