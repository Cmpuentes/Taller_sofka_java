package EJERCICIO_9;

public class Ejercicio_9_condicionales {

    public double areaRectangulo(double base, double altura){
        double area;
        area = base * altura;
        System.out.println("Área del rectángulo");
        return area;
    }

    public double areaTriangulo(double base, double altura){
        double area;
        area = (base * altura)/2;
        System.out.println("Área del triángulo");
        return area;
    }

    public double areaTrapecio(double base, double altura, double bcorta){
        double area;
        area = ((base + bcorta)*altura)/2;
        System.out.println("Área del trapecio");
        return area;
    }
}