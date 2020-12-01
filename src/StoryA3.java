public class StoryA3 {

    RobotA3 bs1;

    public StoryA3(String task){
        bs1 = new RobotA3(task);

        System.out.println(bs1.task);
        System.out.println(bs1.getTask());
    }
}
