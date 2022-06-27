package Examendeprogramacion;

import java.util.Scanner;

public class a {
    static Scanner lt = new Scanner(System.in);

    public static void impuesto() {

        String cateV="";
        int cantidad=0;
        double costV=0, impUnit=0, impTotal=0, totalImpV=0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese vehiculos cantidad Vehiculos de categoria" + (i+1)+":");
            cantidad=lt.nextInt();
            System.out.println("Ingrese el precio de la categoria "+(i+1)+":");
            costV=lt.nextDouble();
            if(i==0){
                impUnit=costV*0.12;
                impTotal=impUnit*cantidad;
            }else if(i==1){
                impUnit=costV*0.08;
            }else{
                impUnit=costV+0.05;
            }
            impTotal=impUnit*cantidad;
            System.out.println("Impuesto de Categoria"+(i+1)+"es: "+ impUnit);
            System.out.println("Impuesto total de categoria "+(i+1)+"es: "+ impTotal);
            totalImpV=totalImpV + impTotal;
        }
        System.out.println("Impuestototal de los Vehiculos es: "+ totalImpV);
    }
    public static void main(String args[]) {
        impuesto();
    }
}
