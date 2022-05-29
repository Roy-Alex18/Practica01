package tarea;

import java.util.Scanner;

public class ejercicio4_9 {
    public static void main(String[] args) {
        
        int edad, suma, x, n;
        double promedio;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de alumnos: ");
        n = leer.nextInt();
        x = 1;
        suma = 0;
        promedio = 0;
        while(x <= n){
            System.out.println("Ingresa una edad: ");
            edad = leer.nextInt();
            suma = suma + edad;
            x = x + 1;
        }
        promedio = suma / n;
        System.out.println("El promedio de edades es: "+ promedio);
    }
}
