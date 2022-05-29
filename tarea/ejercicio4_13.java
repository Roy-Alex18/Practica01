package tarea;

import java.util.Scanner;
import java.util.Scanner;
public class ejercicio4_13 {
    public static void main(String[] args) {
        int n, calificacion, reprobados, aprobados;
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingresa el numero de alumnos: ");
        n = leer.nextInt();
        reprobados = 0;
        aprobados = 0;
        while(n > 0){
            System.out.println("ingresa una calificacion: ");
            calificacion = leer.nextInt();
            if(calificacion < 10){
                reprobados = reprobados + 1;
            }else {
                aprobados = aprobados + 1;
            }
            n = n - 1;
        }
        System.out.println("El total de alumnos aprobados es: " + aprobados);
        System.out.println("El total de alumnos reprobados es " + reprobados);
    }
}
