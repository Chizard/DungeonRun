package dungeonrun;

import java.awt.Color;
import java.util.*;

public class Map {

    String ANSI_RESET = "\033[0m";
    String ANSI_GREEN = "\033[32;1m";
    String ANSI_RED = "\033[31;1m";
    String ANSI_YELLOW = "\033[33;1m";
    String ANSI_PURPLE = "\033[35;1m";
    String ANSI_BLUE = "\033[34;1m";
    String ANSI_CYAN = "\033[36;1m";
    String ANSI_WHITE = "\033[37;1m";
    static Scanner input = new Scanner(System.in);

    //static ArrayList<Monsters> monsters = new ArrayList<>();
    int mapChoice;
    int position = 0;
    int[][] mapSmall = new int[4][4];
    int[][] mapMedium = new int[5][5];
    int[][] mapLarge = new int[8][8];

    public void welcomeMessage() {
        System.out.println("  _^__                                                                __^__");
        System.out.println("( ___ )--------------------------------------------------------------( ___ )");
        System.out.println(" | / |             The adventure will follow a map.                   | \\ |");
        System.out.println(" | / |      In each room of the map something may occur,              | \\ |");
        System.out.println(" | / |       either one or multiple monsters may appear,              | \\ |");
        System.out.println(" | / |             and/or treasures will be found.                    | \\ |");
        System.out.println(" | / | Everything is random, no one knows exactly what might happen.  | \\ |");
        System.out.println(" | / |       After entered room, the room will appear as a 0,         | \\ |");
        System.out.println(" | / |        meaning that the room has already been visited.         | \\ |");
        System.out.println(" | / |                                                                | \\ |");
        System.out.println(" | / |                      Good luck!                                | \\ |");
        System.out.println(" |___|                                                                |____|");
        System.out.println("(_____)--------------------------------------------------------------(_____)");
        System.out.println();

    }

