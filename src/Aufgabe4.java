public class Aufgabe4 {

    public Aufgabe4(int[] numbers){
        for(int num : numbers){
            if(num%2 == 0)System.out.println(String.format("Kundennummer %s ist gerade",num));
            else System.out.println(String.format("Kundennummer %s ist ungerade",num));
        }
    }

}
