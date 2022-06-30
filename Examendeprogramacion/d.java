import java.util.Scanner;

public class d {
    public long binario(int num) {
        if(num<2) return num;
        else return num%2+binario(num/2)*10;

    }
    public static void main(String[] args) {
        d o=new d();
        System.out.println(o.binario(72));
    }
}