    public void exitFromMap() { //OBS Lägg in huvudmeny-metod

        System.out.println("Do you want to return to main menu, please enter Y/N; ");
        char choice;
        choice = input.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            MAINDungeonRun.homeInput(MAINDungeonRun.home());
        }
    }

    public int selectMap() {
        System.out.println(ANSI_CYAN + "You can choose between the following adventures: " + ANSI_RESET);
        System.out.println(ANSI_CYAN + "1) Map small" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "2) Map medium" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "3) Map large" + ANSI_RESET);
        System.out.println();
        System.out.println("Your choice: ");

        while (true) {

            try {
                mapChoice = input.nextInt();
                if (mapChoice < 1 || mapChoice > 3) {
                    System.out.println("Not correct, please enter a value between 1 - 3");
                    continue;
                }
            } catch (Exception e) {
                input.next();
                System.out.println("Oopsie a daisy! Try again!");
                continue;
            }
            System.out.println();
            return mapChoice;
        }

    }

    public void showMap() { //KALLAR PÅ RESPEKTIVE KART-STL mapSmall, mapMedium, mapLarge
        if (mapChoice == 1) {
            mapSmall();
        } else if (mapChoice == 2) {
            mapMedium();
        } else if (mapChoice == 3) {
            mapLarge();
        }
    } //KALLAR PÅ RESPEKTIVE KART-STL mapSmall, mapMedium, mapLarge

    public void mapSmall() {

        mapSmall[0][0] = 1;
        mapSmall[0][1] = 2;
        mapSmall[0][2] = 3;
        mapSmall[0][3] = 4;

        mapSmall[1][0] = 5;
        mapSmall[1][1] = 6;
        mapSmall[1][2] = 7;
        mapSmall[1][3] = 8;

        mapSmall[2][0] = 9;
        mapSmall[2][1] = 10;
        mapSmall[2][2] = 11;
        mapSmall[2][3] = 12;

        mapSmall[3][0] = 13;
        mapSmall[3][1] = 14;
        mapSmall[3][2] = 15;
        mapSmall[3][3] = 16;

        int rows = 4;
        int columns = 4;
        int i, j;

        for (i = 0; i < rows; i++) {
            System.out.println("------------------");
            for (j = 0; j < columns; j++) {
                System.out.print(mapSmall[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("------------------");
    }

    public void mapMedium() {

        mapMedium[0][0] = 1;
        mapMedium[0][1] = 2;
        mapMedium[0][2] = 3;
        mapMedium[0][3] = 4;
        mapMedium[0][4] = 5;

        mapMedium[1][0] = 6;
        mapMedium[1][1] = 7;
        mapMedium[1][2] = 8;
        mapMedium[1][3] = 9;
        mapMedium[1][4] = 10;

        mapMedium[2][0] = 11;
        mapMedium[2][1] = 12;
        mapMedium[2][2] = 13;
        mapMedium[2][3] = 14;
        mapMedium[2][4] = 15;

        mapMedium[3][0] = 16;
        mapMedium[3][1] = 17;
        mapMedium[3][2] = 18;
        mapMedium[3][3] = 19;
        mapMedium[3][4] = 20;

        mapMedium[4][0] = 21;
        mapMedium[4][1] = 22;
        mapMedium[4][2] = 23;
        mapMedium[4][3] = 24;
        mapMedium[4][4] = 25;

        int rows = 5;
        int columns = 5;
        int k, l;

        for (k = 0; k < rows; k++) {
            //bara snygga grejer för utskrift
            System.out.println("------------------------");
            //den inre for-loopen kolumnerna
            for (l = 0; l < columns; l++) {
                System.out.print(mapMedium[k][l] + " | ");
            }
            System.out.println("");
        }
        System.out.println("------------------------");
    }

    public void mapLarge() {

        mapLarge[0][0] = 1;
        mapLarge[0][1] = 2;
        mapLarge[0][2] = 3;
        mapLarge[0][3] = 4;
        mapLarge[0][4] = 5;
        mapLarge[0][5] = 6;
        mapLarge[0][6] = 7;
        mapLarge[0][7] = 8;

        mapLarge[1][0] = 9;
        mapLarge[1][1] = 10;
        mapLarge[1][2] = 11;
        mapLarge[1][3] = 12;
        mapLarge[1][4] = 13;
        mapLarge[1][5] = 14;
        mapLarge[1][6] = 15;
        mapLarge[1][7] = 16;

        mapLarge[2][0] = 17;
        mapLarge[2][1] = 18;
        mapLarge[2][2] = 19;
        mapLarge[2][3] = 20;
        mapLarge[2][4] = 21;
        mapLarge[2][5] = 22;
        mapLarge[2][6] = 23;
        mapLarge[2][7] = 24;

        mapLarge[3][0] = 25;
        mapLarge[3][1] = 26;
        mapLarge[3][2] = 27;
        mapLarge[3][3] = 28;
        mapLarge[3][4] = 29;
        mapLarge[3][5] = 30;
        mapLarge[3][6] = 31;
        mapLarge[3][7] = 32;

        mapLarge[4][0] = 33;
        mapLarge[4][1] = 34;
        mapLarge[4][2] = 35;
        mapLarge[4][3] = 36;
        mapLarge[4][4] = 37;
        mapLarge[4][5] = 38;
        mapLarge[4][6] = 39;
        mapLarge[4][7] = 40;

        mapLarge[5][0] = 41;
        mapLarge[5][1] = 42;
        mapLarge[5][2] = 43;
        mapLarge[5][3] = 44;
        mapLarge[5][4] = 45;
        mapLarge[5][5] = 46;
        mapLarge[5][6] = 47;
        mapLarge[5][7] = 48;

        mapLarge[6][0] = 49;
        mapLarge[6][1] = 50;
        mapLarge[6][2] = 51;
        mapLarge[6][3] = 52;
        mapLarge[6][4] = 53;
        mapLarge[6][5] = 54;
        mapLarge[6][6] = 55;
        mapLarge[6][7] = 56;

        mapLarge[7][0] = 57;
        mapLarge[7][1] = 58;
        mapLarge[7][2] = 59;
        mapLarge[7][3] = 60;
        mapLarge[7][4] = 61;
        mapLarge[7][5] = 62;
        mapLarge[7][6] = 63;
        mapLarge[7][7] = 64;

        int rows = 8;
        int columns = 8;
        int y, x;

        for (y = 0; y < rows; y++) {
            //bara snygga grejer för utskrift
            System.out.println("---------------------------------------");
            //den inre for-loopen kolumnerna
            for (x = 0; x < columns; x++) {
                System.out.print(mapLarge[y][x] + " | ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------------------");
    }

    public int choiceOfStartPosition() {
        boolean running = true;

        while (running) {
            System.out.println(ANSI_CYAN + "\nPlease choose which corner you would like to start at: " + ANSI_RESET);
            position = input.nextInt();

            if (mapChoice == 1) {
                if ((position == 1) || (position == 4) || (position == 13) || (position == 16)) {
                    return position;
                } else {
                    System.out.println("Wrong input, please try again");
                }
            } else if (mapChoice == 2) {
                if ((position == 1) || (position == 5) || (position == 21) || (position == 25)) {
                    System.out.println("The corner position you chose: " + " " + position); //Se om det kommer ut rätt
                    return position;
                } else {
                    System.out.println("Wrong input, please try again");
                }
            } else if (mapChoice == 3) {
                if ((position == 1) || (position == 8) || (position == 57) || (position == 64)) {
                    System.out.println("The corner position you chose: " + " " + position); //Se om det kommer ut rätt
                    return position;
                }
            } else {
                System.out.println("Wrong input, please try again");
                return position;
            }
        }

        return position;
    }

    public void visitedRoom() {  //KALLAR PÅ SMALL, MEDIUM EL LARGE och går vidare till choice of direction
        if (mapChoice == 1) {
            visitedRoomSmall();
            choiceOfDirectionMapSmall();
        } else if (mapChoice == 2) {
            visitedRoomMedium();
            choiceOfDirectionMapMedium();
        } else if (mapChoice == 3) {
            visitedRoomLarge();
            choiceOfDirectionMapLarge();
        }
    } //KALLAR PÅ visitedRoom-small, medium, large och går vidare till choiceOfDirectionMap-Small, medium, large

    public void visitedRoomSmall() { //KALLAR PÅ RANDOM (MONSTER, SKATTER OCH EXIT)
        //allRoomsDone();  denna funkar ej, 
        Fight.FightState finishState = HeroMenu.startGame();                    // startGame() returnera om spelaren dog, om alla monster dog, om ett monster dog, spelaren flydde och om inga monster fanns
        if (Fight.FightState.player_died == finishState) {
            return;                                                             // Bestäm vad som ska hända när spelaren dör
        }
        randomTreasure();
        randomExit();
        for (int k = 0; k < mapSmall.length; k++) {
            for (int l = 0; l < mapSmall.length; l++) {

                if (mapSmall[k][l] == position) {
                    mapSmall[k][l] = 0;
                    //    System.out.println("fortsätt spelet " + mapSmall[k][l]); //kolla så det stämmer printout
                }
            }
        }

        int rows = 4;
        int columns = 4;
        int i, j;

        for (i = 0; i < rows; i++) {
            //bara snygga grejer för utskrift
            System.out.println("------------------");
            //den inre for-loopen kolumnerna
            for (j = 0; j < columns; j++) {
                System.out.print(mapSmall[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("------------------");

    }//KALLAR PÅ RANDOM (MONSTER, SKATTER OCH EXIT)

    public void choiceOfDirectionMapSmall() { //Kallar på visitedRoom metoden
        int choice = 0;
        boolean isGameOn = true;
        System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
        System.out.println("From your current position you may choose from the following options");

        if (position == 6) {
            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }

            if (choice == 1) {
                position = 2;
            }
            if (choice == 2) {
                position = 10;
            }
            if (choice == 3) {
                position = 7;
            }
            if (choice == 4) {
                position = 5;
            }
        } else if (position == 7) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 3;
            }
            if (choice == 2) {
                position = 11;
            }
            if (choice == 3) {
                position = 8;
            }
            if (choice == 4) {
                position = 6;
            }
        } else if (position == 10) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 6;
            }
            if (choice == 2) {
                position = 14;
            }
            if (choice == 3) {
                position = 11;
            }
            if (choice == 4) {
                position = 9;
            }
        } else if ((position == 11)) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 7;
            }
            if (choice == 2) {
                position = 15;
            }
            if (choice == 3) {
                position = 12;
            }
            if (choice == 4) {
                position = 10;
            }
        } else if (position == 2) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 6;
            }
            if (choice == 3) {
                position = 3;
            }
            if (choice == 4) {
                position = 1;
            }
        } else if (position == 3) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 7;
            }
            if (choice == 3) {
                position = 4;
            }
            if (choice == 4) {
                position = 2;
            }
        } else if (position == 14) {
            System.out.println("North:1, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 10;
            }
            if (choice == 3) {
                position = 15;
            }
            if (choice == 4) {
                position = 13;
            }
        } else if (position == 15) {
            System.out.println("North:1, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 11;
            }
            if (choice == 3) {
                position = 16;
            }
            if (choice == 4) {
                position = 14;
            }
        } else if (position == 5) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 1;
            }
            if (choice == 2) {
                position = 9;
            }
            if (choice == 3) {
                position = 6;
            }
        } else if (position == 9) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 5;
            }
            if (choice == 2) {
                position = 13;
            }
            if (choice == 3) {
                position = 10;
            }
        } else if (position == 8) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 4;
            }
            if (choice == 2) {
                position = 12;
            }
            if (choice == 4) {
                position = 7;
            }
        } else if (position == 12) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 8;
            }
            if (choice == 2) {
                position = 16;
            }
            if (choice == 4) {
                position = 11;
            }
        } else if (position == 1) {
            System.out.println("South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 5;
            }
            if (choice == 3) {
                position = 2;
            }
        } else if (position == 4) {
            System.out.println("South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 8;
            }
            if (choice == 4) {
                position = 3;
            }
        } else if (position == 13) {
            System.out.println("North:1 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 9;
            }
            if (choice == 3) {
                position = 14;
            }
        } else if (position == 16) {
            System.out.println("North:1 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 12;
            }
            if (choice == 4) {
                position = 15;
            }
        }
        //else {
        // }
        visitedRoom();
    }  //KALLAR I SLUTET PÅ VISITEDROOM

