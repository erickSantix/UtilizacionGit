import java.io.*;
import java.util.*;
public class Condicional3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char car, car1;
        System.out.print("Introduzca un caracter: ");
        car = (char)System.in.read();//lee solo un caracter

        if(Character.isUpperCase(car))
        System.out.println("Es una letra mayuscula ");
        else
        System.out.println("NO es una letra mayuscula ");
    }
}