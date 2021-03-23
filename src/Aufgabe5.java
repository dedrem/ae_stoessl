public class Aufgabe5 {

    public Aufgabe5(int max_customer_nr){

        for (int i = 1; i <= max_customer_nr; i++){
            if (i%2 == 0) System.out.println(String.format("Kundenummer %s gehört dem neuen Vertreter.", i));
            else System.out.println(String.format("Kundenummer %s gehört nicht dem neuen Vertreter.", i));
        }

    }

}
