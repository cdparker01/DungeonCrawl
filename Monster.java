/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DugeonCrawl;
import DungeonCrawl.Test;
import DungeonCrawl.Monster;
import DungeonCrawl.Hero;

import static DugeonCrawlStart.Dungeon.dungeon;
import java.util.Scanner;

/**
 *
 * @author cdparker01
 */
public class Monster extends Being
{
    private int strength = 10;
    public int health = 10;
    String name = "Monster 1";
    
    public void monsterEncounter(Hero h, Dungeon d)
    {
        System.out.println("\nThe Hero encounters a Monster");
        //Monster m = (Monster)dungeon[d.heroSpot +1];
        this.monsterEmoto();
        System.out.println("What do you do? 1 for Attack, 2 for deffend");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input == 1 )
        {
            h.attack(this);
            
            if(this.health <= 0)
            {
                System.out.println("\nThe monster was defeated and the hero moves forward");
                System.out.println("The heros health is now : " + h.getHealth());
                dungeon[++d.heroSpot] = h;
                dungeon[d.heroSpot - 1] = null;
            } 
        }
        else if(input == 2)
        {
            System.out.println("The monster lives and attacks you, the defense fails. Attack again");
            h.health = h.health - this.strength;
            System.out.println("Hero health is now: " + h.getHealth());
            
        }
        
        /*h.health = h.health - this.strength;
        if(this.health <= 0)
        {
            System.out.println("\nThe monster was defeated but the hero was injured by 10 points");
            System.out.println("The heros health is now : " + h.getHealth());
            dungeon[++d.heroSpot] = h;
            dungeon[d.heroSpot - 1] = null;
        }*/
    }
    public void monsterEmoto()
    {
        //37
        System.out.println("                              _.--\"\"-._");
        System.out.println("  .                         .\"         \".");
        System.out.println(" / \\    ,^.         /(     Y             |      )\\");
        System.out.println("/   `---. |--'\\    (  \\__..'--   -   -- -'\"\"-.-'  )");
        System.out.println("|        :|    `>   '.     l_..-------.._l      .'");
        System.out.println("|      __l;__ .'      \"-.__.||_.-'v'-._||`\"----\"");
        System.out.println(" \\  .-' | |  `              l._       _.'");
        System.out.println("  \\/    | |                   l`^^'^^'j");
        System.out.println("        | |                _   \\_____/     _");
        System.out.println("        j |               l `--__)-'(__.--' |");
        System.out.println("        | |               | /`---``-----'\"1 |  ,-----.");
        System.out.println("        | |               )/  `--' '---'   \\'-'  ___  `-.");
        System.out.println("        | |              //  `-'  '`----'  /  ,-'   I`.  \\");
        System.out.println("      _ L |_            //  `-.-.'`-----' /  /  |   |  `. \\");
        System.out.println("     '._' / \\         _/(   `/   )- ---' ;  /__.J   L.__.\\ :");
        System.out.println("      `._;/7(-.......'  /        ) (     |  |            | |");
        System.out.println("      `._;l _'--------_/        )-'/     :  |___.    _._./ ;");
        System.out.println("        | |                 .__ )-'\\  __  \\  \\  I   1   / /");
        System.out.println("        `-'                /   `-\\-(-'   \\ \\  `.|   | ,' /");
        System.out.println("                           \\__  `-'    __/  `-. `---'',-'");
        System.out.println("                              )-._.-- (        `-----'");
        System.out.println("                             )(  l\\ o ('..-.");
        System.out.println("                       _..--' _'-' '--'.-. |");
        System.out.println("                __,,-'' _,,-''            \\ \\");
        System.out.println("               f'. _,,-'                   \\ \\");
        System.out.println("              ()--  |                       \\ \\");
        System.out.println("                \\.  |                       /  \\");
        System.out.println("                  \\ \\                      |._  |");
        System.out.println("                   \\ \\                     |  ()|");
        System.out.println("                    \\ \\                     \\  /");
        System.out.println("                     ) `-.                   | |");
        System.out.println("                    // .__)                  | |");
        System.out.println("                 _.//7'                      | |");
        System.out.println("               '---'                         j_| `");
        System.out.println("                                            (| |");
        System.out.println("                                             |  \\");
        System.out.println("                                             |lllj");
        System.out.println("                                             |||||");
        
    }
    /*public int getAttacked(Hero h)
    {
        return health = this.health - h.strength;
    }*/
}
