package EJERCICIO_2;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int vector[] = new int [20];

        for (int i = 0; i < vector.length; i++){

            vector[i] = (int)(Math.random()*100 );

        }
        for (int i = 0; i < vector.length; i++){

            System.out.println("["+vector[i]+"]");

        }
        System.out.println("*****************************************************************************************");
        System.out.println("Pares");
        for (int i = 0; i < vector.length; i++){

            if (vector[i] % 2 == 0){
                System.out.print("["+vector[i]+"]");
            }
        }
        System.out.println();
        System.out.println("*****************************************************************************************");
        System.out.println("Impares");
        for (int i = 0; i < vector.length; i++){

            if (vector[i] % 2 != 0){
                System.out.print("["+vector[i]+"]");
            }
        }
    }
}
