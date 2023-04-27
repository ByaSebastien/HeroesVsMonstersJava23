package bstorm;

import bstorm.models.characters.Entity;
import bstorm.models.characters.heroes.Hero;
import bstorm.models.characters.heroes.Warrior;
import bstorm.models.characters.monsters.Dragon;
import bstorm.models.characters.monsters.Monster;
import bstorm.models.properties.Inventory;
import bstorm.models.properties.ItemType;
import bstorm.models.properties.Stats;

public class Main {
    public static void main(String[] args) {

        Hero h = new Warrior("Rocky");
        Monster m = new Dragon();

        m.addDieEventSubscriber(monstre -> h.loot(monstre));
//        m.addDieEventSubscriber(h::loot);

        while(h.isAlive() && m.isAlive()){

            h.hit(m);

            if(m.isAlive())
                m.hit(h);

            System.out.println("Hero : " + h.getCurrentHp() + "\nMonstre : " + m.getCurrentHp() );

            Inventory inv = new Inventory();
            Integer a = inv.getProperty(ItemType.gold);
            Stats stats = new Stats();
        }
    }
}