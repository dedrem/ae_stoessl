public class Aufgabe3 {


    public Aufgabe3(int[] valuesAddition, int[] valuesMultiplication){
        //a
        int sum = 0;

        for(int i : valuesAddition){
            sum += i;
        }

        System.out.println(String.format("Die Quartalsumsätze der VR-Brillen beträgt %s Tausend Euro.", sum));

        //b
        int mul = 1;

        for(int i : valuesMultiplication){
            mul *= i;
        }

        System.out.println(String.format("Das Ergebnis der Berechnung ist %s.", mul));

    }
}
