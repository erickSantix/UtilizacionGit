import java.util.*;
public class Condicional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese un numero entero: ");

        N =sc.nextInt();
        if(N%10==0)
        System.out.println("Es Multiplo de 10");
        else
        System.out.println("NO es Multiplo de 10");
    }

}
