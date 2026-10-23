
import java.util.Scanner;

public class Ejercicio11 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce la cantidad de Kb: ");
double kb = s.nextDouble();
System.out.println("Los Kb son: " + kb);
System.out.println("Los Mb son: " + (kb / 1024.0));

}
}  
