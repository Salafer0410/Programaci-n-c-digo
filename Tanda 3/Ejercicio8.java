
import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Por favor, introduce las horas al dia que trabaja: ");
double horas = s.nextDouble();
double dinero = 12;
double salario = horas * dinero;
double salarioSemanal = salario * 7;
System.out.println("El salario es: " + salario);
System.out.println("El salario semanal es: " + salarioSemanal);
}
}  
