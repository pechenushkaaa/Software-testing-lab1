package task3.model;

import java.util.ArrayList;
import java.util.List;

public class Human extends Character implements HumanAction{
    private String mood;
    private List<String> clothes;

    public Human(String role) {
        super(role);
        this.mood = "No mood";
        this.clothes = new ArrayList<>();
    }

    public Human(String role, String mood, List<String> clothes, int force) {
        super(role, force);
        this.mood = mood;
        this.clothes = clothes;
    }



    @Override
    public boolean blockTheRoad(Character character) {
        if (this.getForce() > character.getForce()){
            System.out.println(this.toString() + " - преградил дорогу персанажу - " + character.toString());
            return true;
        } else {
            System.out.println(this.toString() + " - не смог преградить дорогу персанажу - " + character.toString());
            return false;
        }
    }

    @Override
    public boolean push(Character character) {
        if (this.getForce() > character.getForce()){
            System.out.println(this.toString() + " - толкнул персанажа - " + character.toString());
            return true;
        } else {
            System.out.println(this.toString() +  " - не смог толкнуть персанажа - " + character.toString());
            return false;
        }
    }

    @Override
    public void enterTheRoom(Room room) {
        room.addCharacterToRoom(this);
    }
}
