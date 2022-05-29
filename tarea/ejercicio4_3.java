package tarea;

import java.util.Scanner;

public class ejercicio4_3 {
    public static void main(String args[]) {
        
        int n, numero, a = 0, b = 0, c = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("determina numeros menores, mayores e iguales a cero: ");

        System.out.println("ingresa el valor: ");
        n = leer.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("ingresa el numero: ");
            numero = leer.nextInt();

            if(numero > 0){
                a = a+1;

            } else if(numero < 0){
                b = b+1;
            }else {
                c = c+1;
            }
        }
        System.out.println("Numeros mayores a cero: " + a + " Numeros menores a cero: "+ b + " Numeros iguales a cero:" + c);

    }
}
