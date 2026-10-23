
import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce la la factura: ");
double factura = s.nextDouble();
double baseImponible = factura * 0.21;
System.out.println("La base imponible es: " + baseImponible);
}
}  
