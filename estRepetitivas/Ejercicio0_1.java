package estRepetitivas;

public class Ejercicio0_1 {
    
    public static void main(String[] args) {
        int salario = 1500;
        double r = 0;
        for(int i = 0; i <= 6; i++){
            r = salario+(salario*0.10)*i;
            System.out.println("El salario al cabo de 6 años es: "+ r);
        }
    }
}
