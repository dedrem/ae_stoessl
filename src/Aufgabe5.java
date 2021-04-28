public class Aufgabe5 {

    public Aufgabe5(int chargesize, int amount, int start){

        int[] zehn = new int[amount/chargesize];

        for (int i = 0; i < zehn.length; i++){
            zehn[i] = start + i*chargesize;
        }

        for (int i : zehn){
            System.out.println(String.format("Die aktuelle Chargennummer ist %s.", i));
        }
    }
}
