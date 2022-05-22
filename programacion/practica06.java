package programacion;

public class practica06 {
    public static void main(String args[]) {
        
        int matematicas = 5;
        int biologuia = 8;
        int quimica = 7;
        int promedio = 0;

        promedio =(matematicas+biologuia+quimica)/3;

        if(promedio>=6){
            System.out.println("El alumno aprobo: "+ promedio);
        }else if(promedio >= 6){
            System.out.println("El alumno desaprobo: "+ promedio);
        }
    }
}
