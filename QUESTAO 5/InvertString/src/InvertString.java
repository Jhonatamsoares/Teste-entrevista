import java.util.Scanner;

public class InvertString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase:");
        String original = scanner.nextLine();
        scanner.close();

        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}
