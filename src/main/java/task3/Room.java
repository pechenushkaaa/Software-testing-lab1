package task3;

public class Room {
    private int characterCount;

    public void addCharacterToRoom(Character character){
        System.out.println("Персонаж - " + character.getRole() + " с именем: " + character.getName() + " вошел в комнату.");
        characterCount++;
    }

    public void removeCharacterFromRoom(Character character){
        System.out.println("Персонаж - " + character.getRole() + " с именем: " + character.getName() + " вышел из комнаты.");
        if (characterCount > 0) characterCount--;
    }

    public int getCharacterCount() {
        return characterCount;
    }
}
