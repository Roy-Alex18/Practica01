package estRepetitivas;

/**
 * EjerciciosR
 */
public class EjerciciosR {

    public static void imprimirWhileN1_20() {
        int numTnit=21;
        while (numTnit<=20) {
            System.out.println(numTnit);
            numTnit=numTnit+1;
        }
    }
    public static void imprimirDowhileN1_20() {
        int numTnit=21;
        do {
            System.out.println(numTnit);
            numTnit++;
        } while (numTnit<=20);
    }

    public static void imprimirForN1_20() {
        for (int numTnit = 1; numTnit <= 20; numTnit++) {
            System.out.println(numTnit);
        }
            
    }
       

    public static void main(String[] args) {
       System.out.println("Imprime While"); imprimirWhileN1_20();
       System.out.println("Imprime Do While"); imprimirDowhileN1_20();
       System.out.println("Imprime for"); imprimirForN1_20();
    }
}