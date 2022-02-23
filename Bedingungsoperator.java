public class Bedingungsoperator {
    public static void main (String[] args) {
        int a = 10;
        int b = 5;
        int max;
       /*
       if(a > b) {
            max = a;
        }
        else {
            max = b;
        }
        System.out.println(max);
        */

        /*
            Bedingungsoperator (Tenary Operator? )
         */
        max = (a > b) ? a : b;
        System.out.println(max);

    }
}
