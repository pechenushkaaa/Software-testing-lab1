package task3;

public class Character {
    private String role;
    private String name;
    private int force;

    public Character(String role) {
        this.name = "No name";
        this.role = role;
        this.force = 10;
    }

    public Character(String role, int force) {
        this.role = role;
        this.name = "No name";
        this.force = force;
    }

    public Character(String name, String role, int force) {
        this.name = name;
        this.force = force;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
