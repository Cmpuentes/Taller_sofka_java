package EJERCICIO_4;

public class Ejercicio_4 {

    public static void main(String[] args) {
        String matriz [][] = new String[4][5];
        System.out.println("Matriz quemada");
        matriz[0][0] = "01";
        matriz[0][1] = "02";
        matriz[0][2] = "03";
        matriz[0][3] = "04";
        matriz[0][4] = "05";

        matriz[1][0] = "06";
        matriz[1][1] = "07";
        matriz[1][2] = "08";
        matriz[1][3] = "09";
        matriz[1][4] = "10";

        matriz[2][0] = "11";
        matriz[2][1] = "12";
        matriz[2][2] = "13";
        matriz[2][3] = "14";
        matriz[2][4] = "15";

        matriz[3][0] = "16";
        matriz[3][1] = "17";
        matriz[3][2] = "18";
        matriz[3][3] = "19";
        matriz[3][4] = "20";

        System.out.print("["+matriz[0][0]+"]");
        System.out.print("["+matriz[0][1]+"]");
        System.out.print("["+matriz[0][2]+"]");
        System.out.print("["+matriz[0][3]+"]");
        System.out.print("["+matriz[0][4]+"]");

        System.out.println();

        System.out.print("["+matriz[1][0]+"]");
        System.out.print("["+matriz[1][1]+"]");
        System.out.print("["+matriz[1][2]+"]");
        System.out.print("["+matriz[1][3]+"]");
        System.out.print("["+matriz[1][4]+"]");

        System.out.println();

        System.out.print("["+matriz[2][0]+"]");
        System.out.print("["+matriz[2][1]+"]");
        System.out.print("["+matriz[2][2]+"]");
        System.out.print("["+matriz[2][3]+"]");
        System.out.print("["+matriz[2][4]+"]");

        System.out.println();

        System.out.print("["+matriz[3][0]+"]");
        System.out.print("["+matriz[3][1]+"]");
        System.out.print("["+matriz[3][2]+"]");
        System.out.print("["+matriz[3][3]+"]");
        System.out.print("["+matriz[3][4]+"]");

        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();
        System.out.println("Matriz dinamica");

        int j = 0;
        for (int conteo =0; conteo < 5; conteo++){

            int i = 0;
            System.out.print("["+matriz[i][j]+"]");
            j++;
        }

        System.out.println();
        int k = 4;
        for (int conteo =0; conteo < 5; conteo++){

            int i = 1;
            System.out.print("["+matriz[i][k]+"]");
            k--;
        }

        System.out.println();
        int m = 0;
        for (int conteo =0; conteo < 5; conteo++){

            int i = 2;
            System.out.print("["+matriz[i][m]+"]");
            m++;
        }

        System.out.println();
        int n = 4;
        for (int conteo =0; conteo < 5; conteo++){

            int i = 3;
            System.out.print("["+matriz[i][n]+"]");
            n--;
        }
    }
}