import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO wpisz 1 string, przenies 2 ostatnie znaki na przod

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz tekst: ");
        String string = scanner.nextLine();

        if (string.length() > 2) {
            String stringTwoLastLetters = string.substring(string.length() - 2);
            System.out.println(stringTwoLastLetters + string.substring(0, string.length() - 2));
        }
        else {
            System.out.println("String powinien mieć więcej niż 2 znaki.");
        }
    }
}