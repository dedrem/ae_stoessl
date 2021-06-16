public class Aufgabe6 {

    public Aufgabe6(){

        int[] array = {1,1,1,1,1,1,1,1};

        for(int i = 0; i < array.length; i++){
            System.out.println(String.format("Die Anzahl der abgschlossenen Wartungsverträge von Mitarbeiter %s beträgt %s.", i+1, array[i]));
        }
        //c?

        int[] arrayC = new int[101];
        for(int i = 0; i < arrayC.length; i++){
            arrayC[i] = i+1;
        }

    }


}
