import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        double descuento;
        if (precio <= 100) {
            descuento = 0;
        } else if (precio <= 200) {
            descuento = 0.10;
        } else if (precio <= 500) {
            descuento = 0.20;
        } else {
            descuento = 0.25;
        }
        
        double precioFinal = precio - (precio * descuento);
        System.out.println("El precio final con descuento es: " + precioFinal);
        
        scanner.close();
    }
}