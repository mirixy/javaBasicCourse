package Programmieraufgabe9;

import java.util.Scanner;

public class Aufgabe_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        int choice;
        boolean run = true;

        while(run) {
            System.out.print("Please provide the first number: ");
            number1 = sc.nextInt();
            System.out.print("Please provide the second number: ");
            number2 = sc.nextInt();
            System.out.print("Please type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1: {
                    System.out.println(number1 + number2); break;
                }
                case 2: System.out.println(number1 - number2); break;
                case 3: System.out.println(number1 * number2); break;
                case 4: System.out.println(number1 / number2); break;
                default: System.out.println("Number invalid");
            }
            System.out.print("Do you want to run it again? type 1 for No type 0: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1: continue;
                case 0: run = false; break;
            }
        }


    }
}
