import java.util.Scanner;

import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        
        int n, clave;
        double precio, impuesto, categoria1, categoria2, categoria3, total;
        Scanner leer=new Scanner(System.in);
        total=0;
        categoria1=0;
        categoria2=0;
        categoria3=0;
        System.out.println("ingrese el numero de auto");
        n=leer.nextInt();
        while (n > 0){
            System.out.println("ingresa el precio del auto", x);
            precio=leer.nextLine();
            System.out.println("ingrese la clave del auto");
            clave = leer.nextInt();
            if(clave>0 && clave<4){
                if(clave == 1){
                    impuesto=precio*0.12;
                    categoria1=categoria1+impuesto;
                }else if(clave == 2){
                    impuesto=precio*0.08;
                    categoria2=categoria2+impuesto;
                }else{
                    impuesto=precio*0.05;
                    categoria3=categoria3+impuesto;
                }
                total=total+impuesto;
                System.out.println("el impuesto a pagar por el auto", n, "es: $",impuesto);
                n=n-1;
            }
            else{
                System.out.println("ingrese una clave correcta");

            }
        }
        System.out.println("El impuesto a pagar por la categoria 1 es: ", categoria1);
        System.out.println("El impuesto a pagar por la categoria 2 es: ", categoria2);
        System.out.println("El impuesto a pagar por la categoria 3 es: ", categoria3);
        System.out.println("El impuesto total por todos los autos es: ",total);
    }
}
