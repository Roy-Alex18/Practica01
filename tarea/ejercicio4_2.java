package tarea;

import java.util.Scanner;

public class ejercicio4_2 {

    public static void main(String[] args){

        int n, tipo, pago;
        double total = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Hanburguesas sencillas, dobles o triples");

        System.out.println("Ingrese el total de hamburguesas: ");
        n = leer.nextInt();
        while(n > 0){
            System.out.println("Elige una haburguesa: ");
            System.out.println("1 = sencilla $10");
            System.out.println("2 = doble $12");
            System.out.println("3 = triple $14");
            tipo = leer.nextInt();
            if(tipo >= 1 && tipo <= 3){
                if(tipo == 1){
                    total = total + 10;
                }else if(tipo == 1){
                    total = total + 12;
                }else {
                    total = total + 14;
                }
                n = n - 1;
            }
            System.out.println("Ingrese el numero correcto: ");
        }

        System.out.println("Ingresa el tipo de pago:");
        System.out.println("1 = efectivo");
        System.out.println("2 = tarjeta");
        pago = leer.nextInt();
        if(pago == 1 || pago == 2) {
            if(pago == 2){
                total = total + (total * 0.05);
                System.out.println("Se aplico un cargo del 5%");
            }
            System.out.println("El total a apagar es: " + total);
        }
        System.out.println("Lo siento no te podemos cobrar.");  
    }
}