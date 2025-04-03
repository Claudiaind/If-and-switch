import java.util.Scanner;

public class Grados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        System.out.println("Seleccione la conversión: 1. Fahrenheit  2. Kelvin");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1 -> System.out.println("Temperatura en Fahrenheit: " + ((celsius * 9/5) + 32));
            case 2 -> System.out.println("Temperatura en Kelvin: " + (celsius + 273.15));
            default -> System.out.println("Opción inválida");
        }
        
        scanner.close();
    }
}