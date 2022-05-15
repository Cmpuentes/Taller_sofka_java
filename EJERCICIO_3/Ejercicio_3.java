package EJERCICIO_3;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int vector[] = new int [168];
        int b = 0;

        for (int num = 0; num < 1000; num++){
            int a = 1;
            int contador = 0;

            while (a <= num){
                if (num % a == 0){
                    contador++;
                }
                a++;
            }

            if (contador == 2){
                vector[b] = num;
                b++;
            }
        }

        for (int i = 0; i < vector.length; i++){
            System.out.println("["+vector[i]+"]");
        }
    }
}
