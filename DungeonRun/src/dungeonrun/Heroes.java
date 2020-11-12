package dungeonrun;

import java.io.*;

public abstract class Heroes extends Creatures implements Serializable {

    private int initiative;
    private int health;
    private int attack;
    private int agility;
    private String name;
    private String role;
    private int treasure;

    public Heroes(int initiative, int health, int attack, int agility, String name, String role) {
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

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
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
