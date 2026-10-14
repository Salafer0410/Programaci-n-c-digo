public class Ejerciciocuatro {
    public static void main(String[] args) {
        //Escribe un programa que muestre tu horario de clase.
        //Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
       String LUNES = "\033[31m";
       String MARTES = "\033[32m";
       String MIERCOLES ="\033[34m";
       String JUEVES = "\033[35m";
       String VIERNES = "\033[36m";


       
       
       
        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s\n", "HORA", "LUNES" + LUNES, "MARTES" + MARTES, "MIÉRCOLES" + MIERCOLES, "JUEVES" + JUEVES, "VIERNES" + VIERNES);
        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s\n", "08:00-09:00", "Historia", "Lengua", "Tecnologia", "Valores", "Filosofia");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s\n", "09:00-10:00", "Filosofia", "Fisica", "Matematicas", "Tecnologia", "Lengua");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s\n", "10:00-11:00", "Fisica", "Matematicas", "Ingles", "Mates", "Tecnologia");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s\n", "11:00-11:30", "R", "E", "CR", "E", "O");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s\n", "11:30-12:30", "Ingles", "Historia", "Fisica", "TIC", "Programacion");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s\n", "12:30-13:30", "Matematicas", "TIC", "Programacion", "Ingles", "Fisica");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s\n", "13:30-14:30", "Tecnologia", "Filosofia", "Historia", "Lengua", "Historia");
    }
}
