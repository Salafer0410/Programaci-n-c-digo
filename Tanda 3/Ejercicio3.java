
import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce el número de pesetas: ");
double pesetas = s.nextDouble();
double euros = pesetas / 166.386;
System.out.println("El número de pesetas es: " + pesetas);
System.out.println("El número de euros es: " + euros);
}
}  
