
import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce la cantidad de Mb: ");
double mb = s.nextDouble();
System.out.println("Los Mb son: " + mb);
System.out.println("Los Kb son: " + (mb * 1024.0));

}
}  
