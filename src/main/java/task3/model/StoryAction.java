package task3;

public class StoryAction {
    public static void makeNoise(String source){
        System.out.println("Раздался звук: " + source);
    }

    public static void openOrCloseDoor(Door door){
        if (door.isOpenStatus()){
            door.setOpenStatus(false);
            System.out.println("Дверь закрыта.");
        }
        else {
            door.setOpenStatus(true);
            System.out.println("Дверь открыта.");
        }
    }
}
