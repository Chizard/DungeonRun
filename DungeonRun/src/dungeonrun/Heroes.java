package dungeonrun;

import java.io.*;

public class Heroes extends Creatures implements Serializable {

    public Heroes() {
    }

    public Heroes(int initiative, int attack, int health, int agility, String name, int type, int totalInitiative) {
        super(initiative, attack, health, agility, name, type, totalInitiative);
    }

}
