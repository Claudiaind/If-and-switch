import java.util.Scanner;

public class CalculadoraCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Ingrese la calificación de los parciales (0-100): ");
        double parciales = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del proyecto (0-100): ");
        double proyecto = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del examen final (0-100): ");
        double examenFinal = scanner.nextDouble();
        
        
        if ((parciales < 0 || parciales > 100) || (proyecto < 0 || proyecto > 100) || (examenFinal < 0 || examenFinal > 100)) {
            System.out.println("Error: Todas las calificaciones deben estar en el rango de 0 a 100.");
        } else {
           
            double calificacionFinal = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);
            
           
            System.out.println("La calificación final es: " + calificacionFinal);
        }
        
        scanner.close();
    }
}
