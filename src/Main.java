public class Main {
    public static void main(String[] args){
        aufgabe0(10.5,17.3);
        aufgabe1(5);
    }

    private static void aufgabe0(double width, double length){
        //aufgabe0 gibt Fläche und Umfang eines Rechtecks in der Konsole aus
        double area = width*length;
        double circumference = 2*(width+length);
        System.out.println(String.format("Rechteck: Länge: %s, Breite: %s",length,width));
        System.out.println(String.format("Fläche: %s, Umfang: %s",area, circumference));
    }

    private static void aufgabe1(int amount_of_toppings){
        //aufgabe1 errechnet den Gesamtpreis einer Pizza
        double price = 5.50 + amount_of_toppings*0.75;
        System.out.println(String.format("Die Pizza mit %s Toppings kostet %s Euro.",amount_of_toppings, price));

    }

    private static void aufgabe2(){

    }




}
