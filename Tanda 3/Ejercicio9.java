
import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce el tamaño del radio: ");
int r = s.nextInt();
System.out.print("Por favor, introduce el tamaño de la altura: ");
int h = s.nextInt();
System.out.println("El radio es: " + r);
System.out.println("La altura es: " + h);
System.out.println("El volumen del cono es: " + (1/3.0 * Math.PI * r * r * h));
}
}  
