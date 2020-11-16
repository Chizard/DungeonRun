package dungeonrun;

import java.io.*;
import java.util.Scanner;

public class MAINDungeonRun implements Serializable {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    static Map w = new Map();

    public static void main(String[] args) {
        HeroMenu.loadExistingCharacters();
        while (loop) {
            homeInput(home());
            if (HeroMenu.player != null) {
                break;
            }
        }

        w.welcomeMessage();
        w.selectMap();
        w.showMap();
        w.choiceOfStartPosition();
        w.visitedRoom();

    }

    public static int home() {

        int userInput;

        System.out.println("                            ,-.");
        System.out.println("       ___,---.__          /'|`\\          __,---,___");
        System.out.println("    ,-'    \\`    `-.____,-'  |  `-.____,-'    //    `-.");
        System.out.println("  ,'        |           ~'\\     /`~           |        `.");
        System.out.println(" /      ___//              `. ,'          ,  , \\___      \\");
        System.out.println("|    ,-'   `-.__   _         |        ,    __,-'   `-.    |");
        System.out.println("|   /          /\\_  `   .    |    ,      _/\\          \\   |");
        System.out.println("\\  |           \\ \\`-.___ \\   |   / ___,-'/ /           |  /");
        System.out.println(" \\  \\           | `._   `\\\\  |  //'   _,' |           /  /");
        System.out.println("  `-.\\         /'  _ `---'' , . ``---' _  `\\         /,-'");
        System.out.println("     ``       /     \\    ,='/ \\`=.    /     \\       ''");
        System.out.println("             |__   /|\\_,--.,-.--,--._/|\\   __|");
        System.out.println("             /  `./  \\\\`\\ |  |  | /,//' \\,'  \\");
        System.out.println("           |   |     /'\\_\\_\\ | /_/_/`\\     |   |");
        System.out.println("            \\   \\__, \\_     `~'     _/ .__/   /");
        System.out.println("             `-._,-'   `-._______,-'   `-._,-'");

        System.out.println("  ======================================================== ");
        System.out.println(" |              WELCOME TO DUNGEON RUN!                   |");
        System.out.println(" | In this adventure you will meet monsters, so beware.   |");
        System.out.println(" | You will have to fight but can also flee,              |");
        System.out.println(" |           if you don´t have the guts.                  |");
        System.out.println(" |                                                        |");
        System.out.println(" | If your´re lucky you may also find a treasure.         |");
        System.out.println(" |  When you have won all fights and visited              |");
        System.out.println(" |  all rooms on the map, you have won the game.          |");
        System.out.println(" |                                                        |");
        System.out.println(" | Are you ready for the adventure, please, make a choice |");
        System.out.println(" |                1) New Character                        |");
        System.out.println(" |                2) Load Character                       |");
        System.out.println(" |                3) Exit                                 |");
        System.out.println("  ======================================================== ");

        userInput = sc.nextInt();
        return userInput;
    }

    public static void homeInput(int userInput) {

        switch (userInput) {
            case 1:
                HeroMenu.chooseHero();
                break;

            case 2:
                if (HeroMenu.chooseLoadedHeroes(HeroMenu.loadCharacter()) == true) {
                    System.out.println("Starting game!");
                } else {
                }

                break;

            case 3:
                System.out.println("Exiting program, thanks for playing!");
                break;
            default:
                System.out.println("Please enter 1, 2 or 3");
        }

    }

}
