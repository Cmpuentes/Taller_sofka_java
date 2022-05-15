package EJERCICIO_4;
import java.util.Scanner;
public class Ejercicio_4_condicionales {

    public void consultar(byte opcion){
        if (opcion == 1){
            System.out.println("Películas disponibles:");
            System.out.println("1 - La leyenda de Tarzán.");
            System.out.println("2 - El fotógrafo de Mauthausen.");
            System.out.println("3 - El intercambio.");
            System.out.println("4 - Operación final.");
            System.out.println("5 - La tumba de las luciernagas.");
        }
    }
//------------------------------------------------------------------------------------------------------
    public void alquilar(byte opcion){
        Scanner teclado = new Scanner(System.in);
        byte seleccion;
        if (opcion == 2){
            System.out.println("Seleccione la película a alquilar:");
            System.out.println("1 - La leyenda de Tarzán.");
            System.out.println("2 - El fotógrafo de Mauthausen.");
            System.out.println("3 - El intercambio.");
            System.out.println("4 - Operación final.");
            System.out.println("5 - La tumba de las luciernagas.");
            seleccion = teclado.nextByte();

            switch (seleccion){
                case 1:
                    System.out.println("La leyenda de Tarzán. Alquilada con exito.");
                    break;

                case 2:
                    System.out.println("El fotógrafo de Mauthausen. Alquilada con exito.");
                    break;

                case 3:
                    System.out.println("El intercambio. Alquilada con exito.");
                    break;

                case 4:
                    System.out.println("Operación final. Alquilada con exito.");
                    break;

                case 5:
                    System.out.println("La tumba de las luciernagas. Alquilada con exito.");
                    break;
            }
        }
    }
    //------------------------------------------------------------------------------------------------------
    public void notificar(byte opcion){
        Scanner teclado = new Scanner(System.in);
        String pelicula, defecto, notificacion;
        if (opcion == 3){
            System.out.println("Escriba el nombre de la película recibida en la videotienda");
            pelicula = teclado.nextLine();

            System.out.println("¿Tiene algún defecto la película?. Escriba si o no");
            defecto = teclado.next();

            if (defecto.equals("si")){
                System.out.println("Por favor escriba su observación");
                teclado.nextLine();
                notificacion = teclado.nextLine();

                System.out.println("Notificación ingresada");
            }
        }
    }
    //------------------------------------------------------------------------------------------------------
    public void finalizar(byte opcion){
        if (opcion == 4){
            System.out.println("Preceso finalizado");
        }
    }
}