//    public void choiceOfDirectionMapSmall() {
//        int choice;
//        System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
//        exitFromMap();
//        System.out.println("From your current position you may choose from the following options");
//
//        if (position == 6) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 2;
//            }
//            if (choice == 2) {
//                position = 10;
//            }
//            if (choice == 3) {
//                position = 7;
//            }
//            if (choice == 4) {
//                position = 5;
//            }
//        } else if (position == 7) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 3;
//            }
//            if (choice == 2) {
//                position = 11;
//            }
//            if (choice == 3) {
//                position = 8;
//            }
//            if (choice == 4) {
//                position = 6;
//            }
//        } else if (position == 10) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 6;
//            }
//            if (choice == 2) {
//                position = 14;
//            }
//            if (choice == 3) {
//                position = 11;
//            }
//            if (choice == 4) {
//                position = 9;
//            }
//        } else if ((position == 11)) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 7;
//            }
//            if (choice == 2) {
//                position = 15;
//            }
//            if (choice == 3) {
//                position = 12;
//            }
//            if (choice == 4) {
//                position = 10;
//            }
//        } else if (position == 2) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 6;
//            }
//            if (choice == 3) {
//                position = 3;
//            }
//            if (choice == 4) {
//                position = 1;
//            }
//        } else if (position == 3) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 7;
//            }
//            if (choice == 3) {
//                position = 4;
//            }
//            if (choice == 4) {
//                position = 2;
//            }
//        } else if (position == 14) {
//            System.out.println("North:1, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 10;
//            }
//            if (choice == 3) {
//                position = 15;
//            }
//            if (choice == 4) {
//                position = 13;
//            }
//        } else if (position == 15) {
//            System.out.println("North:1, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 11;
//            }
//            if (choice == 3) {
//                position = 16;
//            }
//            if (choice == 4) {
//                position = 14;
//            }
//        } else if (position == 5) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 1;
//            }
//            if (choice == 2) {
//                position = 9;
//            }
//            if (choice == 3) {
//                position = 6;
//            }
//        } else if (position == 9) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 5;
//            }
//            if (choice == 2) {
//                position = 13;
//            }
//            if (choice == 3) {
//                position = 10;
//            }
//        } else if (position == 8) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 4;
//            }
//            if (choice == 2) {
//                position = 12;
//            }
//            if (choice == 4) {
//                position = 7;
//            }
//        } else if (position == 12) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 8;
//            }
//            if (choice == 2) {
//                position = 16;
//            }
//            if (choice == 4) {
//                position = 11;
//            }
//        } else if (position == 1) {
//            System.out.println("South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 5;
//            }
//            if (choice == 3) {
//                position = 2;
//            }
//        } else if (position == 4) {
//            System.out.println("South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 8;
//            }
//            if (choice == 4) {
//                position = 3;
//            }
//        } else if (position == 13) {
//            System.out.println("North:1 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 9;
//            }
//            if (choice == 3) {
//                position = 14;
//            }
//        } else if (position == 16) {
//            System.out.println("North:1 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 12;
//            }
//            if (choice == 4) {
//                position = 15;
//            }
//        }
    //else {
    // }
//        visitedRoom();
//    }  //KALLAR I SLUTET PÅ VISITEDROOM
    public void visitedRoomMedium() {
        //allRoomsDone();  denna funkar ej, 
        HeroMenu.randomMonster();
        randomTreasure();
        randomExit();
        for (int k = 0; k < mapMedium.length; k++) {
            for (int l = 0; l < mapMedium.length; l++) {

                if (mapMedium[k][l] == position) {
                    mapMedium[k][l] = 0;
                }
            }
        }

        int rows = 5;
        int columns = 5;
        int i, j;

        for (i = 0; i < rows; i++) {
            //bara snygga grejer för utskrift
            System.out.println("------------------");
            //den inre for-loopen kolumnerna
            for (j = 0; j < columns; j++) {
                System.out.print(mapMedium[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("------------------");
    } //KALLAR PÅ RANDOM (MONSTER, SKATTER OCH EXIT)

    public void choiceOfDirectionMapMedium() {  //kallar på visitedRoom
        //int choice;

        int choice = 0;
        boolean isGameOn = true;
        System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
        System.out.println("From your current position you may choose from the following options");

        if (position == 7) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 2;
            }
            if (choice == 2) {
                position = 12;
            }
            if (choice == 3) {
                position = 8;
            }
            if (choice == 4) {
                position = 6;
            }
        } else if (position == 8) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 3;
            }
            if (choice == 2) {
                position = 13;
            }
            if (choice == 3) {
                position = 9;
            }
            if (choice == 4) {
                position = 7;
            }
        } else if (position == 9) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 4;
            }
            if (choice == 2) {
                position = 14;
            }
            if (choice == 3) {
                position = 10;
            }
            if (choice == 4) {
                position = 8;
            }
        } else if (position == 12) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 7;
            }
            if (choice == 2) {
                position = 17;
            }
            if (choice == 3) {
                position = 13;
            }
            if (choice == 4) {
                position = 11;
            }
        } else if (position == 13) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 8;
            }
            if (choice == 2) {
                position = 18;
            }
            if (choice == 3) {
                position = 14;
            }
            if (choice == 4) {
                position = 12;
            }
        } else if (position == 14) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 9;
            }
            if (choice == 2) {
                position = 19;
            }
            if (choice == 3) {
                position = 15;
            }
            if (choice == 4) {
                position = 13;
            }
        } else if (position == 17) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 12;
            }
            if (choice == 2) {
                position = 22;
            }
            if (choice == 3) {
                position = 18;
            }
            if (choice == 4) {
                position = 16;
            }
        } else if (position == 18) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 13;
            }
            if (choice == 2) {
                position = 23;
            }
            if (choice == 3) {
                position = 19;
            }
            if (choice == 4) {
                position = 17;
            }
        } else if (position == 19) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 14;
            }
            if (choice == 2) {
                position = 24;
            }
            if (choice == 3) {
                position = 20;
            }
            if (choice == 4) {
                position = 18;
            }
        } else if (position == 2) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 7;
            }
            if (choice == 3) {
                position = 3;
            }
            if (choice == 4) {
                position = 1;
            }
        } else if (position == 3) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            System.out.println("South:2, East:3 or West:4");;
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 8;
            }
            if (choice == 3) {
                position = 4;
            }
            if (choice == 4) {
                position = 2;
            }
        } else if (position == 4) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 9;
            }
            if (choice == 3) {
                position = 5;
            }
            if (choice == 4) {
                position = 3;
            }
        } else if (position == 22) {
            System.out.println("North:1, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 17;
            }
            if (choice == 3) {
                position = 23;
            }
            if (choice == 4) {
                position = 21;
            }
        } else if (position == 23) {
            System.out.println("North:1, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 18;
            }
            if (choice == 3) {
                position = 24;
            }
            if (choice == 4) {
                position = 22;
            }
        } else if (position == 24) {
            System.out.println("North:1, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 19;
            }
            if (choice == 3) {
                position = 25;
            }
            if (choice == 4) {
                position = 23;
            }
        } else if (position == 6) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();

            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();
                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 1;
            }
            if (choice == 2) {
                position = 11;
            }
            if (choice == 3) {
                position = 7;
            }
        } else if (position == 11) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 6;
            }
            if (choice == 2) {
                position = 16;
            }
            if (choice == 3) {
                position = 12;
            }
        } else if (position == 16) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 11;
            }
            if (choice == 2) {
                position = 21;
            }
            if (choice == 3) {
                position = 17;
            }
        } else if (position == 10) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 5;
            }
            if (choice == 2) {
                position = 15;
            }
            if (choice == 4) {
                position = 9;
            }
        } else if (position == 15) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 10;
            }
            if (choice == 2) {
                position = 20;
            }
            if (choice == 4) {
                position = 14;
            }
        } else if (position == 20) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 15;
            }
            if (choice == 2) {
                position = 25;
            }
            if (choice == 4) {
                position = 19;
            }
        } else if (position == 1) {
            System.out.println("South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 6;
            }
            if (choice == 3) {
                position = 2;
            }
        } else if (position == 5) {
            System.out.println("South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 10;
            }
            if (choice == 4) {
                position = 4;
            }
        } else if (position == 21) {
            System.out.println("North:1 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 16;
            }
            if (choice == 3) {
                position = 22;
            }
        } else if (position == 25) {
            System.out.println("North:1 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 20;
            }
            if (choice == 4) {
                position = 24;
            }
        }
        visitedRoom();
    }  //KALLAR I SLUTET PÅ VISITEDROOM

