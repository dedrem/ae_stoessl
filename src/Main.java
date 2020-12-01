public class Main {

    static String text_combo = "Ich mag die Zahl ... ";
    static String text_task = "Raum finden";

    public static void main(String[] args){
        Berechnung berechnung = new Berechnung(3,4);
        Kombination kombination = new Kombination(text_combo,7);
        StoryA3 storyA3 = new StoryA3(text_task);
        StoryA4 storyA4 = new StoryA4(2,"mindstorm");

    }
}
