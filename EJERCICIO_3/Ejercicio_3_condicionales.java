package EJERCICIO_3;

public class Ejercicio_3_condicionales {
    String nombre, apellido;
    byte edad;

    public Ejercicio_3_condicionales(String nombre, String apellido, byte edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void compruebaEdad(){
        if (edad >= 18){
            System.out.println(nombre+" "+apellido+", usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }else {
            System.out.println(nombre+ " "+apellido+", usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa");
        }
    }
}
