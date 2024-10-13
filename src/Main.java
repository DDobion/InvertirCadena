import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        
        System.out.println("Cadena invertida: " + invertirCadena(cadena));
    }

    public static String invertirCadena(String cadena) {
        
        if (cadena.length() <= 1) {
            return cadena;
        }
        
        return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
    }
}