//    public void choiceOfDirectionMapMedium() {  //kallar på visitedRoom
//        int choice;
//
//        System.out.println("From your current position you may choose from the following options");
//
//        if (position == 7) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 2;
//            }
//            if (choice == 2) {
//                position = 12;
//            }
//            if (choice == 3) {
//                position = 8;
//            }
//            if (choice == 4) {
//                position = 6;
//            }
//        } else if (position == 8) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 3;
//            }
//            if (choice == 2) {
//                position = 13;
//            }
//            if (choice == 3) {
//                position = 9;
//            }
//            if (choice == 4) {
//                position = 7;
//            }
//        } else if (position == 9) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 4;
//            }
//            if (choice == 2) {
//                position = 14;
//            }
//            if (choice == 3) {
//                position = 10;
//            }
//            if (choice == 4) {
//                position = 8;
//            }
//        } else if (position == 12) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 7;
//            }
//            if (choice == 2) {
//                position = 17;
//            }
//            if (choice == 3) {
//                position = 13;
//            }
//            if (choice == 4) {
//                position = 11;
//            }
//        } else if (position == 13) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 8;
//            }
//            if (choice == 2) {
//                position = 18;
//            }
//            if (choice == 3) {
//                position = 14;
//            }
//            if (choice == 4) {
//                position = 12;
//            }
//        } else if (position == 14) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 9;
//            }
//            if (choice == 2) {
//                position = 19;
//            }
//            if (choice == 3) {
//                position = 15;
//            }
//            if (choice == 4) {
//                position = 13;
//            }
//        } else if (position == 17) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 12;
//            }
//            if (choice == 2) {
//                position = 22;
//            }
//            if (choice == 3) {
//                position = 18;
//            }
//            if (choice == 4) {
//                position = 16;
//            }
//        } else if (position == 18) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 13;
//            }
//            if (choice == 2) {
//                position = 23;
//            }
//            if (choice == 3) {
//                position = 19;
//            }
//            if (choice == 4) {
//                position = 17;
//            }
//        } else if (position == 19) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 14;
//            }
//            if (choice == 2) {
//                position = 24;
//            }
//            if (choice == 3) {
//                position = 20;
//            }
//            if (choice == 4) {
//                position = 18;
//            }
//        } else if (position == 2) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 2) {
//                position = 7;
//            }
//            if (choice == 3) {
//                position = 3;
//            }
//            if (choice == 4) {
//                position = 1;
//            }
//        } else if (position == 3) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 2) {
//                position = 8;
//            }
//            if (choice == 3) {
//                position = 4;
//            }
//            if (choice == 4) {
//                position = 2;
//            }
//        } else if (position == 4) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 2) {
//                position = 9;
//            }
//            if (choice == 3) {
//                position = 5;
//            }
//            if (choice == 4) {
//                position = 3;
//            }
//        } else if (position == 22) {
//            System.out.println("North:1, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 1) {
//                position = 17;
//            }
//            if (choice == 3) {
//                position = 23;
//            }
//            if (choice == 4) {
//                position = 21;
//            }
//        } else if (position == 23) {
//            System.out.println("North:1, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 1) {
//                position = 18;
//            }
//            if (choice == 3) {
//                position = 24;
//            }
//            if (choice == 4) {
//                position = 22;
//            }
//        } else if (position == 24) {
//            System.out.println("North:1, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 1) {
//                position = 19;
//            }
//            if (choice == 3) {
//                position = 25;
//            }
//            if (choice == 4) {
//                position = 23;
//            }
//        } else if (position == 6) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 1) {
//                position = 1;
//            }
//            if (choice == 2) {
//                position = 11;
//            }
//            if (choice == 3) {
//                position = 7;
//            }
//        } else if (position == 11) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 1) {
//                position = 6;
//            }
//            if (choice == 2) {
//                position = 16;
//            }
//            if (choice == 3) {
//                position = 12;
//            }
//        } else if (position == 16) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 1) {
//                position = 11;
//            }
//            if (choice == 2) {
//                position = 21;
//            }
//            if (choice == 3) {
//                position = 17;
//            }
//        } else if (position == 10) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 1) {
//                position = 5;
//            }
//            if (choice == 2) {
//                position = 15;
//            }
//            if (choice == 4) {
//                position = 9;
//            }
//        } else if (position == 15) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 1) {
//                position = 10;
//            }
//            if (choice == 2) {
//                position = 20;
//            }
//            if (choice == 4) {
//                position = 14;
//            }
//        } else if (position == 20) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//
//            if (choice == 1) {
//                position = 15;
//            }
//            if (choice == 2) {
//                position = 25;
//            }
//            if (choice == 4) {
//                position = 19;
//            }
//        } else if (position == 1) {
//            System.out.println("South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 6;
//            }
//            if (choice == 3) {
//                position = 2;
//            }
//        } else if (position == 5) {
//            System.out.println("South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 10;
//            }
//            if (choice == 4) {
//                position = 4;
//            }
//        } else if (position == 21) {
//            System.out.println("North:1 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 16;
//            }
//            if (choice == 3) {
//                position = 22;
//            }
//        } else if (position == 25) {
//            System.out.println("North:1 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 20;
//            }
//            if (choice == 4) {
//                position = 24;
//            }
//        }
//
//        visitedRoom();
//    }  //KALLAR I SLUTET PÅ VISITEDROOM
    public void visitedRoomLarge() {
        //allRoomsDone();  denna funkar ej, 
        HeroMenu.randomMonster();
        randomTreasure();
        randomExit();
        for (int k = 0; k < mapLarge.length; k++) {
            for (int l = 0; l < mapLarge.length; l++) {

                if (mapLarge[k][l] == position) {
                    mapLarge[k][l] = 0;
                }
            }
        }

        int rows = 8;
        int columns = 8;
        int i, j;

        for (i = 0; i < rows; i++) {
            //bara snygga grejer för utskrift
            System.out.println("--------------------------------------");
            //den inre for-loopen kolumnerna
            for (j = 0; j < columns; j++) {
                System.out.print(mapLarge[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("------------------------------------------");
    } //KALLAR PÅ RANDOM (MONSTER, SKATTER OCH EXIT)

    public void choiceOfDirectionMapLarge() {
        //int choice;

        int choice = 0;
        boolean isGameOn = true;
        System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
        System.out.println("From your current position you may choose from the following options");

        if (position == 10) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 2;
            }
            if (choice == 2) {
                position = 18;
            }
            if (choice == 3) {
                position = 11;
            }
            if (choice == 4) {
                position = 9;
            }
        } else if (position == 11) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 3;
            }
            if (choice == 2) {
                position = 19;
            }
            if (choice == 3) {
                position = 12;
            }
            if (choice == 4) {
                position = 10;
            }
        } else if (position == 12) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 4;
            }
            if (choice == 2) {
                position = 20;
            }
            if (choice == 3) {
                position = 13;
            }
            if (choice == 4) {
                position = 11;
            }
        } else if (position == 13) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 5;
            }
            if (choice == 2) {
                position = 21;
            }
            if (choice == 3) {
                position = 14;
            }
            if (choice == 4) {
                position = 12;
            }
        } else if (position == 14) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 6;
            }
            if (choice == 2) {
                position = 22;
            }
            if (choice == 3) {
                position = 15;
            }
            if (choice == 4) {
                position = 13;
            }
        } else if (position == 15) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            System.out.println("North:1, South:2, East:3 or West:4");;
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 7;
            }
            if (choice == 2) {
                position = 23;
            }
            if (choice == 3) {
                position = 16;
            }
            if (choice == 4) {
                position = 14;
            }
        } else if (position == 18) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 10;
            }
            if (choice == 2) {
                position = 26;
            }
            if (choice == 3) {
                position = 19;
            }
            if (choice == 4) {
                position = 17;
            }
        } else if (position == 19) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 11;
            }
            if (choice == 2) {
                position = 27;
            }
            if (choice == 3) {
                position = 20;
            }
            if (choice == 4) {
                position = 18;
            }
        } else if (position == 20) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 12;
            }
            if (choice == 2) {
                position = 28;
            }
            if (choice == 3) {
                position = 21;
            }
            if (choice == 4) {
                position = 19;
            }
        } else if (position == 21) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 13;
            }
            if (choice == 2) {
                position = 29;
            }
            if (choice == 3) {
                position = 22;
            }
            if (choice == 4) {
                position = 20;
            }
        } else if (position == 22) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 14;
            }
            if (choice == 2) {
                position = 30;
            }
            if (choice == 3) {
                position = 23;
            }
            if (choice == 4) {
                position = 21;
            }
        } else if (position == 23) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 15;
            }
            if (choice == 2) {
                position = 31;
            }
            if (choice == 3) {
                position = 24;
            }
            if (choice == 4) {
                position = 22;
            }
        } else if (position == 26) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 18;
            }
            if (choice == 2) {
                position = 34;
            }
            if (choice == 3) {
                position = 27;
            }
            if (choice == 4) {
                position = 25;
            }
        } else if (position == 27) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 19;
            }
            if (choice == 2) {
                position = 35;
            }
            if (choice == 3) {
                position = 28;
            }
            if (choice == 4) {
                position = 26;
            }
        } else if (position == 28) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 20;
            }
            if (choice == 2) {
                position = 36;
            }
            if (choice == 3) {
                position = 29;
            }
            if (choice == 4) {
                position = 27;
            }
        } else if (position == 29) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 21;
            }
            if (choice == 2) {
                position = 37;
            }
            if (choice == 3) {
                position = 30;
            }
            if (choice == 4) {
                position = 28;
            }
        } else if (position == 30) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 22;
            }
            if (choice == 2) {
                position = 38;
            }
            if (choice == 3) {
                position = 31;
            }
            if (choice == 4) {
                position = 29;
            }
        } else if (position == 31) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 23;
            }
            if (choice == 2) {
                position = 39;
            }
            if (choice == 3) {
                position = 32;
            }
            if (choice == 4) {
                position = 30;
            }
        } else if (position == 34) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 26;
            }
            if (choice == 2) {
                position = 42;
            }
            if (choice == 3) {
                position = 35;
            }
            if (choice == 4) {
                position = 33;
            }
        } else if (position == 35) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 27;
            }
            if (choice == 2) {
                position = 43;
            }
            if (choice == 3) {
                position = 36;
            }
            if (choice == 4) {
                position = 34;
            }
        } else if (position == 36) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 28;
            }
            if (choice == 2) {
                position = 44;
            }
            if (choice == 3) {
                position = 37;
            }
            if (choice == 4) {
                position = 35;
            }
        } else if (position == 37) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 29;
            }
            if (choice == 2) {
                position = 45;
            }
            if (choice == 3) {
                position = 38;
            }
            if (choice == 4) {
                position = 36;
            }
        } else if (position == 38) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 30;
            }
            if (choice == 2) {
                position = 46;
            }
            if (choice == 3) {
                position = 39;
            }
            if (choice == 4) {
                position = 37;
            }
        } else if (position == 39) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 31;
            }
            if (choice == 2) {
                position = 47;
            }
            if (choice == 3) {
                position = 40;
            }
            if (choice == 4) {
                position = 38;
            }
        } else if (position == 42) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 34;
            }
            if (choice == 2) {
                position = 50;
            }
            if (choice == 3) {
                position = 43;
            }
            if (choice == 4) {
                position = 41;
            }
        } else if (position == 43) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 35;
            }
            if (choice == 2) {
                position = 51;
            }
            if (choice == 3) {
                position = 44;
            }
            if (choice == 4) {
                position = 42;
            }
        } else if (position == 44) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 36;
            }
            if (choice == 2) {
                position = 52;
            }
            if (choice == 3) {
                position = 45;
            }
            if (choice == 4) {
                position = 43;
            }
        } else if (position == 45) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 37;
            }
            if (choice == 2) {
                position = 53;
            }
            if (choice == 3) {
                position = 46;
            }
            if (choice == 4) {
                position = 44;
            }
        } else if (position == 46) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 38;
            }
            if (choice == 2) {
                position = 54;
            }
            if (choice == 3) {
                position = 47;
            }
            if (choice == 4) {
                position = 45;
            }
        } else if (position == 47) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 39;
            }
            if (choice == 2) {
                position = 55;
            }
            if (choice == 3) {
                position = 48;
            }
            if (choice == 4) {
                position = 46;
            }
        } else if (position == 50) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 42;
            }
            if (choice == 2) {
                position = 58;
            }
            if (choice == 3) {
                position = 51;
            }
            if (choice == 4) {
                position = 49;
            }
        } else if (position == 51) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 43;
            }
            if (choice == 2) {
                position = 59;
            }
            if (choice == 3) {
                position = 52;
            }
            if (choice == 4) {
                position = 50;
            }
        } else if (position == 52) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 44;
            }
            if (choice == 2) {
                position = 60;
            }
            if (choice == 3) {
                position = 53;
            }
            if (choice == 4) {
                position = 51;
            }
        } else if (position == 53) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 45;
            }
            if (choice == 2) {
                position = 61;
            }
            if (choice == 3) {
                position = 54;
            }
            if (choice == 4) {
                position = 52;
            }
        } else if (position == 54) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 46;
            }
            if (choice == 2) {
                position = 62;
            }
            if (choice == 3) {
                position = 55;
            }
            if (choice == 4) {
                position = 53;
            }
        } else if (position == 55) {
            System.out.println("North:1, South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 47;
            }
            if (choice == 2) {
                position = 63;
            }
            if (choice == 3) {
                position = 56;
            }
            if (choice == 4) {
                position = 54;
            }
        } else if (position == 2) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 10;
            }
            if (choice == 3) {
                position = 3;
            }
            if (choice == 4) {
                position = 1;
            }
        } else if (position == 3) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 11;
            }
            if (choice == 3) {
                position = 4;
            }
            if (choice == 4) {
                position = 2;
            }
        } else if (position == 4) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 12;
            }
            if (choice == 3) {
                position = 5;
            }
            if (choice == 4) {
                position = 3;
            }
        } else if (position == 5) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 13;
            }
            if (choice == 3) {
                position = 6;
            }
            if (choice == 4) {
                position = 4;
            }
        } else if (position == 6) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 14;
            }
            if (choice == 3) {
                position = 7;
            }
            if (choice == 4) {
                position = 5;
            }
        } else if (position == 7) {
            System.out.println("South:2, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 15;
            }
            if (choice == 3) {
                position = 8;
            }
            if (choice == 4) {
                position = 6;
            }
        } else if (position == 58) {
            System.out.println("North:1,East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 50;
            }
            if (choice == 3) {
                position = 59;
            }
            if (choice == 4) {
                position = 57;
            }
        } else if (position == 59) {
            System.out.println("North:1, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 51;
            }
            if (choice == 3) {
                position = 60;
            }
            if (choice == 4) {
                position = 58;
            }
        } else if (position == 60) {
            System.out.println("North:1, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 52;
            }
            if (choice == 3) {
                position = 61;
            }
            if (choice == 4) {
                position = 59;
            }
        } else if (position == 61) {
            System.out.println("North:1, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 53;
            }
            if (choice == 3) {
                position = 62;
            }
            if (choice == 4) {
                position = 60;
            }
        } else if (position == 62) {
            System.out.println("North:1, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 54;
            }
            if (choice == 3) {
                position = 63;
            }
            if (choice == 4) {
                position = 61;
            }
        } else if (position == 63) {
            System.out.println("North:1, East:3 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 55;
            }
            if (choice == 3) {
                position = 64;
            }
            if (choice == 4) {
                position = 62;
            }
        } else if (position == 9) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 1;
            }
            if (choice == 2) {
                position = 17;
            }
            if (choice == 3) {
                position = 10;
            }
        } else if (position == 17) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 9;
            }
            if (choice == 2) {
                position = 25;
            }
            if (choice == 3) {
                position = 18;
            }
        } else if (position == 25) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 17;
            }
            if (choice == 2) {
                position = 33;
            }
            if (choice == 3) {
                position = 26;
            }
        } else if (position == 33) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 25;
            }
            if (choice == 2) {
                position = 41;
            }
            if (choice == 3) {
                position = 34;
            }
        } else if (position == 41) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 33;
            }
            if (choice == 2) {
                position = 49;
            }
            if (choice == 3) {
                position = 42;
            }
        } else if (position == 49) {
            System.out.println("North:1, South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 41;
            }
            if (choice == 2) {
                position = 57;
            }
            if (choice == 3) {
                position = 50;
            }
        } else if (position == 16) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 8;
            }
            if (choice == 2) {
                position = 24;
            }
            if (choice == 4) {
                position = 15;
            }
        } else if (position == 24) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 16;
            }
            if (choice == 2) {
                position = 32;
            }
            if (choice == 4) {
                position = 23;
            }
        } else if (position == 32) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 24;
            }
            if (choice == 2) {
                position = 40;
            }
            if (choice == 4) {
                position = 31;
            }
        } else if (position == 40) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 32;
            }
            if (choice == 2) {
                position = 48;
            }
            if (choice == 4) {
                position = 39;
            }
        } else if (position == 48) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 40;
            }
            if (choice == 2) {
                position = 56;
            }
            if (choice == 4) {
                position = 47;
            }
        } else if (position == 56) {
            System.out.println("North:1, South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 48;
            }
            if (choice == 2) {
                position = 64;
            }
            if (choice == 4) {
                position = 55;
            }
        } else if (position == 1) {
            System.out.println("South:2 or East:3");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 9;
            }
            if (choice == 3) {
                position = 2;
            }
        } else if (position == 8) {
            System.out.println("South:2 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 2 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 2) {
                position = 16;
            }
            if (choice == 4) {
                position = 7;
            }
        } else if (position == 57) {
            System.out.println("North:1 or East:3 ");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 3) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 49;
            }
            if (choice == 3) {
                position = 58;
            }
        } else if (position == 64) {
            System.out.println("North:1 or West:4");
            System.out.println("Make your choice");
            choice = input.nextInt();
            input.nextLine();
            while (isGameOn) {
                System.out.println("make your choice");
                choice = input.nextInt();

                if (choice == 1 || choice == 4) {
                    isGameOn = false;
                } else {
                    System.out.println("Incorrect no,");
                }
            }
            if (choice == 1) {
                position = 56;
            }
            if (choice == 4) {
                position = 63;
            }
        }
        visitedRoom();
    } //KALLAR I SLUTET PÅ VISITEDROOM

