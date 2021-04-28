public class Aufgabe1 {

    public Aufgabe1(int[] values){
        int[] a11;
        a11 = new int[values.length];
        int[] a12 = new int[values.length];

        for(int i = 0; i<values.length; i++){
            a11[i] = values[i];
            a12[i] = values[i];
        }

        for(int i : a11){
            System.out.println(i);
        }

        for(int i : a12){
            System.out.println(i);
        }

    }
}
