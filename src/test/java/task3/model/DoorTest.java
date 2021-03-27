package task3.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import task3.model.Door;
import task3.model.StoryAction;

import static org.junit.jupiter.api.Assertions.*;

class DoorTest {
    private static Door door;

    @BeforeAll
    public static void setup(){
        door = new Door();
    }

    @Test
    public void toggleDoorOpenness(){
        assertFalse(door.isOpenStatus());

        StoryAction.openOrCloseDoor(door);
        assertTrue(door.isOpenStatus());
    }

}