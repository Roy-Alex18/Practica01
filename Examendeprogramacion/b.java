import java.util.Scanner;

public class b{

    public static void main(String []args) {
        Scanner leer=new Scanner(System.in);

        int alturaIntroducida;

        System.out.print("Ingrese la altura de la X: ");
        alturaIntroducida = leer.nextInt();

        int altura = 5;
        int i = 0;
        int espacioInterno = alturaIntroducida - 1;
        int espaciosDelantes;

        if(alturaIntroducida<5 && alturaIntroducida % 2 == 0){
            System.out.println("Error, datos incorrectos, debe introducir una altura impar o mayor o igual a 5");
        }else {
            while(altura<alturaIntroducida / 2 + 1){
                for(i=1; i<=espaciosDelantes; i++){
                    System.out.print(" ");
                }
                System.out.print(" *");
                for(i = 1; i<espacioInterno;i++){
                    System.out.print(" ");
                }
                System.out.print(" *");
                System.out.println(" ");
                altura++;
                espaciosDelantes++;
                espacioInterno -= 2;
            }
            espacioInterno = 0;
            espaciosDelantes = altura / 2;
            altura = 1;
            while(altura = alturaIntroducida / 2 + 1){
                for(i=1; i<=espaciosDelantes; i++){
                    System.out.print(" ");
                }
                System.out.print(" *");
                for(i=1;i<espacioInterno;i++){
                    System.out.print(" ");
                }
                if(altura>1){
                    System.out.print("");                    
                }
                System.out.print(" ");
                altura++;
                espaciosDelantes--;
                espacioInterno+=2;
            }
        }
    }
}
