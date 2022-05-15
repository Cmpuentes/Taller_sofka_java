package EJERCICIO_10;

public class Ejercicio_10_condicionales {
    double cuenta = 1000000;//Cantidad arbitraria limitandonos solo a los condicionales

    public void ingresarDinero(double ingreso){
        if (ingreso > 0){
            cuenta += ingreso;
            System.out.println("Valor de "+ingreso+" ingresado con exito");
            System.out.println("Cantidad de cuenta "+cuenta);
        }
    }
    //******************************************************************************************************************
    public void retirarDinero(double retiro){
        if (retiro <= cuenta){
            cuenta -= retiro;
            System.out.println("Valor de "+retiro+" retirado con exito");
            System.out.println("Cantidad de cuenta "+cuenta);
        }
    }
    //******************************************************************************************************************
    public void consultar(){
        System.out.println("Saldo de cuenta: "+cuenta);
    }
}
