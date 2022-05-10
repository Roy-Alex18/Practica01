import java.util.Scanner;

/**
 * Practica02
 */
public class Practica02 {

    public void profesor() {
        System.out.println("Enseñar");
    }

    public void estudiante() {
        System.out.println("Aprender o estudiar");
    }

    public static void maquinaPC() {
        System.out.println("procesa informacion");
    }

    public static void proyector() {
        System.out.println("proyecta imagenes");
    }

    public static void main(String[] args) {
        Practica02 obj=new Practica02();
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el numero de algoritmos:\n1=profesor=\n2=estudiante"+
        "\n3=maquinaPC\n4=proyector");
        int opcionMet=lt.nextInt();

        switch (opcionMet) {
            case 1:obj.profesor(); break;
            case 2:obj.estudiante(); break;
            case 3:maquinaPC(); break;
            case 4:proyector(); break;
            default:System.err.println("Esa opcion no existe"); break;
        }

    }
    
}