import java.util.*;
public class Condicional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Introduzca Numero entero: ");
        N = sc.nextInt();
        if(N%2==0)
           System.out.println("Par");
           else
           System.out.println("Impar");
    }
}
