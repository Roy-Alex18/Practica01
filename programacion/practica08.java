package programacion;
import java.util.Scanner;

public class practica08 {

    public static void main(String args[]) {

        Scanner in =new Scanner(System.in);
        String nombre = "";
        int numuno = 0, numdos = 0, resultado = 0;

        System.out.println("Cual es tu nombre ");
        nombre = in.nextLine();

        System.out.println("Dame el primer valor para tu suma: ");
        numuno = in.nextInt();

        System.out.println("Dame el segudo valor para tu suma: ");
        numdos = in.nextInt();

        resultado = numuno + numdos;

        System.out.println("Hola "+ nombre +" el resulatdo de tu suma es: "+ resultado);
    }
}