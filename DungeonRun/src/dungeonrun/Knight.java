package dungeonrun;

import java.io.*;

public class Knight extends Heroes implements Serializable {

    public Knight() {
    }

    public Knight(int initiative, int attack, int health, int agility, String name, int type, int totalInitiative) {
        super(initiative, attack, health, agility, name, type, totalInitiative);

    }

    public static void stats() {

        System.out.println("     _,.");
        System.out.println("    ,` -.)");
        System.out.println("   ( _/-\\\\-._");
        System.out.println("  /,|`--._,-^|            ,");
        System.out.println("  \\_| |`-._/||          ,'|");
        System.out.println("    |  `-, / |         /  /");
        System.out.println("    |     || |        /  /");
        System.out.println("     `r-._||/   __   /  /      =============================");
        System.out.println(" __,-<_     )`-/  `./  /      | KNIGHT:                     |");
        System.out.println("'  \\   `---'   \\   /  /       | Initiative: 5               |");
        System.out.println("    |           |./  /        | Health: 9                   |");
        System.out.println("    /           //  /         | Attack: 6                   |");
        System.out.println("\\_/' \\         |/  /          | Agility: 4                  |");
        System.out.println(" |    |   _,^-'/  /           | Special: Block first attack |");
        System.out.println(" |    , ``  (\\/  /_            =============================");
        System.out.println("  \\,.->._    \\X-=/^");
        System.out.println("  (  /   `-._//^`");
        System.out.println("   `Y-.____(__}");
        System.out.println("    |     {__)");
        System.out.println("          ()");
    }
}
