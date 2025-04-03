import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en pesos mexicanos: ");
        double pesos = scanner.nextDouble();
        
        System.out.println("Seleccione la moneda a convertir:");
        System.out.println("1. USD  2. EUR  3. THB  4. JPY  5. KRW  6. AUD  7. PEN  8. CAD  9. VES  10. ARS");
        int opcion = scanner.nextInt();
        
        double tasa = switch (opcion) {
            case 1 -> 0.057; // USD
            case 2 -> 0.052; // EUR
            case 3 -> 2.06;  // THB
            case 4 -> 8.48;  // JPY
            case 5 -> 74.32; // KRW
            case 6 -> 0.088; // AUD
            case 7 -> 0.21;  // PEN
            case 8 -> 0.078; // CAD
            case 9 -> 2.01;  // VES
            case 10 -> 50.23; // ARS
            default -> 0;
        };
        
        if (tasa == 0) {
            System.out.println("Opción inválida");
        } else {
            System.out.println("Cantidad convertida: " + (pesos * tasa));
        }
        
        scanner.close();
    }
}
