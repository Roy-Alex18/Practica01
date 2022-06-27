import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, x, perfecto=0;
        System.out.println("Escribe un numero: ");
        n = leer.nextInt();
        x = 2;
        while(x <= n){
            if(n % x == 0){
                perfecto = perfecto + (n / x);
            }
            x = x + 1;
        }
        if(perfecto == n){
            System.out.println("El numero " + n + " es un numero perfecto");
        }
        System.out.println("El numero "+ n + " no es numero perfecto");
    }
}
