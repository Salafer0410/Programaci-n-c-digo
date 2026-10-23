
import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce el número de euros: ");
double euros = s.nextDouble();
double pesetas = euros * 166.386;
System.out.println("El número de euros es: " + euros);
System.out.println("El número de pesetas es: " + pesetas);

}
}  
