package dungeonrun;

public class Thief extends Heroes {

    public Thief(int initiative, int attack, int health, int agility, String name, int type, int totalInitiative) {
        super(initiative, attack, health, agility, name, type, totalInitiative);
    }

    public static void stats() {

        System.out.println("        _________");
        System.out.println("     ,''         ``.");
        System.out.println("    /               \\");
        System.out.println("   |   ,---------.   |");
        System.out.println("   |  /--.     ,--\\  |");
        System.out.println("   | /`-._\\   /_,-'\\ |");
        System.out.println("   |/               \\|           ==============================");
        System.out.println("   /                 \\          | THIEF:                       |");
        System.out.println("  (_`-._         _,-'_)         | Initiative: 7                |");
        System.out.println("   /  ._'-.___,-'_,  \\          | Health: 5                    |");
        System.out.println("  / /   `-.\\_/.-'   \\ \\         | Attack: 5                    |");
        System.out.println(" : (  ,    | |    .  ) \"        | Agility: 7                   |");
        System.out.println(" |  \\ |    |||    | /  |        | Special: 25% critical damage |");
        System.out.println(" |   \\|    |||    |/   |         ==============================");
        System.out.println(" | ,-'|    |||    |`-. |");
        System.out.println(" |/|  |____\\|/____|  |\\|");
        System.out.println("  \\'--|___((_))___|--|/");
        System.out.println("   |\\_|-_ \\\\|//__-|_/ |");

    }

}
