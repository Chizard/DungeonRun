package dungeonrun;

import java.io.*;

public abstract class HeroesAbstract implements Serializable {

    private int initiative;
    private int health;
    private int attack;
    private int agility;
    private String name;
    private String role;
    private int treasure;

    public HeroesAbstract(int initiative, int health, int attack, int agility, String name, String role) {
        this.initiative = initiative;
        this.health = health;
        this.attack = attack;
        this.agility = agility;
        this.name = name;
        this.role = role;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void stats() {
        System.out.println("Nu blev det fel");
    }

    @Override
    public String toString() {
        return "Hero: " + name + "\n Class: " + role + "\n";

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getTreasure() {
        return treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

}
