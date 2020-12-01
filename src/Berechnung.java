public class Berechnung {

    int number_a;
    int number_b;
    int i;

    public Berechnung(int a, int b){
        number_a = a;
        number_b = b;

        i = a+b;

        System.out.println(String.format("Das Ergebnis von %s + %s ist %s!", a,b,i));
    }
}