//    public void choiceOfDirectionMapLarge() {
//        int choice;
//
//        System.out.println("From your current position you may choose from the following options");
//
//        if (position == 10) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 2;
//            }
//            if (choice == 2) {
//                position = 18;
//            }
//            if (choice == 3) {
//                position = 11;
//            }
//            if (choice == 4) {
//                position = 9;
//            }
//        } else if (position == 11) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 3;
//            }
//            if (choice == 2) {
//                position = 19;
//            }
//            if (choice == 3) {
//                position = 12;
//            }
//            if (choice == 4) {
//                position = 10;
//            }
//        } else if (position == 12) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 4;
//            }
//            if (choice == 2) {
//                position = 20;
//            }
//            if (choice == 3) {
//                position = 13;
//            }
//            if (choice == 4) {
//                position = 11;
//            }
//        } else if (position == 13) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 5;
//            }
//            if (choice == 2) {
//                position = 21;
//            }
//            if (choice == 3) {
//                position = 14;
//            }
//            if (choice == 4) {
//                position = 12;
//            }
//        } else if (position == 14) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 6;
//            }
//            if (choice == 2) {
//                position = 22;
//            }
//            if (choice == 3) {
//                position = 15;
//            }
//            if (choice == 4) {
//                position = 13;
//            }
//        } else if (position == 15) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 7;
//            }
//            if (choice == 2) {
//                position = 23;
//            }
//            if (choice == 3) {
//                position = 16;
//            }
//            if (choice == 4) {
//                position = 14;
//            }
//        } else if (position == 18) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 10;
//            }
//            if (choice == 2) {
//                position = 26;
//            }
//            if (choice == 3) {
//                position = 19;
//            }
//            if (choice == 4) {
//                position = 17;
//            }
//        } else if (position == 19) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 11;
//            }
//            if (choice == 2) {
//                position = 27;
//            }
//            if (choice == 3) {
//                position = 20;
//            }
//            if (choice == 4) {
//                position = 18;
//            }
//        } else if (position == 20) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 12;
//            }
//            if (choice == 2) {
//                position = 28;
//            }
//            if (choice == 3) {
//                position = 21;
//            }
//            if (choice == 4) {
//                position = 19;
//            }
//        } else if (position == 21) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 13;
//            }
//            if (choice == 2) {
//                position = 29;
//            }
//            if (choice == 3) {
//                position = 22;
//            }
//            if (choice == 4) {
//                position = 20;
//            }
//        } else if (position == 22) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 14;
//            }
//            if (choice == 2) {
//                position = 30;
//            }
//            if (choice == 3) {
//                position = 23;
//            }
//            if (choice == 4) {
//                position = 21;
//            }
//        } else if (position == 23) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 15;
//            }
//            if (choice == 2) {
//                position = 31;
//            }
//            if (choice == 3) {
//                position = 24;
//            }
//            if (choice == 4) {
//                position = 22;
//            }
//        } else if (position == 26) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 18;
//            }
//            if (choice == 2) {
//                position = 34;
//            }
//            if (choice == 3) {
//                position = 27;
//            }
//            if (choice == 4) {
//                position = 25;
//            }
//        } else if (position == 27) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 19;
//            }
//            if (choice == 2) {
//                position = 35;
//            }
//            if (choice == 3) {
//                position = 28;
//            }
//            if (choice == 4) {
//                position = 26;
//            }
//        } else if (position == 28) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 20;
//            }
//            if (choice == 2) {
//                position = 36;
//            }
//            if (choice == 3) {
//                position = 29;
//            }
//            if (choice == 4) {
//                position = 27;
//            }
//        } else if (position == 29) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 21;
//            }
//            if (choice == 2) {
//                position = 37;
//            }
//            if (choice == 3) {
//                position = 30;
//            }
//            if (choice == 4) {
//                position = 28;
//            }
//        } else if (position == 30) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 22;
//            }
//            if (choice == 2) {
//                position = 38;
//            }
//            if (choice == 3) {
//                position = 31;
//            }
//            if (choice == 4) {
//                position = 29;
//            }
//        } else if (position == 31) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 23;
//            }
//            if (choice == 2) {
//                position = 39;
//            }
//            if (choice == 3) {
//                position = 32;
//            }
//            if (choice == 4) {
//                position = 30;
//            }
//        } else if (position == 34) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 26;
//            }
//            if (choice == 2) {
//                position = 42;
//            }
//            if (choice == 3) {
//                position = 35;
//            }
//            if (choice == 4) {
//                position = 33;
//            }
//        } else if (position == 35) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 27;
//            }
//            if (choice == 2) {
//                position = 43;
//            }
//            if (choice == 3) {
//                position = 36;
//            }
//            if (choice == 4) {
//                position = 34;
//            }
//        } else if (position == 36) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 28;
//            }
//            if (choice == 2) {
//                position = 44;
//            }
//            if (choice == 3) {
//                position = 37;
//            }
//            if (choice == 4) {
//                position = 35;
//            }
//        } else if (position == 37) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 29;
//            }
//            if (choice == 2) {
//                position = 45;
//            }
//            if (choice == 3) {
//                position = 38;
//            }
//            if (choice == 4) {
//                position = 36;
//            }
//        } else if (position == 38) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 30;
//            }
//            if (choice == 2) {
//                position = 46;
//            }
//            if (choice == 3) {
//                position = 39;
//            }
//            if (choice == 4) {
//                position = 37;
//            }
//        } else if (position == 39) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 31;
//            }
//            if (choice == 2) {
//                position = 47;
//            }
//            if (choice == 3) {
//                position = 40;
//            }
//            if (choice == 4) {
//                position = 38;
//            }
//        } else if (position == 42) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 34;
//            }
//            if (choice == 2) {
//                position = 50;
//            }
//            if (choice == 3) {
//                position = 43;
//            }
//            if (choice == 4) {
//                position = 41;
//            }
//        } else if (position == 43) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 35;
//            }
//            if (choice == 2) {
//                position = 51;
//            }
//            if (choice == 3) {
//                position = 44;
//            }
//            if (choice == 4) {
//                position = 42;
//            }
//        } else if (position == 44) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 36;
//            }
//            if (choice == 2) {
//                position = 52;
//            }
//            if (choice == 3) {
//                position = 45;
//            }
//            if (choice == 4) {
//                position = 43;
//            }
//        } else if (position == 45) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 37;
//            }
//            if (choice == 2) {
//                position = 53;
//            }
//            if (choice == 3) {
//                position = 46;
//            }
//            if (choice == 4) {
//                position = 44;
//            }
//        } else if (position == 46) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 38;
//            }
//            if (choice == 2) {
//                position = 54;
//            }
//            if (choice == 3) {
//                position = 47;
//            }
//            if (choice == 4) {
//                position = 45;
//            }
//        } else if (position == 47) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 39;
//            }
//            if (choice == 2) {
//                position = 55;
//            }
//            if (choice == 3) {
//                position = 48;
//            }
//            if (choice == 4) {
//                position = 46;
//            }
//        } else if (position == 50) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 42;
//            }
//            if (choice == 2) {
//                position = 58;
//            }
//            if (choice == 3) {
//                position = 51;
//            }
//            if (choice == 4) {
//                position = 49;
//            }
//        } else if (position == 51) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 43;
//            }
//            if (choice == 2) {
//                position = 59;
//            }
//            if (choice == 3) {
//                position = 52;
//            }
//            if (choice == 4) {
//                position = 50;
//            }
//        } else if (position == 52) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 44;
//            }
//            if (choice == 2) {
//                position = 60;
//            }
//            if (choice == 3) {
//                position = 53;
//            }
//            if (choice == 4) {
//                position = 51;
//            }
//        } else if (position == 53) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 45;
//            }
//            if (choice == 2) {
//                position = 61;
//            }
//            if (choice == 3) {
//                position = 54;
//            }
//            if (choice == 4) {
//                position = 52;
//            }
//        } else if (position == 54) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 46;
//            }
//            if (choice == 2) {
//                position = 62;
//            }
//            if (choice == 3) {
//                position = 55;
//            }
//            if (choice == 4) {
//                position = 53;
//            }
//        } else if (position == 55) {
//            System.out.println("North:1, South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 47;
//            }
//            if (choice == 2) {
//                position = 63;
//            }
//            if (choice == 3) {
//                position = 56;
//            }
//            if (choice == 4) {
//                position = 54;
//            }
//        } else if (position == 2) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 10;
//            }
//            if (choice == 3) {
//                position = 3;
//            }
//            if (choice == 4) {
//                position = 1;
//            }
//        } else if (position == 3) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 11;
//            }
//            if (choice == 3) {
//                position = 4;
//            }
//            if (choice == 4) {
//                position = 2;
//            }
//        } else if (position == 4) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 12;
//            }
//            if (choice == 3) {
//                position = 5;
//            }
//            if (choice == 4) {
//                position = 3;
//            }
//        } else if (position == 5) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 13;
//            }
//            if (choice == 3) {
//                position = 6;
//            }
//            if (choice == 4) {
//                position = 4;
//            }
//        } else if (position == 6) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 14;
//            }
//            if (choice == 3) {
//                position = 7;
//            }
//            if (choice == 4) {
//                position = 5;
//            }
//        } else if (position == 7) {
//            System.out.println("South:2, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 15;
//            }
//            if (choice == 3) {
//                position = 8;
//            }
//            if (choice == 4) {
//                position = 6;
//            }
//        } else if (position == 58) {
//            System.out.println("North:1,East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 50;
//            }
//            if (choice == 3) {
//                position = 59;
//            }
//            if (choice == 4) {
//                position = 57;
//            }
//        } else if (position == 59) {
//            System.out.println("North:1, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 51;
//            }
//            if (choice == 3) {
//                position = 60;
//            }
//            if (choice == 4) {
//                position = 58;
//            }
//        } else if (position == 60) {
//            System.out.println("North:1, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 52;
//            }
//            if (choice == 3) {
//                position = 61;
//            }
//            if (choice == 4) {
//                position = 59;
//            }
//        } else if (position == 61) {
//            System.out.println("North:1, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 53;
//            }
//            if (choice == 3) {
//                position = 62;
//            }
//            if (choice == 4) {
//                position = 60;
//            }
//        } else if (position == 62) {
//            System.out.println("North:1, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 54;
//            }
//            if (choice == 3) {
//                position = 63;
//            }
//            if (choice == 4) {
//                position = 61;
//            }
//        } else if (position == 63) {
//            System.out.println("North:1, East:3 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 55;
//            }
//            if (choice == 3) {
//                position = 64;
//            }
//            if (choice == 4) {
//                position = 62;
//            }
//        } else if (position == 9) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 1;
//            }
//            if (choice == 2) {
//                position = 17;
//            }
//            if (choice == 3) {
//                position = 10;
//            }
//        } else if (position == 17) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 9;
//            }
//            if (choice == 2) {
//                position = 25;
//            }
//            if (choice == 3) {
//                position = 18;
//            }
//        } else if (position == 25) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 17;
//            }
//            if (choice == 2) {
//                position = 33;
//            }
//            if (choice == 3) {
//                position = 26;
//            }
//        } else if (position == 33) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 25;
//            }
//            if (choice == 2) {
//                position = 41;
//            }
//            if (choice == 3) {
//                position = 34;
//            }
//        } else if (position == 41) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 33;
//            }
//            if (choice == 2) {
//                position = 49;
//            }
//            if (choice == 3) {
//                position = 42;
//            }
//        } else if (position == 49) {
//            System.out.println("North:1, South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 41;
//            }
//            if (choice == 2) {
//                position = 57;
//            }
//            if (choice == 3) {
//                position = 50;
//            }
//        } else if (position == 16) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 8;
//            }
//            if (choice == 2) {
//                position = 24;
//            }
//            if (choice == 4) {
//                position = 15;
//            }
//        } else if (position == 24) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 16;
//            }
//            if (choice == 2) {
//                position = 32;
//            }
//            if (choice == 4) {
//                position = 23;
//            }
//        } else if (position == 32) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 24;
//            }
//            if (choice == 2) {
//                position = 40;
//            }
//            if (choice == 4) {
//                position = 31;
//            }
//        } else if (position == 40) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 32;
//            }
//            if (choice == 2) {
//                position = 48;
//            }
//            if (choice == 4) {
//                position = 39;
//            }
//        } else if (position == 48) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 40;
//            }
//            if (choice == 2) {
//                position = 56;
//            }
//            if (choice == 4) {
//                position = 47;
//            }
//        } else if (position == 56) {
//            System.out.println("North:1, South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 48;
//            }
//            if (choice == 2) {
//                position = 64;
//            }
//            if (choice == 4) {
//                position = 55;
//            }
//        } else if (position == 1) {
//            System.out.println("South:2 or East:3");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 9;
//            }
//            if (choice == 3) {
//                position = 2;
//            }
//        } else if (position == 8) {
//            System.out.println("South:2 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 2) {
//                position = 16;
//            }
//            if (choice == 4) {
//                position = 7;
//            }
//        } else if (position == 57) {
//            System.out.println("North:1 or East:3 ");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 49;
//            }
//            if (choice == 3) {
//                position = 58;
//            }
//        } else if (position == 64) {
//            System.out.println("North:1 or West:4");
//            System.out.println("Make your choice");
//            choice = input.nextInt();
//            input.nextLine();
//            if (choice == 1) {
//                position = 56;
//            }
//            if (choice == 4) {
//                position = 63;
//            }
//        }
//
//        visitedRoom();
//    } //KALLAR I SLUTET PÅ VISITEDROOM
//    public void randomMonster() {
//
//        Random random = new Random();
//        if (Math.random() * 100 < 20) {     //jättespindel 20, 
//            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
//            System.out.println("Watch out, theres a Giantspider ahead!");
//            Monsters gs1 = new GiantSpider(7, 10, 1, 3,"Giant Spider");
//            monsters.add(gs1);
//            //hittePaFight();//hittepåmetoder för test-körning
//        }
//        if (Math.random() * 100 < 15) {  //skelett 15  
//            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
//            System.out.println("Watch out, theres a Skeleton ahead!");
//            Monsters s1 = new Skeleton(4, 3, 2, 3,"Skeleton");
//            monsters.add(s1);
//            //hittePaFight();//hittepåmetoder för test-körning
//        }
//        if (Math.random() * 100 < 10) {   //orc 10
//            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
//            System.out.println("Watch out, theres an Orc ahead!");
//            Monsters o1 = new Orc(6, 4, 3, 4, "Orc");
//            monsters.add(o1);
//            //hittePaFight();//hittepåmetoder för test-körning
//        }
//        if (Math.random() * 100 < 5) {     //troll 5
//            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
//            System.out.println("Watch out, theres a Troll ahead!");
//            Monsters t1 = new Troll (02, 7, 4, 2, "Troll");
//            monsters.add(t1);
//            //hittePaFight();//hittepåmetoder för test-körning
//        }
//        
//        if(monsters.size()> 0){
//           // battle();
//            System.out.println("Battle begins");
//        } else{
//            System.out.println("No monsters");
//        }
//    }  //OBS KALLA PÅ MONSTER OCH FIGHTEN
    public void randomTreasure() {  //lägg in i fightdelen, om vinna så plocka 
        //ev.skatt, poäng ska läggas in
        //arrayTreasure.clear(); ska ta bort alla skatter så fort array finns
        Random random = new Random();
        if (Math.random() * 100 < 40) {     //lösa slantar 40, 
            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
            System.out.println("Congrats! You won a coin!");
        }
        if (Math.random() * 100 < 20) {  //pengapung 20   
            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
            System.out.println("Congrats! You won a purse with coins in it!");
        }
        if (Math.random() * 100 < 15) {   //gold jewelry 15
            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
            System.out.println("Congrats! You won gold jewelry!");
        }
        if (Math.random() * 100 < 10) {     //ädelsten 10
            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
            System.out.println("Congrats! You won a precious stone");
        }
        if (Math.random() * 100 < 5) {     //skattkista 5
            System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
            System.out.println("Congrats! You won a small treasure chest");
        }
    }

    public void randomExit() {  //OBS koppla till om monster el skatt dykt upp
        char choice;
        Random random = new Random();
        if (Math.random() * 100 < 1) {     //
            System.out.println("This is an exitroom,do you want to return to main "
                    + "menu please enter Y/N?");
            choice = input.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                MAINDungeonRun.homeInput(MAINDungeonRun.home());
            }
        }
    } //OBS LÄGG IN EXITMETOD TILL HUVUDMENYN

    public void allRoomsDone() {
        System.out.println("***************Nu ska jag kolla om alla rum är 0:ade");
        for (int k = 0; k < mapSmall.length; k++) {
            for (int l = 0; l < mapSmall.length; l++) {

                if (mapSmall[k][l] > 0) {
                    System.out.println("============Nä de e inte o;ade");
                } else {
                    System.out.println("*************Alla rum är nollade");
                }
            }
        }

    }  //funkar ej, ska kolla med hjälp

    //*******************************************************************************
}
