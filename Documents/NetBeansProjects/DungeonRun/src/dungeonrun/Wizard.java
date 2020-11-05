package dungeonrun;

public class Wizard extends HeroesAbstract{

    public Wizard(int initiative, int health, int attack, int agility, String name, String role) {
        super(initiative, health, attack, agility, name, role);
    }

    public static void stats() {
 
        System.out.println("                    ____ ");
        System.out.println("                  .'* *.'");
        System.out.println("               __/_*_*(_");
        System.out.println("              / _______ \\");
        System.out.println("             _\\_)/___\\(_/_ ");
        System.out.println("            / _((\\- -/))_ \\");
        System.out.println("            \\ \\())(-)(()/ /           =============================");
        System.out.println("             ' \\(((()))/ '           | WIZARD:                     |");
        System.out.println("            / ' \\)).))/ ' \\          | Initiative: 6               |");
        System.out.println("           / _ \\ - | - /_  \\         | Health: 4                   |");
        System.out.println("          (   ( .;''';. .'  )        | Attack: 9                   |");
        System.out.println("          _\\\"__ /    )\\ __\"/_        | Agility: 5                  |");
        System.out.println("            \\/  \\   ' /  \\/          | Special: 80% chance to flee |");
        System.out.println("             .'  '...' ' )            =============================");
        System.out.println("              / /  |  \\ \\");
        System.out.println("             / .   .   . \\");
        System.out.println("            /   .     .   \\");
        System.out.println("           /   /   |   \\   \\");
        System.out.println("         .'   /    b    '.  '.");
        System.out.println("     _.-'    /     Bb     '-. '-._ ");
        System.out.println(" _.-'       |      BBb       '-.  '-. ");
        System.out.println("(________mrf\\____.dBBBb.________)____)");
         
}

}
