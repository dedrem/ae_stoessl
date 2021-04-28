public class Aufgabe3 {


    public Aufgabe3(int[] valuesAddition, int[] valuesMultiplication){
        //a
        int[] arrayA = valuesAddition;

        int sum = 0;

        for(int i : arrayA){
            sum += i;
        }
        System.out.println(String.format("Die Quartalsumsätze der VR-Brillen beträgt %s Tausend Euro.", sum));

        //b
        int[] arrayB = valuesMultiplication;

        int mul = 1;

        for(int i : arrayB){
            mul *= i;
        }
        System.out.println(String.format("Das Ergebnis der Berechnung ist %s.", mul));

    }
}
