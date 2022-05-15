package EJERCICIO_2;

public class Ejercicio_2_condicionales {
    byte edad;

    public Ejercicio_2_condicionales(byte edad){
        this.edad = edad;
    }

    public void menorDeEdad(){
        if (edad < 18){
            System.out.println("Usted aún es un(a) niño(a)");
        }
    }
}
