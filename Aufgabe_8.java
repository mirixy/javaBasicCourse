public class Aufgabe_8 {
    public static void main(String[] args) {
        int index = 1;
        while(index <= 100) {
            if(index % 3 == 0 && index % 4 == 0){
                System.out.println("teilbar durch 3 und 4");
            }
            else if(index % 3 == 0){
                System.out.println("teilbar durch 3");
            }
            else if(index % 4 == 0){
                System.out.println("teilbar durch 4");
            }
            else {
                System.out.println(index);
            }
            index++;
        }
    }
}
