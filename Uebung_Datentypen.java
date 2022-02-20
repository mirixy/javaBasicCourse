public class Uebung_Datentypen {
    public static void main(String[] args){
        /* Ganzzahlen Datentypen */
        byte variable1 = 127; // darf nicht 127 Ueberschreiten!!! und nocht -128!!!
        short variable2 = 32767; //darf diese Zahl nicht ueberschreiten!
        int variable3 = 20300;
        long variable4 = 2300;
        /* Fließkommazahlen Datentypen */
        float variable5 = 2.123456789f; // Ohne das f wird die zahl automatisch ein double.
        double variable6 = 2.123456789;

        System.out.println("float: " + variable5 + " double: " + variable6);
        /* Unterschied zwischen float und double
            -double besitzt den doppelten Speicherplatz von float
            -Zahlen haben eine unendliche Zahlendichte
            Problem: Man kann nicht unendlich viele Zahlen speichern,
            denn dafuer braeuchte man unendlich viel Speicherplatz.
            => Fließkommazahlen haben also eine bregenzte Genauigkeit
         */

        double variable7 = 2; // Zahl wird der variable zugewiesn und zwar als 2.0

        /* Zeichen abspeichern */
        //char also character speichert immer nur ein character ab!
        char variable8 = 'b';
        char variable9 = 'B';
        char variable10 = 'c';

        variable10 = 'a' + 'b'; // jeder character wird als Zahl abgespeichert, daher wird durch die addition ein neuer character gebildet!

        System.out.println(variable10);

        /* Boolean  kann nur der Wahrheitswert zugewiesen werden*/
        boolean variable11 = true; // Vergleiche sind sinnvoll wie 2 < 1 wird zu false!
        boolean variable12 = false;

        System.out.println(variable11);
        System.out.println(variable12);

    }
}
