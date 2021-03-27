package task3;

public class Character {
    private static final String DEFAULT_NAME = "No name";
    private static final int DEFAULT_FORCE = 10;

    private final String role;
    private final String name;
    private final int force;

    public Character(String role) {
        this.name = DEFAULT_NAME;
        this.role = role;
        this.force = DEFAULT_FORCE;
    }

    public Character(String role, int force) {
        this.role = role;
        this.name = DEFAULT_NAME;
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    @Override
    public String toString() {
        return "Персонаж " + role + "с именем: " + name;
    }
}
