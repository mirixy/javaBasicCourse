import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args){
        /*
           Switch Statement
         */

        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 3 an: ");
        index = sc.nextInt();

        switch(index) {
            case 1:{
                System.out.println("Du hast die 1 gewaehlt! ");
                break;
            }
            case 2:{
                System.out.println("Du hast die 2 gewaehlt! ");
                break;
            }
            case 3:{
                System.out.println("Du hast die 3 gewaehlt! ");
                break;
            }
            default: {
                System.out.println("Bitte waehle eine Zahl zwischen 1 und 3. Deine Zahl war nicht gueltig!");
            }

        }
    }
}
