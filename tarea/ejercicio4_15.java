package tarea;

import java.util.Scanner;

public class ejercicio4_15 {
    public static void main(String[] args) {
        int total, n;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el total de numeros: ");
        total= leer.nextInt();
        while(total > 0){
            System.out.println("Ingresa un numero: ");
            n=leer.nextInt();
            if(n > 0){
                System.out.println("El numero " + n + " elevado al cubo: " + n*n*n);
                total =total - 1;
            }
        }
    }
}
