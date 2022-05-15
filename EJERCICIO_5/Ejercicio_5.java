package EJERCICIO_5;
import java.util.Scanner;
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz [][] = new int [10][10];

        for (int x = 1; x < 11; x++){
            System.out.print("     "+(x-1)+" ");
        }

        System.out.println();

        for (int i = 1; i < 10; i++){
            System.out.print(" "+(i-1)+" ");
            for (int j = 1; j < 11; j++){
                System.out.print("["+j+"*"+i+" ] ");
            }
            System.out.println();
        }

        for (int j = 1; j < 2; j++){
            System.out.print(" "+9+" ");
            for (int i = 1; i < 11; i++){
                System.out.print("["+i+"*"+10+"] ");
            }
        }
         /*
        int fila, columna;
        for (fila = 0; fila < 10; fila++){
            for (columna = 0; columna < 10; columna++){
                matriz[fila][columna] = fila * columna;
            }
        }

          */

        int m, n;
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ingrese la fila y columna de la cual desea ver el resultado");
        System.out.println("Fila");
        m = teclado.nextInt();
        System.out.println("Columna");
        n = teclado.nextInt();

        if (m == 0 && n == 0){
            System.out.print("Resultado: "+(1*1));
        } else if ((m == 0 && n == 1)||(m == 1 && n == 0)){
            System.out.print("Resultado: "+(2*1));
        } else if ((m == 0 && n == 2)||(m == 2 && n == 0)) {
            System.out.print("Resultado: "+(3*1));
        } else if ((m == 0 && n == 3)||(m == 3 && n == 0)) {
            System.out.print("Resultado: "+(4*1));
        } else if ((m == 0 && n == 4 )||(m == 4 && n == 0)){
            System.out.print("Resultado: "+(5*1));
        }else if ((m == 0 && n == 5)||(m == 5 && n == 0)){
            System.out.print("Resultado: "+(6*1));
        } else if ((m == 0 && n == 6)||(m == 6 && n == 0)) {
            System.out.print("Resultado: "+(7*1));
        } else if ((m == 0 && n == 7)||(m == 7 && n == 0)) {
            System.out.print("Resultado: "+(8*1));
        } else if ((m == 0 && n == 8)||(m == 8 && n== 0)) {
            System.out.print("Resultado: "+(9*1));
        } else if ((m == 0 && n == 9)||(m == 9 && n == 0)) {
            System.out.print("Resultado: "+(10*1));
        } else if (m == 1 && n == 1) {
            System.out.print("Resultado: "+(2*2));
        } else if ((m == 1 && n == 2)||(m == 2 && n == 1)) {
            System.out.print("Resultado: "+(3*2));
        } else if ((m == 1 && n == 3)||(m == 3 && n == 1)) {
            System.out.print("Resultado: "+(4*2));
        } else if ((m == 1 && n == 4)||(m == 4 && n == 1)) {
            System.out.print("Resultado: "+(5*2));
        } else if ((m == 1 && n == 5)||(m == 5 && n == 1)) {
            System.out.print("Resultado: "+(6*2));
        } else if ((m == 1 && n == 6)||(m == 6 && n == 1)) {
            System.out.print("Resultado: "+(7*2));
        } else if ((m == 1 && n == 7)||(m == 7 && n == 1)) {
            System.out.print("Resultado: "+(8*2));
        } else if ((m == 1 && n == 8)||(m == 8 && n == 1)) {
            System.out.print("Resultado: "+(9*2));
        } else if ((m == 1 && n == 9)||(m == 9 && n == 1)) {
            System.out.print("Resultado: "+(10*2));
        } else if ((m == 2  && n == 3) || (m == 3 && n==2)) {
            System.out.print("Resultado: "+(4*3));
        } else if ((m == 2 && n == 4) || (m == 4 && n == 2)) {
            System.out.print("Resultado: "+(5*3));
        } else if ((m == 2 && n == 5) || (m == 5 && n == 2)) {
            System.out.print("Resultado: "+(6*3));
        } else if ((m == 2 && n == 6) || (m == 6 && n == 2)) {
            System.out.print("Resultado: "+(7*3));
        } else if ((m == 2 && n == 7) || (m == 7 && n == 2)) {
            System.out.print("Resultado: "+(8*3));
        } else if ((m == 2 && n == 8) || (m == 8 && n == 2)) {
            System.out.print("Resultado: "+(9*3));
        } else if ((m == 2 && n == 9) || (m == 9 && n == 2)) {
            System.out.print("Resultado: "+(10*3));
        } else if (m == 3 && n == 3) {
            System.out.print("Resultado: "+(4*4));
        } else if ((m == 3 && n == 4) || (m == 4 && n == 3)) {
            System.out.print("Resultado: "+(5*4));
        } else if ((m==3 && n==5) || (m==5 && n==3)) {
            System.out.print("Resultado: "+(6*4));
        } else if ((m==3 && n==6) || (m==6 && n==3)) {
            System.out.print("Resultado: "+(7*4));
        } else if ((m==3 && n==7) || (m==7 && n==3)) {
            System.out.print("Resultado: "+(8*4));
        } else if ((m==3 && n==8) || (m==8 && n==3)) {
            System.out.print("Resultado: "+(9*4));
        } else if ((m==3 && n==9) || (m==9 && n==3)) {
            System.out.print("Resultado: "+(10*4));
        } else if (m==4 && n==4) {
            System.out.print("Resultado: "+(5*5));
        } else if ((m==4 && n==5) || (m==5 && n==4)) {
            System.out.print("Resultado: "+(6*5));
        } else if ((m==4 && n==6) || (m==6 && n==4)) {
            System.out.print("Resultado: "+(7*5));
        } else if ((m==4 && n==7) || (m==7 && n==4)) {
            System.out.print("Resultado: "+(8*5));
        } else if ((m==4 && n==8) || (m==8 && n==4)) {
            System.out.print("Resultado: "+(9*5));
        } else if ((m==4 && n==9) || (m==9 && n==4)) {
            System.out.print("Resultado: "+(10*5));
        } else if (m==5 && n==5) {
            System.out.print("Resultado: "+(6*6));
        } else if ((m==5 && n==6) || (m==6 && n==5)) {
            System.out.print("Resultado: "+(7*6));
        } else if ((m==5 && n==7) || (m==7 && n==5)) {
            System.out.print("Resultado: "+(8*6));
        } else if ((m==5 && n==8) || (m==8 && n==5)) {
            System.out.print("Resultado: "+(9*6));
        } else if ((m==5 && n==9) || (m==9 && n==5)) {
            System.out.print("Resultado: "+(10*6));
        } else if (m==6 && n==6) {
            System.out.print("Resultado: "+(7*7));
        } else if ((m==6 && n==7) || (m==7 && n==6)) {
            System.out.print("Resultado: "+(8*7));
        } else if ((m==6 && n==8) || (m==8 && n==6)) {
            System.out.print("Resultado: "+(9*7));
        } else if ((m==6 && n==9) || (m==9 && n==6)) {
            System.out.print("Resultado: "+(10*7));
        } else if ((m==7 && n==7)) {
            System.out.print("Resultado: "+(8*8));
        } else if ((m==7 && n==8) || (m==8 && n==7)) {
            System.out.print("Resultado: "+(9*8));
        } else if ((m==7 && n==9) || (m==9 && n==7)) {
            System.out.print("Resultado: "+(10*8));
        } else if (m==8 && n==8) {
            System.out.print("Resultado: "+(9*9));
        } else if ((m==8 && n==9) || (m==9 && n==8)) {
            System.out.print("Resultado: "+(9*10));
        } else if (m==9 && n==9) {
            System.out.print("Resultado: "+(10*10));
        }
    }
}
