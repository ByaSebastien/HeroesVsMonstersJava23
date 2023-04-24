package bstorm;

import bstorm.models.characters.Entity;
import bstorm.models.characters.heroes.Hero;
import bstorm.models.characters.heroes.Warrior;
import bstorm.models.characters.monsters.Dragon;
import bstorm.models.characters.monsters.Monster;

public class Main {
    public static void main(String[] args) {

        Hero h = new Warrior("Rocky");
        Monster m = new Dragon();

        while(h.isAlive() && m.isAlive()){

            h.hit(m);

            if(m.isAlive())
                m.hit(h);

            System.out.println("Hero : " + h.getCurrentHp() + "\nMonstre : " + m.getCurrentHp() );
        }


    }
}