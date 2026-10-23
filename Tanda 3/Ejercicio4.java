
import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce el primer número: ");
double x = s.nextDouble();
System.out.print("Por favor, introduce el segundo número: ");
double y = s.nextDouble();
System.out.println("El primer número es: " + x);
System.out.println("El segundo número es: " + y);
System.out.println("La suma de los dos números es: " + (x + y));
System.out.println("La resta de los dos números es: " + (x - y));
System.out.println("La multiplicación de los dos números es: " + (x * y));
System.out.println("La división de los dos números es: " + (x / y));
}
}  
