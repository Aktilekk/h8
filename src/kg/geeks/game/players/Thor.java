package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Thor extends Hero {


    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean thorStun = RPG_Game.random.nextBoolean();
        if (getHealth()>0 && thorStun==true){
            boss.setDamage(0);
            System.out.println("Thor stun Boss");

        }else {
            boss.getDamage();
        }


    }
}