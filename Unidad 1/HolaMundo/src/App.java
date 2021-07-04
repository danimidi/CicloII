  
//import java.io.BufferedReader;  el segundo ya contiene los Reader
//import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
    
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Ingresa tu apellido: ");
        //String apellido = sc.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese su APELLIDO");
        String apellido = br.readLine();

        System.out.println("Hello, "+args[0]+" "+apellido+"!");
    }
}