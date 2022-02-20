import java.util.Scanner;
public class java_Masterkurs_Modul3_Aufgaber5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String surname;
        String name;
        int age;
        System.out.print("Bitte geben Sie ihren Vornamen ein: ");
        surname = sc.nextLine();
        System.out.print("Bitte geben Sie ihren Nachnamen ein: ");
        name = sc.nextLine();
        System.out.print("Bitte geben Sie ihr Alter an: ");
        age = sc.nextInt();
        System.out.println("Dein Name lautet: " + surname + " " + name + " und Sie sind " + age + " Jahre alt!");
    }
}
