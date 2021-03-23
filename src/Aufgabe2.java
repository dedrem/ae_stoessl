public class Aufgabe2 {


    public Aufgabe2(int start, int end){

        do {
            gibAus(start);
            start++;
        }while (start <= end);

    }

    private void gibAus(int number){
        System.out.println(String.format("Ich gebe %s aus.",number));
    }
}
