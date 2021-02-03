public class Aufgabe2 {

    int hours;
    int tickets;

    public Aufgabe2(int hours, int tickets){
        this.hours = hours;
        this.tickets= tickets;

        checkBreak();
    }
    private void checkBreak(){
        if(hours >= 4 && tickets >= 10) System.out.println("Sie haben sich eine Pause verdient!");
        else System.out.println("Geh arbeiten du Sack!");
    }

}
