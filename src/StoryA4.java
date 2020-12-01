public class StoryA4 {

    RobotA4 ourLego;

    public StoryA4(int eyes, String name){
        ourLego = new RobotA4(eyes, name);

        System.out.println("Augen von ourLego: " + ourLego.getEyes());
        System.out.println("Name von ourLego: " + ourLego.getName());
    }
}
