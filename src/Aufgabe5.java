public class Aufgabe5 {

    private double prices[] = {28,28.50,39,70,120.50};

    public Aufgabe5(int hour){

        switch (hour) {
            case 7:
                System.out.println(String.format("Die Karte kostet %s€.",prices[0]));
                break;

            case 8:
                System.out.println(String.format("Die Karte kostet %s€.",prices[1]));
                break;

            case 9:
                System.out.println(String.format("Die Karte kostet %s€.",prices[2]));
                break;
            case 10:
                System.out.println(String.format("Die Karte kostet %s€.",prices[3]));
                break;

            case 11:
                System.out.println(String.format("Die Karte kostet %s€.",prices[4]));
                break;

            default:
                System.out.println("Shop geschlossen");
        }
    }
}
