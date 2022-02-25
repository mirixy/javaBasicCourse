package Programmieraufgabe11;

import java.util.Scanner;

public class Konsolenspiel {
    static int Obergrenze = 1000;
    static int Untergrenze = 1;
    static int guessNumber = (Obergrenze + Untergrenze) / 2;
    static int userChoice = 0;
    static int player = 0;
    static int count = 1;
   static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        takeNumber();
        do {
            guess();
        } while (userChoice != 1);

    }

    public static void takeNumber() {
        System.out.println("Please provide your Number to guess between 1 to 1000: ");
        player = sc.nextInt();
    }
    public static void guess() {
        System.out.println("Is your Number " + guessNumber + " or higher than that, or lower press 1, 3 or 2");
        userChoice = sc.nextInt();
        if(userChoice == 1) {
            System.out.println("Your Number is: " + guessNumber);
            System.out.println("Game is over");
            System.out.println("Number of Attemps: " + count);
        }
        else if(userChoice == 2) {
            Obergrenze = guessNumber;
            guessNumber = calculate(userChoice);
            count++;
            System.out.println("Your Number is lower than: "+guessNumber + " " + Obergrenze);
        }
        else if(userChoice == 3) {
            Untergrenze = guessNumber;
            guessNumber = calculate(userChoice);
            count++;
            System.out.println("Your Number is higher than: " + guessNumber + " " + Untergrenze);
        }

    }

    public static int calculate(int userChoice) {
        int ergebnis = 0;
        if (userChoice == 2 ) {
            ergebnis = (Obergrenze + Untergrenze) / 2;
        }
        else if (userChoice == 3 ) {
            ergebnis = (Obergrenze + Untergrenze) / 2;
        }
        return ergebnis;
    }

}
