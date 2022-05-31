package recursividad;

/**
 * ejemploRecursividad
 */
public class ejemploRecursividad {

    public static int factorialR(int n){
        if(n > 1){
            return factorialR(n - 1)*n;
        }
        return 1;
    }


    public static void main(String[] args){
        System.out.println(factorialR(5));
    }
}
