
import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce el primer número: ");
int x = s.nextInt();
System.out.print("Por favor, introduce el segundo número: ");
int y = s.nextInt();
System.out.println("El primer número es: " + x);
System.out.println("El segundo número es: " + y);
System.out.println("La suma de los dos números es: " + (x + y));
}
}  
