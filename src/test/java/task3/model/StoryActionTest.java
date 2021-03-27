package task3.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoryActionTest {

    private Door door;

    @BeforeEach
    void setUp() {
        door = new Door();
    }

    @Test
    public void openOrCloseDoor() {
        StoryAction.openOrCloseDoor(door);
        assertTrue(door.isOpenStatus());

        StoryAction.openOrCloseDoor(door);
        assertFalse(door.isOpenStatus());
    }
}