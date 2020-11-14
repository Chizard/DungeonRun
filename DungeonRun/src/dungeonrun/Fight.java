package dungeonrun;

import java.util.ArrayList;
import java.util.Collections;

public class Fight {

    static ArrayList<Creatures> attackOrder = new ArrayList<>();
    static ArrayList<Creatures> attackers = new ArrayList<>();

    enum FightState {
        player_escape_success,
        player_died,
        monsters_died,
        monsters_empty,
        continue_attack,
        monster_died,
    }

    public static void sortAttackers() {
        attackers.clear();
        int playerInit = HeroMenu.player.getInitiative();
        int initSum = HeroMenu.rollDice(playerInit);
        HeroMenu.player.setTotalInitiative(initSum);
        attackers.add(HeroMenu.player);

        for (Monsters monster : HeroMenu.monsters) {
            int monsterInit = monster.getInitiative();
            int mInitSum = HeroMenu.rollDice(monsterInit);
            monster.setTotalInitiative(mInitSum);
            attackers.add(monster);
        }

        Collections.sort(attackers);

        System.out.println(attackers);
    }

    public static void battle() {

        if (HeroMenu.monsters.isEmpty()) {
            // print no monster, pick up bling bling stuff and continue to next room
            FightState state = FightState.monsters_empty; // will return no monsters
        }
    }

}
