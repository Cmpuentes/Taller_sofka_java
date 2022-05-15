package EJERCICIO_5;
import java.util.Scanner;

public class Ejercicio_5_condidionales {

    public void caracteristicasMedicamentos(){

        System.out.println("Salbutamol:");
        System.out.println("Broncodilatador agonista B2-adrenérgico selectivo de acción corta, que actúa relajando la musculatura lisa bronquial, estimula el movimiento ciliar e inhibe la liberación de mediadores por los mastocitos." +
                "\nTambién causa una vasodilatación que provoca un efecto cronotrópico reflejo.");
        System.out.println();
        System.out.println("Betametasona:");
        System.out.println("Glucocorticoide sintético de acción prolongada con propiedades antiinflamatorias e inmunosupresoras que carece de propiedades mineralocorticoides prolongadas." +
                "\nEs el esteroide antiinflamatorio más potente. Sus efectos antiinflamatorios e inmunosupresores aparecen en 1-3 h y persisten de 3 a 4 días.");
        System.out.println();
        System.out.println("Clotrimazol:");
        System.out.println("Fungistático imidazólico tópico activo frente dermatofitos, levaduras, M. furfur y Candida." +
                "\nAdemás de su acción antifúngica también actúa sobre Trichomonas vaginalis, microorganismos grampositivos (Streptococci/Staphylococci), y microorganismos gramnegativos (Bacteroides/Gardnerella vaginalis).");
        System.out.println();
        System.out.println("Prednisolona:");
        System.out.println("Glucocorticoide de administración oral y acción antiinflamatoria inmunosupresora. Es la forma activa de la prednisona y su acción y potencia pueden considerarse equivalentes.");
        System.out.println();
        System.out.println("Diclofenaco:");
        System.out.println("Antiinflamatorio no esteroideo (AINE) del grupo fenilacético.");

    }
    //-----------------------------------------------------------------------------------------------------------------
    public void consultarMedicamentos(){

        System.out.println("Precios:");
        System.out.println("1 - Salbutamol <- 10.000");
        System.out.println("2 - Betametasona <- 11.700");
        System.out.println("3 - Clotrimasol <- 17.450");
        System.out.println("4 - Prednisolona <- 13.300");
        System.out.println("5 - Diclofenaco <- 3.900");

    }
    //-----------------------------------------------------------------------------------------------------------------
    public void compraMedicamento(){
        Scanner teclado = new Scanner(System.in);
        byte seleccion;
        System.out.println("Seleccione el medicamento que desea comprar");
        System.out.println("1 - Salbutamol <- 10.000");
        System.out.println("2 - Betametasona <- 11.700");
        System.out.println("3 - Clotrimasol <- 17.450");
        System.out.println("4 - Prednisolona <- 13.300");
        System.out.println("5 - Diclofenaco <- 3.900");
        seleccion = teclado.nextByte();

        switch (seleccion){
            case 1:
                System.out.println("Compra realizada con exito. Salbutamol <- $10.000");
                break;
            case 2:
                System.out.println("Compra realizada con exito. Betametasona <- 11.700");
                break;
            case 3:
                System.out.println("Compra realizada con exito. Clotrimazol <- 17.450");
                break;
            case 4:
                System.out.println("Compra realizada con exito. Prednisolona <- 13.300");
                break;
            case 5:
                System.out.println("Compra realizada con exito. Diclofenaco <- 3.900");
                break;
            default:
                System.out.println("Acción no valida");
        }

    }
    //-----------------------------------------------------------------------------------------------------------------
    public void devolucion(){
        Scanner teclado = new Scanner(System.in);
        String medicamento, motivo;

        System.out.println("Escriba el nombre del medicamento a devolver:");
        medicamento = teclado.next();

        System.out.println("Ecriba el motivo de la devolución");
        teclado.nextLine();
        motivo = teclado.nextLine();

        System.out.println("Motivo de devolución registrado");
    }
}