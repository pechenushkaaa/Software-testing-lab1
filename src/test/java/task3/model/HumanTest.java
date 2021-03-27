package task3.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task3.model.Human;
import task3.model.Room;
import task3.model.StoryAction;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    private Room room;
    private Human human1;
    private Human human2;
    private Human lackey1;
    private Human lackey2;
    private Human lackey3;

    @BeforeEach
    public void setup(){
        StoryAction.makeNoise("шум");
        StoryAction.makeNoise("крики");
        room = new Room();
        human1 = new Human("Человек","сердитый", new ArrayList<>(Arrays.asList("Выцветший синий балахон", "пояс Круксванского университета")), 20);
        human2 = new Human("Человек","сердитый", new ArrayList<>(Arrays.asList("Выцветший синий балахон", "пояс Круксванского университета")), 20);
        lackey1 = new Human("Лакей");
        lackey2 = new Human("Лакей");
        lackey3 = new Human("Лакей");
    }


    @Test
    public void tryPushCharacter(){
        assertTrue(human1.push(lackey1));
        assertTrue(human1.push(lackey2));
        assertTrue(human2.push(lackey3));

        human1.setForce(5);

        assertFalse(human1.push(lackey1));
    }

    @Test
    public void tryBlockTheRoad(){
        assertFalse(lackey1.blockTheRoad(human1));
        assertFalse(lackey2.blockTheRoad(human1));
        assertFalse(lackey3.blockTheRoad(human2));

        lackey1.setForce(25);

        assertTrue(lackey1.blockTheRoad(human1));
    }

    @Test
    public void enterIntoRoom(){
        human1.enterTheRoom(room);
        human2.enterTheRoom(room);

        int excepted = 2;

        assertEquals(excepted, room.getCharacterCount());
    }

}