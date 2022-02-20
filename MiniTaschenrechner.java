import java.util.Scanner;

public class MiniTaschenrechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Dividend;
        int Divisor;
        System.out.println("Bitte geb den Dividend ein: ");
        Dividend = sc.nextInt();
        System.out.println("Bitte geb den Divisor ein: ");
        Divisor = sc.nextInt();
        int erg1 = Dividend / Divisor;
        int rest = Dividend % Divisor;
        System.out.println("Ergebnis: " + erg1 + " Rest: " + rest);

    }
}
