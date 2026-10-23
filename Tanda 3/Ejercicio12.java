
import java.util.Scanner;

public class Ejercicio12 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("----Calculadora del segundo examen----");
System.out.print("Por favor, introduce la nota del primer examen: ");
double ex1 = s.nextDouble();
System.out.print("Por favor, introduce la media que quieres sacar: ");
double med = s.nextDouble();
System.out.println("La nota del primer examen es: " + ex1);
System.out.println("La media que quieres sacar es: " + med);
System.out.println("La nota que necesitas en el segundo examen es: " + ((med-(0.4*ex1))/0.6));
}
}  
