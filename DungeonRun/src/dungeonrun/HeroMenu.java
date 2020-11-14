package dungeonrun;

import java.io.*;
import java.util.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class HeroMenu implements Serializable {

    static Scanner sc = new Scanner(System.in);

    static Map m = new Map();

    static ArrayList<Heroes> heroes = new ArrayList<>();
    static ArrayList<Monsters> monsters = new ArrayList<>();
    static ArrayList<Integer> initiative = new ArrayList<>();
    static ArrayList<Creatures> creatures = new ArrayList<>();
    static Heroes player;

    static String ANSI_RESET = "\033[0m";
    static String ANSI_GREEN = "\033[32;1m";
    static String ANSI_RED = "\033[31;1m";
    static String ANSI_YELLOW = "\033[33;1m";
    static String ANSI_PURPLE = "\033[35;1m";
    static String ANSI_BLUE = "\033[34;1m";
    static String ANSI_CYAN = "\033[36;1m";
    static String ANSI_WHITE = "\033[37;1m";

    static boolean checkName = true;

    public static void chooseHero() {

        System.out.println("                      =============== ");
        System.out.println("                     |  SELECT HERO  |");
        System.out.println("                     |   1. Knight   |");
        System.out.println("                     |   2. Wizard   |");
        System.out.println("                     |   3. Thief    |");
        System.out.println("                      =============== ");

        int userInput = sc.nextInt();
        sc.nextLine();

        if (userInput == 1) {
            Knight.stats();
            boolean confirm = confirmHero();
            String name = name();
            String role = "Knight";
            if (confirm == true && checkName(name) == true) {
                player = new Knight(5, 6, 1, 1, name, 1, 0);
                heroes.add(player);
                saveHero();
                // randomMonster();
            } else {
                chooseHero();
            }

        } else if (userInput == 2) {
            Wizard.stats();
            boolean confirm = confirmHero();
            String name = name();
            if (confirm == true && checkName(name) == true) {
                String role = "Wizard";
                player = new Wizard(6, 4, 9, 5, name, 1, 0);
                heroes.add(player);
                saveHero();
                randomMonster();
            } else {
                chooseHero();
            }
        } else if (userInput == 3) {
            Thief.stats();
            boolean confirm = confirmHero();
            String name = name();
            if (confirm == true && checkName(name) == true) {
                String role = "Thief";
                player = new Thief(7, 5, 5, 7, name, 1, 0);
                heroes.add(player);
                saveHero();
                randomMonster();
            } else {
                chooseHero();
            }
        } else {
            System.out.println("Error! Choose 1, 2 or 3!");
            chooseHero();

        }

    }

    public static Fight.FightState startGame() {
        randomMonster();
        if (monsters.size() > 0) {
            return battle();                            //Returnerar player escaped, player died, all monsters died, monster died, monsters empty
        }
        System.out.println("\nNo monsters in this room!\n");
        return Fight.FightState.monsters_empty;

    }

    public static boolean confirmHero() {

        System.out.println("\nContinue? \n1. Yes \n2. No");

        int userInput = sc.nextInt();
        sc.nextLine();

        while (true) {
            switch (userInput) {
                case 1:
                    return true;
                case 2:
                    return false;

                default:
                    System.out.println("Error! Choose 1 or 2");
                    break;
            }
        }

    }

    public static String name() {
        System.out.println("\nEnter name");
        String input = sc.nextLine();

        return input;
    }

    public static boolean checkName(String name) {
        checkName = true;
        for (Heroes h : heroes) {
            if (name.equalsIgnoreCase(h.getName())) {
                checkName = false;
                System.out.println("Hero already exists!");

            }

        }
        return checkName;
    }

    public static Heroes selectHero(String hero) {

        for (Heroes c : heroes) {
            if (hero.equals(c.getName())) {
                return c;
            }

        }
        return null;
    }

    public static void randomMonster() {
        
        Random random = new Random();
        monsters.clear();

        if (Math.random() * 100 < 100) {     //jättespindel 20, 
            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
            System.out.println("Watch out, there's a Giantspider ahead!");
            Monsters spider = new GiantSpider(7, 2, 1, 3, "Giant Spider", 2, 0);
            monsters.add(spider);
        }

        if (Math.random() * 100 < 100) {  //skelett 15  
            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
            System.out.println("Watch out, there's a Skeleton ahead!");
            Monsters skeleton = new Skeleton(4, 3, 2, 3, "Skeleton", 2, 0);
            monsters.add(skeleton);
        }
        if (Math.random() * 100 < 100) {   //orc 10
            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
            System.out.println("Watch out, there's an Orc ahead!");
            Monsters orc = new Orc(6, 4, 3, 4, "Orc", 2, 0);
            monsters.add(orc);
        }
        if (Math.random() * 100 < 100) {     //troll 5
            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
            System.out.println("Watch out, there's a Troll ahead!");
            Monsters troll = new Troll(2, 7, 4, 2, "Troll", 2, 0);
            monsters.add(troll);
        }

    }

    public static Fight.FightState battle() {
        int playerInit = -1;
        int monsterInit = -1;
        boolean heroAttacks = false;

        Fight.sortAttackers();
        Fight.FightState currentState = Fight.FightState.continue_attack;
        for (Monsters monster : monsters) {
            currentState = Fight.FightState.continue_attack;
            while (currentState == Fight.FightState.continue_attack) {
                if (playerInit == -1 && monsterInit == -1) {
                    monsterInit = monster.getTotalInitiative();
                    playerInit = player.getTotalInitiative();

                    if (monsterInit > playerInit) {
                        heroAttacks = false;
                    } else if (monsterInit < playerInit) {
                        heroAttacks = true;
                    } else {
                        heroAttacks = true;
                    }
                }
                if (heroAttacks == true) {
                    currentState = fightOrFlight(monster);
                    heroAttacks = false;
                } else if (heroAttacks == false) {
                    currentState = monsterAttack(monster.getAttack(), player.getAgility(), monster.getName());
                    heroAttacks = true;
                }
                // Check if player is still alive else continue attack
                currentState = isPlayerAlive();
                if (currentState == Fight.FightState.player_died) {
                    System.out.println("Player died.");
                    return currentState;
                }
                currentState = areMonstersAlive();
                if (currentState == Fight.FightState.monsters_died) {
                    System.out.println("You slayed them all!");
                    return currentState;
                }
                currentState = isMonsterAlive(monster);
                if (currentState == Fight.FightState.monster_died) {
                    System.out.println("You killed the " + monster.getName());
                }

                if (currentState == Fight.FightState.player_escape_success) {
                    System.out.println("Coward!");
                    return currentState;
                }

            }
            monsterInit = -1;
            playerInit = -1;

        }
        return currentState;
    }

    public static Fight.FightState isMonsterAlive(Monsters monster) {
        if (monster.getHealth() <= 0) {
            return Fight.FightState.monster_died;
        }
        return Fight.FightState.continue_attack;
    }

    public static Fight.FightState areMonstersAlive() {
        int countDead = 0;

        for (Monsters mon : monsters) {
            if (mon.getHealth() <= 0) {
                countDead++;
            }

        }
        if (countDead == monsters.size()) {
            return Fight.FightState.monsters_died;
        }
        return Fight.FightState.continue_attack;
    }

    public static Fight.FightState isPlayerAlive() {

        if (player.getHealth() <= 0) {
            return Fight.FightState.player_died;
        }
        return Fight.FightState.continue_attack;
    }

    public static Fight.FightState fightOrFlight(Monsters monster) {
        System.out.println("\nChoose: \n1. Attack \n2. Run away");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            int result = heroAttack(player.getAttack(), monster.getAgility(), monster.getName());
            if (result == 1) {
                monster.setHealth(monster.getHealth() - 1);
            }
            return Fight.FightState.continue_attack;
        } else if (choice == 2 && flee(player.getAgility()) == 1) {

            return Fight.FightState.player_escape_success;

        }
        return Fight.FightState.continue_attack;

    }

    public static int flee(int agility) {
        System.out.println("\nYou try to escape...");

        int chance = agility * 10;

        int result = (int) (Math.random() * 100) + 1; // Drar random tal mellan 1 - 100

        if (result <= chance) {
            System.out.println("and you manage to get away!");
            return 1;
        } else {
            System.out.println("but to no avail, you have to stay and fight one more round!");
            return 0;
        }
    }

    public static int heroAttack(int heroAttack, int monsterAgility, String monsterName) {

        int attackSum = attack(heroAttack);
        System.out.println("\nYou attack with a level " + attackSum + " attack");

        int agilitySum = dodge(monsterAgility);
        System.out.println("and the " + monsterName + " try to get away with a level " + agilitySum + " dodge!");

        if (attackSum > agilitySum) {
            System.out.println("So your attack hit the " + monsterName + " which loses 1 HP!");
            return 1;
        } else {
            System.out.println("So you miss the " + monsterName + " ...");
            return 0;
        }
    }

    public static Fight.FightState monsterAttack(int monsterAttack, int heroAgility, String monsterName) {

        int attackSum = attack(monsterAttack);
        System.out.println("\nThe monster attacks you with a level " + attackSum + " attack");

        int agilitySum = dodge(heroAgility);
        System.out.println("and you try to get away with a level " + agilitySum + " dodge!");

        if (attackSum > agilitySum) {
            System.out.println("So the " + monsterName + "'s attack hit you an you lose 1 HP...");
            player.setHealth(player.getHealth() - 1);
            System.out.println("Player health: " + player.getHealth());
            return Fight.FightState.continue_attack;
        }
        System.out.println("So the " + monsterName + "swings and misses you!");
        return Fight.FightState.continue_attack;

    }

    public static int attack(int attack) {
        int attackSum = rollDice(attack);
        return attackSum;
    }

    public static int dodge(int inititative) {
        int initiativeSum = rollDice(inititative);
        return initiativeSum;
    }

    public static int rollDice(int numberOfDice) {
        int sum = 0;

        for (int i = 0; i < numberOfDice; i++) {

            int resultOfDie = (int) (Math.random() * 6) + 1; // Slår en tärning med maxvärde 6
            sum += resultOfDie; // Lägger ihop alla tärningsresultat
        }
        return sum;
    }

    public static void playMusic(String filepath) {

        InputStream music;
        try {
            music = new FileInputStream(new File(filepath));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    public static void loadExistingCharacters() {
        ArrayList<Heroes> loadHeroes = loadCharacter();
        for (Heroes loadHero : loadHeroes) {
            heroes.add(loadHero);
        }
    }

    public static ArrayList<Heroes> loadCharacter() {
        ArrayList<Heroes> loadHeroes = new ArrayList<>();
        Heroes hero = null;
        try {
            File f = new File("CharacterList");
            if (f.exists() == false) {
                return loadHeroes;
            }

            FileInputStream fis = new FileInputStream("CharacterList");
            ObjectInputStream ois = new ObjectInputStream(fis);

            loadHeroes = (ArrayList<Heroes>) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return loadHeroes;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return loadHeroes;
        }
        return loadHeroes;
        // System.out.println("\nPlaying as: "+ player);                          //Fixa sen.
        //m.selectMap();
    }

    public static boolean chooseLoadedHeroes(ArrayList<Heroes> loadHeroes) {

        if (loadHeroes == null || loadHeroes.isEmpty()) {
            System.out.println("No saved heroes...");
            return false;
        }

        int index = 0;
        System.out.println(" ================================= ");
        System.out.println("|         Choose CHARACTER        |");
        for (Heroes loadHero : loadHeroes) {
            index++;
            System.out.println("|   " + index + ". " + loadHero.getName() + " |");
        }
        System.out.println("Press 0 to return to Main Menu");
        System.out.println(" ================================= ");

        int userInput = 0;
        try {
            userInput = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Not a correct choice. Back to main menu we go!");
            return false;
        }

        if (userInput >= 0 && loadHeroes.size() >= userInput) {
            if (userInput == 0) {
                return false;
            } else {
                player = loadHeroes.get(userInput - 1);
                System.out.println("You chose: " + player.getName());
                return true;
            }
        }
        return false;
    }

    public static void saveHero() {

        try {
            FileOutputStream fos = new FileOutputStream("CharacterList");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(heroes);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Hero Created!");
    }
}
