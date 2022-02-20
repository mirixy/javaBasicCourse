import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int zahl;
        System.out.print("Bitte gebe den Inhalt der variable Zahl als Zahl ein: ");
        zahl = sc.nextInt();
        System.out.println("Der Inhalt der Variable zahl ist: " + zahl);
    }
}
