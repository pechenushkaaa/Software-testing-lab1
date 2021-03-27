package task3.model;

public interface HumanAction {
    boolean blockTheRoad(Character character);
    boolean push(Character character);
    void enterTheRoom(Room room);
}
