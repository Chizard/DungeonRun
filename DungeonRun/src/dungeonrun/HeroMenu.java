package dungeonrun;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HeroMenu implements Serializable {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<HeroesAbstract> stats = new ArrayList<>();         // Komma på hur vi sparar både typ av hjälte och valt namn
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
            if (confirm == true && checkName(name) == true) {
                String role = "Knight";
                HeroesAbstract knight = new Knight(5, 9, 6, 4, name, role);
                stats.add(knight);
                checkName(name);
                saveHero();
            } else {
                chooseHero();
            }

        } else if (userInput == 2) {
            Wizard.stats();
            boolean confirm = confirmHero();
            String name = name();
            if (confirm == true && checkName(name) == true) {
                String role = "Wizard";
                HeroesAbstract wizard = new Wizard(5, 9, 6, 4, name, role);
                stats.add(wizard);
                saveHero();
            } else {
                chooseHero();
            }
        } else if (userInput == 3) {
            Thief.stats();
            boolean confirm = confirmHero();
            String name = name();
            if (confirm == true && checkName(name) == true) {
                String role = "Thief";
                HeroesAbstract thief = new Thief(5, 9, 6, 4, name, role);
                stats.add(thief);
                saveHero();
            } else {
                chooseHero();
            }
        } else {
            System.out.println("Error! Choose 1, 2 or 3!");
            chooseHero();

        }

    }

    public static void loadCharacter() {
        try {
            FileInputStream fis = new FileInputStream("CharacterList");
            ObjectInputStream ois = new ObjectInputStream(fis);

            stats = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        System.out.println(stats);

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

    public static void saveHero() {

        try {
            FileOutputStream fos = new FileOutputStream("CharacterList");           // Ta bort ,true senare. Samma som med 117.
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stats);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Hero Created!");
    }

    public static boolean checkName(String name) {
        checkName = true;
        for (HeroesAbstract h : stats) {
            if (name.equalsIgnoreCase(h.getName())) {
                checkName = false;
                System.out.println("Hero already exists!");

            }

        }
        return checkName;
    }

}
