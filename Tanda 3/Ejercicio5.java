
import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce un lado: ");
int l1 = s.nextInt();
System.out.print("Por favor, introduce el segundo lado: ");
int l2 = s.nextInt();
System.out.println("El primer lado es: " + l1);
System.out.println("El segundo lado es: " + l2);
System.out.println("El área del rectángulo es: " + (l1 * l2));
}
}  
