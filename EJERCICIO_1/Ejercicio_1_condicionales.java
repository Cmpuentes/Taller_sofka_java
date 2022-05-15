package EJERCICIO_1;

public class Ejercicio_1_condicionales {

    byte edad;

    public Ejercicio_1_condicionales(byte edad){
        this.edad = edad;
    }

    public void mayorDeEdad(){
        if (edad >= 18){
            System.out.println("Usted es mayor de edad");
        }
    }
}
