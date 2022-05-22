package programacion;

/**
 * practica07
 */
public class practica07 {

    public static void main(String args[]) {
        int operacion = 3;
        int num_uno = 8;
        int num_dos = 4;
        int resulatado = 0;

        if(operacion == 1){
            resulatado=num_uno + num_dos;
            System.out.println("La resultado de la suma es: "+ resulatado);
        }else if(operacion == 2){
            resulatado=num_uno - num_dos;
            System.out.println("la resultado de la resta es: "+ resulatado);
        }else if(operacion == 3){
            resulatado=num_uno * num_dos;
            System.out.println("la resultado de la multiplicacion es: "+resulatado);
        }else if(operacion == 4){
            resulatado=num_uno / num_dos;
            System.out.println("la resultado e la divicion es: "+ resulatado);
        }else {
            System.out.println("La opcion que elegiste no existe. "+ resulatado);
        }
    }
}