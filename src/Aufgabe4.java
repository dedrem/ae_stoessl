import java.util.ArrayList;

public class Aufgabe4 {


    public Aufgabe4(int[] values){

        //no check
        System.out.println(String.format("Die Anzahl der Mitarbeiter beträgt %s.", values.length));

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
