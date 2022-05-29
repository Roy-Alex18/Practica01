package tarea;

import java.util.Scanner;

public class ejercicio4_4 {
    public static void main(String[] args) {
        
        int n, color,verde,blanco,rojo;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de focos: ");
        n =leer.nextInt();

        verde = 0;
        blanco = 0;
        rojo = 0;
        while(n > 0){
            System.out.println("Selecciona un color");
            System.out.println("1 = verde");
            System.out.println("2 =blanco");
            System.out.println("3 = rojo");
            color = leer.nextInt();
            if(color >= 1 && color <= 3){
                if(color == 1){
                    verde = verde +1;
                }else if(color == 2){
                    blanco = blanco + 1;
                }else {
                    rojo = rojo + 1;
                }
                n = n - 1;
            }
            System.out.println("Ingresa un color correcto");  
        }
        System.out.println("El total de focos verdes es: "+ verde);
        System.out.println("El total de focos blancos es: "+ blanco);
        System.out.println("El total de focos rojos es: "+ rojo);
    }
}
