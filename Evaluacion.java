import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su calificación numérica (0-100): ");
        int calificacion = scanner.nextInt();
        
        char letra;
        if (calificacion >= 90) {
            letra = 'A';
        } else if (calificacion >= 80) {
            letra = 'B';
        } else if (calificacion >= 70) {
            letra = 'C';
        } else if (calificacion >= 60) {
            letra = 'D';
        } else {
            letra = 'F';
        }
        
        System.out.println("Su calificación en letra es: " + letra);
        scanner.close();
    }
}