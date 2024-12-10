import java.io.IOException;

public class Condicinal6 {
        public static void main(String[] args) throws IOException{
        char car1;
        System.out.print("Introduzca caracter: ");
        car1 =(char)System.in.read();
        if(Character.isDigit(car1))
        System.out.println("Es un numero");
        else
        System.out.println("NO es un numero");
    }
}
