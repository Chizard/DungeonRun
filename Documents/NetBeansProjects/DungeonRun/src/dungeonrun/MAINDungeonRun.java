
package dungeonrun;

import java.io.*;
import java.util.Scanner;

public class MAINDungeonRun implements Serializable{

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;
    public static void main(String[] args) {
        while (true) {
            homeInput(home()); 
        }
          
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
        
        System.out.println("                 =========================");
        System.out.println("                | WELCOME TO DUNGEON RUN! |");
        System.out.println("                |                         |");
        System.out.println("                |    1) New Character     |");
        System.out.println("                |    2) Load Character    |");
        System.out.println("                |       3) Exit           |");
        System.out.println("                 ========================= ");
        
        userInput = sc.nextInt();
        return userInput;   
    }
    
    public static void homeInput(int userInput) {
        
        switch (userInput) {
            case 1:
                HeroMenu.chooseHero();
                break;
            
            case 2:
                HeroMenu.loadCharacter();
                break;
                
            case 3:
                System.out.println("Exiting program, thanks for playing!");
                break;
            default:
                System.out.println("Please enter 1, 2 or 3");
        }
        
    }

}
