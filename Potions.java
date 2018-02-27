/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DugeonCrawlStart;

import static DugeonCrawlStart.Dungeon.dungeon;
import java.util.Scanner;

/**
 *
 * @author chandlerparker
 */
public class Potions 
{
    public int restore = 10;
   
    public void encounterPotion(Hero h, Dungeon d)
    {
        System.out.println("The hero finds a potion: ");
        this.potionEmoto();
        System.out.println("Will he take it? 1 for yes 2 for no");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input == 1)
        {
            System.out.println("The hero uses the potion and heals " + this.restore + " points");
            h.health = h.health + this.restore;
            System.out.println("The heros health is now: " + h.getHealth());
            dungeon[d.heroSpot + 1] = null;
        }
        else
        {
            dungeon[d.heroSpot + 1] = null;
            System.out.println("The hero moves on");
        }     
        
    }
    public void potionEmoto()
    {
        System.out.println("      _____");
        System.out.println("     `.___,'");
        System.out.println("      (___)");
        System.out.println("      <   >");
        System.out.println("       ) (");
        System.out.println("      /`-.\\");
        System.out.println("     /     \\");
        System.out.println("    / _    _\\");
        System.out.println("   :,' `-.' `:");
        System.out.println("   |         |");
        System.out.println("   :         ;");
        System.out.println("    \\       /");
        System.out.println("     `.___.'");
    }
}
