package EJERCICIO_8;
import java.util.Scanner;

public class Ejercicio_8_condidionales {

    public void sobrePostres(){
        System.out.println("1 - Tarta de queso con arandanos y base de galleta:");
        System.out.println("La tarta de queso es uno de los postres que más alegrías nos dan. Hay montones de recetas y de maneras de elaborarla pero siempre se siguen unas pautas parecidas:" +
                "\nase de galleta, relleno con algún tipo de queso (unas veces más fuerte, otras más suave) y algún tipo de mermelada de frutas o las propias frutas en la parte de arriba.");
        System.out.println();
        System.out.println("2 - Tarta Sacher al estilo clásico:");
        System.out.println("La tarta Sacher es uno de los clásicos de la repostería que hacen las delicias de medio mundo. Su origen se localiza en Viena y le debe el nombre a Frank Sacher, el repostero que la hizo por primera vez a principios del siglo XIX y que aún se puede degustar en el hotel del mismo nombre." +
                "\nLo esencial es la cobertura de chocolate negro y el bizcocho interior trufado con una capa de mermelada de albaricoque, aunque hay variedades que la usan de mora y frambuesa.");
        System.out.println();
        System.out.println("3 - Brazo de gitano con dulce de leche:");
        System.out.println("¿A quién no le apetece en una sobremesa o con un café a media tarde, acompañarlo de un pedacito de brazo de gitano casero?" +
                "\nEs una preparación clásica de nuestra repostería que admite mil y una variedades. En nuestra receta lo hemos rellenado y decorado con dulce de leche, que tan popular es en Colombia.");
        System.out.println();
        System.out.println("4 - Coulants de chocolate:");
        System.out.println("Los coulants son uno de los postres favoritos de los fans incondicionales del chocolate y es que hay pocas cosas que se puedan comparar a la mezcla de bizcocho calentito con el chocolate líquido del centro." +
                "\nVamos, una de esas maravillas culinarias que pedimos en los restaurantes sin atrevernos a hacerlas en casa.");
        System.out.println();
        System.out.println("5 - Bizcocho húmedo de vainilla:");
        System.out.println("Si buscas un bizcocho superjugoso y con un sabor espectacular, no te pierdas el bizcocho húmedo de vainilla que te ofrecemos hoy." +
                "\nIdeal para tomar a la hora del desayuno o de la merienda, junto a un café con leche o una infusión, este dulce está tan rico que sorprenderá a todo el mundo. En el momento que lo lleves a la mesa, no dejarán ni las migas.");

    }
    //*****************************************************************************************************************
    public void postresDisponibles(){
        System.out.println("Postres disponibles:");
        System.out.println("1 - Tarta de queso con arandanos y base de galleta <- 30000.");
        System.out.println("2 - Tarta Sacher al estilo clásico <- 35000.");
        System.out.println("3 - Brazo de gitano con dulce de leche <- 25000.");
        System.out.println("4 - Coulants de chocolate <- 30000.");
        System.out.println("5 - Bizcocho húmedo de vainilla <- 15000");
    }
    //*****************************************************************************************************************
    public void realizarPedido(){
        Scanner teclado = new Scanner(System.in);
        byte seleccion;
        System.out.println("Seleccione su pedido:");
        System.out.println("1 - Tarta de queso con arandanos y base de galleta <- 30000.");
        System.out.println("2 - Tarta Sacher al estilo clásico <- 35000.");
        System.out.println("3 - Brazo de gitano con dulce de leche <- 25000.");
        System.out.println("4 - Coulants de chocolate <- 30000.");
        System.out.println("5 - Bizcocho húmedo de vainilla <- 15000");
        seleccion = teclado.nextByte();

        switch (seleccion){
            case 1:
                System.out.println("Pedido realizado con exito, Tarta de queso con arandanos y base de galleta.");
                break;
            case 2:
                System.out.println("Pedido realizado con exito, Tarta Sacher al estilo clásico.");
                break;
            case 3:
                System.out.println("Pedido realizado con exito, Brazo de gitano con dulce de leche.");
                break;
            case 4:
                System.out.println("Pedido realizado con exito, Coulants de chocolate.");
                break;
            case 5:
                System.out.println("Pedido realizado con exito, Bizcocho húmedo de vainilla.");
                break;
        }

        switch (seleccion){
            case 1:
                System.out.println("Venta registrada con exito, Tarta de queso con arandanos y base de galleta.");
                break;
            case 2:
                System.out.println("Venta registrada con exito, Tarta Sacher al estilo clásico.");
                break;
            case 3:
                System.out.println("Venta registrada con exito, Brazo de gitano con dulce de leche.");
                break;
            case 4:
                System.out.println("Venta registrada con exito, Coulants de chocolate.");
                break;
            case 5:
                System.out.println("Venta registrada con exito, Bizcocho húmedo de vainilla.");
                break;
        }

    }
}