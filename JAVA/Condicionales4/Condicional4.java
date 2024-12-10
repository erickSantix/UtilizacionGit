import java.io.*;

public class Condicional4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingrese el primer caracter: ");
        char car1 = (char) reader.read();
        reader.readLine(); // consume the remaining newline

        System.out.print("Ingrese el segundo caracter: ");
        char car2 = (char) reader.read();
        reader.readLine(); // consume the remaining newline

        if (car1 == car2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
    }
}
