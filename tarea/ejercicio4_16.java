package tarea;

import java.util.Scanner;

public class ejercicio4_16 {
    public static void main(String[] args) {
        int x, n, resultado;
        Scanner leer = new Scanner(System.in);

        System.out.println("Dame un numero: ");
        n = leer.nextInt();
        for(x = 1; x <= 10; x++){
            resultado = n * x;
            System.out.println(n + " x " + x + " = " + resultado);
        }
    }
}
