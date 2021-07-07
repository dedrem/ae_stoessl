import java.util.Arrays;

public class Aufgabe1 {



    public Aufgabe1() {

        //Aufgabenstellung
        int arrayEins[] = new int[6];
        arrayEins[1] = 2;
        arrayEins[3] = 18;
        arrayEins[0] = 22;
        arrayEins[2] = 21;
        arrayEins[4] = 7;
        arrayEins[5] = 8;


        //Teil 1
        int[] array1 = arrayEins;
        Arrays.sort(array1);
        for(int i : array1){
            System.out.println(String.format("Der aktuelle Betrag ist %s", i));
        }

        //Teil 2
        int a = arrayEins[1] * arrayEins[2];

        //Teil 3
        divideArray(arrayEins, 0, 3);

        //Teil 4
        boolean div = isDivisible(arrayEins, 2, 4);
        if(div) System.out.println(String.format("Das fünfte Element(%s) ist ein Teiler des dritten Elements(%s)",arrayEins[2], arrayEins[4]));
        else System.out.println(String.format("Das fünfte Element(%s) ist kein Teiler des dritten Elements(%s)",arrayEins[2], arrayEins[4]));

        //Teil 5
        arrayEins = replaceElement(arrayEins, 0, 126);

    }




    private int readArray(int[] array){
        return 0;
    }

    private int multiplyArray(int[] array){
        return 0;
    }

    private void divideArray(int[] array, int index1, int index2){
        if(index1 == 0 || index2 == 0){
            System.out.println("Division durch 0");
            return;
        }
        double result = array[index1] / array[index2];
        System.out.println(String.format("Das Ergebnis von %s / %s ist %s", array[index1], array[index2], result));
    }

    private boolean isDivisible(int[] array, int index1, int index2){
        boolean result = (array[index1] % array[index2] == 0) ? true : false;
        return result;
    }

    private int[] replaceElement(int[] array, int index, int value){
        array[index] = value;
        return array;
    }



}
