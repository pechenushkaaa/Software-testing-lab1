package task3.model;

public class Room {
    private int characterCount;

    public void addCharacterToRoom(Character character){
        System.out.println(character.toString() + " вошел в комнату.");
        characterCount++;
    }

    public int getCharacterCount() {
        return characterCount;
    }
}
