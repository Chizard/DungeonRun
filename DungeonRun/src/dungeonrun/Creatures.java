package dungeonrun;

import java.io.*;

public class Creatures implements Comparable<Creatures>, Serializable {

    private int initiative;
    private int health;
    private int attack;
    private int agility;
    private int type;
    private int totalInitiative;
    public String name;

    public Creatures() {
    }

    public Creatures(int initiative, int attack, int health, int agility, String name, int type, int totalInitiative) {
        this.initiative = initiative;
        this.health = health;
        this.attack = attack;
        this.agility = agility;
        this.name = name;
        this.type = type;
        this.totalInitiative = totalInitiative;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getTotalInitiative() {
        return totalInitiative;
    }

    public void setTotalInitiative(int totalInitiative) {
        this.totalInitiative = totalInitiative;
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

    public int getAgility() {
        return agility;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\n" + name + " rolls " + initiative + " dice and gets a total of " + totalInitiative;
    }

    @Override
    public int compareTo(Creatures o) {
        return o.totalInitiative - this.totalInitiative;
    }

}
