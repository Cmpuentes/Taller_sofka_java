package EJERCICIO_7;

public class Ejercicio_7_condicionales {

    public double indiceMasaCorporal(String nombre, double peso, double altura){
        double imc;
        imc = peso/(Math.pow(altura, 2));
        if (imc < 18.5){
            System.out.println(nombre+" ¡Está bajo de peso!");

        } else if (imc > 18.5 && imc <= 24.9 ) {
            System.out.println(nombre+" Tiene peso normal");

        } else if (imc > 25.0 && imc < 29.9) {
            System.out.println(nombre+" Tiene sobrepeso");

        } else if (imc > 30) {
            System.out.println(nombre+" ¡Es obeso/a!");
        }
        System.out.println("IMC");
        return imc;
    }
}
