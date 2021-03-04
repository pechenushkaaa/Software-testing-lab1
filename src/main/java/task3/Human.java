package task3;

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

    public Human(String name, String role, String mood, List<String> clothes, int force) {
        super(name, role, force);
        this.mood = mood;
        this.clothes = clothes;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public List<String> getClothes() {
        return clothes;
    }

    public void setClothes(List<String> clothes) {
        this.clothes = clothes;
    }

    public void addClothes(String clothes) {
        this.clothes.add(clothes);
    }

    public void removeClothes(String clothes) {
        this.clothes.remove(clothes);
    }

    @Override
    public boolean blockTheRoad(Character character) {
        if (this.getForce() > character.getForce()){
            System.out.println(this.getRole() + " с именем: " + this.getName() + " - преградил дорогу персанажу - " + character.getRole() + " с именем: " + character.getName());
            return true;
        } else {
            System.out.println(this.getRole() + " с именем: " + this.getName() + " - не смог преградить дорогу персанажу - " + character.getRole() + " с именем " + character.getName());
            return false;
        }
    }

    @Override
    public boolean push(Character character) {
        if (this.getForce() > character.getForce()){
            System.out.println(this.getRole() + " с именем: " + this.getName() + " - толкнул персанажа - " + character.getRole() + " с именем: " + character.getName());
            return true;
        } else {
            System.out.println(this.getRole() + " с именем: " + this.getName() + " - не смог толкнуть персанажа - " + character.getRole() + " с именем " + character.getName());
            return false;
        }
    }

    @Override
    public void enterTheRoom(Room room) {
        room.addCharacterToRoom(this);
    }
}
