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
public class TrappedTreasure extends Being 
{
    public int health = 5;
    public int attack = 50;
    
    public void encounterChest(Hero h, Dungeon d)
    {
        System.out.println("\nHero encounters a treasure chest:");
        this.treasureEmoto();
        System.out.println("The chest asks you to choose a number 1 - 3");
        
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            if(input == 1)
            {
                System.out.println("Hero is teleported to the begining of the dungeon");
                dungeon[d.heroSpot + 1] = null;
                dungeon[d.heroSpot] = null;
                dungeon[d.heroSpot = 0] = h;
            }
            else if(input == 2)
            {
                System.out.println("Hero was consumed by the Treasure chest");
                h.health = 0;
            }
            else if(input == 3)
            {
                System.out.println("The hero is teleported to the begining and a monster spawned in every room. Fight your way out...");
                dungeon[d.heroSpot +1] = null;
                dungeon[d.heroSpot] = null;
                dungeon[d.heroSpot = 0] = h;
                Monster m = new Monster();
                dungeon[1] = m;
                dungeon[2] = m;
                dungeon[3] = m;
                dungeon[4] = m;
                dungeon[5] = m;
                dungeon[6] = m;
                dungeon[7] = m;
                dungeon[8] = m;
                dungeon[9] = m;
            }
    }
    public void treasureEmoto()
    {
        System.out.println("  		    ____...------------...____");
        System.out.println("               _.-\"` /o/__ ____ __ __  __ \\o\\_`\"-._");
        System.out.println("             .'     / /                    \\ \\     '.");
        System.out.println("             |=====/o/======================\\o\\=====|");
        System.out.println("             |____/_/________..____..________\\_\\____|");
        System.out.println("             /   _/ \\_     <_o#\\__/#o_>     _/ \\_   \\");
        System.out.println("             \\_________\\####/_________/");
        System.out.println("              |===\\!/========================\\!/===|");
        System.out.println("              |   |=|          .---.         |=|   |");
        System.out.println("              |===|o|=========/     \\========|o|===|");
        System.out.println("              |   | |         \\() ()/        | |   |");
        System.out.println("              |===|o|======{'-.) A (.-'}=====|o|===|");
        System.out.println("              | __/ \\__     '-.\\uuu/.-'    __/ \\__ |");
        System.out.println("              |==== .'.'^'.'.====|");
        System.out.println("              |  _\\o/   __  {.' __  '.} _   _\\o/  _|");
        System.out.println("              `\"\"\"\"-\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"-\"\"\"\"`");
    }
}
