package dungeonrun;

public class NewClass {

    arraylist<creatures> attackarOrder
    level 
    enum fight_state player_escape_success
    player_died monsters_died
    monsters_empty continue_attack

    public sortAttackars() {
        player.setinitiative()

        Loop monster
        monster.setInitiva()
        end loop


        Attackars.add(heroe)
        attackars.add(monster)
        attackrs.sortByInit() // sort high to low attackars

    }

    public sortAttackars() {
        player.setinitiative()

        Loop monster
        monster.setInitiva()
        end loop


        Attackars.add(heroe)
        attackars.add(monster)
        attackrs.sortByInit() // sort high to low attackars

    }

    public level battle() {

        if (monster == = 0) {
            // print no monster, pick up bling bling stuff and continue to next room
            return level.monsters_empty; // will return no monsters
        }

        arraylist<creatures> attackars = sortAttackOrder();

        level current_fight_state = level.continue_attack;

        while (state_finish.fight == current_fight_state) {

            for (attacker  : attackers) {

                // attack monsters or player
                if (attackar 
                    is 
                
                    hereo) {
        current_fight_state = player_attack_or_fly();
                }else (attackar is  moster
                
                    ) {
        current_fight_state = monster_attack()
                }
                if (isPlayerDead() == = true) {
                    // player dog ändra status till spelare dog
                    current_fight_state = level.player_died;
                }

                if (isAllMonstersDead() == = true) {
                    // monsters dog ändra status till spelare dog
                    current_fight_state = level.monsters_died
                }

                if (fight_state.hereo_escape_success == current_fight_state) {
                    // print Heroe successfully escape.. should move back to previous room
                    break;
                }

                if (fight_state.player_died == = current_fight_state) {
                    // print hereo died and adventure is over
                    break;
                }

                if (fight_state.monster_all_died == current_fight_state) {
                    // print killed all monsters and continue to next room
                    break;
                }
            }
        }
        v
        return current_fight_state; // will return hereo_escape_success or hereo_died or monster_all_died
    }

    public level player_attack_or_fly() {
        // Välj attack eller fly
        // printa text val
        int choice = fightOrFly();

        if (choice == 1) // attack
        // Attackerar player ett monster eller alla monster?
        {
            for (monster : monsters) {
                heroAttack(player.getAttack(), monster.getAgility(), monster.getName());

                int pAttack = heroAttack(player.getAttack(), monster.getAgility(), monster.getName());
                if (pAttack == 1) {
                    monster.setHealth(monster.getHealth() - 1);
                }
            }
        }

        // forsätt attackera
        return level.continue_attack;
    }

    else if (flee(player.getAgiltiy) 
        == 1) {  // player försöka fly
    return level.player_escape_success; // player lyckades fly
    }

    
        else {
    return level.continue_attack; // player stannar kvar i rummet och forsätter attackera
    }

}
public monster_attack() {
  // monster attackerar player
  int mAttack = monsterAttack(monster.getAttack(), player.getAgility(), monster.getName());
  if (mAttack == 1) {
      player.setHealth(player.getHealth() - 1);
  }

  // forsätt attackera
  return level.continue_attack;
}
    
    
}
