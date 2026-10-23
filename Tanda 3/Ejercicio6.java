
import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce el tamaño de la base: ");
int b = s.nextInt();
System.out.print("Por favor, introduce el tamaño de la altura: ");
int h = s.nextInt();
System.out.println("La base es: " + b);
System.out.println("La altura es: " + h);
System.out.println("El área del triángulo es: " + (b * h / 2));
}
}  
