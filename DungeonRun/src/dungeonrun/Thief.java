package dungeonrun;

public class Thief extends Heroes{

    public Thief(int initiative, int health, int attack, int agility, String name, String role) {
        super(initiative, health, attack, agility, name, role);
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
