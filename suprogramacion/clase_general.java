package suprogramacion;

import suprogramacion.*;

public class clase_general {
    
  public static void main(String args[]) {
    aritmetica a = new aritmetica();
    int resultado = a.sumar(5,3);
    System.out.println("Suma: " + resultado);

    aritmetica odj = new aritmetica(5, 3);
    resultado = odj.multiplicar();
    System.out.println("Multiplicacion: " + resultado);
  }
}
