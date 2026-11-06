public class Ejercicio01 {
public static void main(String[] args) {
String dia;
System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura t\
oca a primera hora ese día: ");
dia = (System.console().readLine());
dia.toLowerCase(); // convierto a minúsculas todas las letras
switch(dia) {
case "lunes":
// continúa debajo
case "martes":
// continúa debajo
case "miércoles":
System.out.println("Programación");
break;
case "jueves":
System.out.println("Sistemas Informáticos");
break;
case "viernes":
System.out.println("Bases de Datos");
break;
case "sabado":
case "domingo":
System.out.println("¡Ese día no hay clase!");
break;
default:
System.out.println("El día introducido no es correcto.");
}
}
}