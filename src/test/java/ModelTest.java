import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import task3.*;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;


class ModelTest {
    private static Room room;
    private static Door door;
    private static Human human1;
    private static Human human2;
    private static Human lackey1;
    private static Human lackey2;
    private static Human lackey3;

    @BeforeAll
    public static void setup(){
        StoryAction.makeNoise("шум");
        StoryAction.makeNoise("крики");
        door = new Door();
        room = new Room();
        human1 = new Human("Человек","сердитый", new ArrayList<>(Arrays.asList("Выцветший синий балахон", "пояс Круксванского университета")), 20);
        human2 = new Human("Человек","сердитый", new ArrayList<>(Arrays.asList("Выцветший синий балахон", "пояс Круксванского университета")), 20);
        lackey1 = new Human("Лакей");
        lackey2 = new Human("Лакей");
        lackey3 = new Human("Лакей");
    }

    @Test
    public void toggleDoorOpenness(){
        assertFalse(door.isOpenStatus());

        StoryAction.openOrCloseDoor(door);
        assertTrue(door.isOpenStatus());
    }

    @Test
    public void TryPushCharacter(){
        assertTrue(human1.push(lackey1));
        assertTrue(human1.push(lackey2));
        assertTrue(human2.push(lackey3));
    }

    @Test
    public void TryBlockTheRoad(){
        assertFalse(lackey1.blockTheRoad(human1));
        assertFalse(lackey2.blockTheRoad(human1));
        assertFalse(lackey3.blockTheRoad(human2));
    }

    @Test
    public void enterIntoRoom(){
        room.addCharacterToRoom(human1);
        room.addCharacterToRoom(human2);

        int excepted = 2;

        assertEquals(excepted, room.getCharacterCount());
    }
}
