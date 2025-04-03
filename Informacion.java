import java.util.Scanner;

public class Informacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de un artista, película o serie:");
        String entrada = scanner.nextLine();
        
        switch (entrada.toLowerCase()) {
            case "shakira" -> System.out.println("Shakira es una cantante colombiana famosa por sus éxitos como 'Hips Don't Lie'.");
            case "titanic" -> System.out.println("Titanic es una película de 1997 dirigida por James Cameron.");
            case "breaking bad" -> System.out.println("Breaking Bad es una serie sobre un profesor de química convertido en narcotraficante.");
            case "picasso" -> System.out.println("Pablo Picasso fue un pintor y escultor español, creador del cubismo.");
            case "one piece" -> System.out.println("One Piece es un manga y anime sobre piratas en busca del tesoro legendario.");
            default -> System.out.println("No tengo información sobre eso.");
        }
        
        scanner.close();
    }
}
