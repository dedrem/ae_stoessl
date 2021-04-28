import java.util.ArrayList;

public class Aufgabe4 {


    public Aufgabe4(int[] values){
        int[] mitarbeiterArray = values;

        //no check
        System.out.println(String.format("Die Anzahl der Mitarbeiter beträgt %s.", mitarbeiterArray.length));

        //with check

        ArrayList<Integer> mitarbeiter = new ArrayList<>();
        for(int i : values){
            if (!mitarbeiter.contains(i)){
                mitarbeiter.add(i);
            }
        }
        System.out.println(String.format("Die bereinigte Anzahl der Mitarbeiter beträgt %s.", mitarbeiter.size()));

    }
}
