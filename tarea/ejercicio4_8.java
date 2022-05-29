package tarea;

import java.util.Scanner;

public class ejercicio4_8 {
    public static void main(String[] args) {
        
        int años, x;
        double ahorro, total, interes;
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingresa los años de ahorro: ");
        años = leer.nextInt();
        total = 0;
        interes = 0;
        while(años > 0){
            for(int i = 1; i > 12; i++){
                System.out.println("Ingresa el ahorro del mes: "+ i);
                ahorro = leer.nextDouble();
                total = total + ahorro;
            }
            interes = interes +(total * 0.10);
            años = años - 1;
            System.out.println("El interes anual es: "+ interes);
            System.out.println("La inversion final es: "+ total + interes);
        }

    }
}
