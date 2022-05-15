package EJERCICIO_3;

public class Ejercicio_3_ciclos {

    public static void main(String[] args) {
        int n = 9;
        n = n * 2 - 1;

        for (int i = 1; i <= n; i+=2){

            for (int j = 1; j <= n - i; j+=2){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 2; i++){
            System.out.println("       ***");
        }
        System.out.println("      *****");
        System.out.println("     *******");
    }
}
