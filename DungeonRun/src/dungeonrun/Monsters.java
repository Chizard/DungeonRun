package dungeonrun;

public class Monsters extends Creatures {

    private int initiative;
    private int health;
    private int attack;
    private int agility;
    private String name;

    public Monsters(int initiative, int attack, int health, int agility, String name) {
        this.initiative = initiative;
        this.health = health;
        this.attack = attack;
        this.agility = agility;
        this.name = name;
    }

    public int getInitiative (){
        return initiative;
    }

    public int getHealth () {
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public int getAttack(){
        return attack;
    }

    public int getAgility(){
        return agility;
    }

    public String getName(){
        return name;
    }
}
