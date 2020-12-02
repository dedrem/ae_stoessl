public class Berechnung {

    int number_a;
    int number_b;
    int i;

    public Berechnung(int a, int b){
        number_a = a;
        number_b = b;

        i = number_a+number_b;

        System.out.println(String.format("Das Ergebnis von %s + %s ist %s!", number_a,number_b,i));
    }
}
