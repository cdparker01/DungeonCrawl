/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DugeonCrawl-Project;

import java.util.Scanner;


/**
 *
 * @author cdparker01
 */
public class Dungeon
{
   
    public static Object[] dungeon = new Object[10];
    public int heroSpot = 0;
    public static Hero h = new Hero();
    TrappedTreasure t = new TrappedTreasure();
    Dragon d = new Dragon();
    Potions p = new Potions();
    Monster m = new Monster();
    // creates dungeon
    public void createDungeon(Monster m)
    {
       System.out.println("\t\t\t   DUNGEON CRAWLER VERSION 1");
       Dungeon.titleEmoto();
       System.out.println("\t\tSelect your difficulty: 1 = easy, 2 = medium, 3 = hard:");
       dungeon[0] = h;
       this.selectDifficulty();
    }
    public void moveHero(int x)
    {   
        if(dungeon[heroSpot + 1] == null)
        {
            System.out.println("\nThe Hero opens the door to the next room and there is nothing there");
            dungeon[++heroSpot] = h;
            dungeon[heroSpot - 1] = null;
        }
        //trapped treasure feature
        else if(dungeon[heroSpot + 1] == t)
        {  
            t.encounterChest(h, this);
        }
        //Potion found
        else if(dungeon[heroSpot + 1] == p)
        {
            p.encounterPotion(h, this);
        }
        //Dragon found and fought
        else if(dungeon[heroSpot + 1] == d)
        {
            System.out.println("The hero encounters a dragon");
            d.emoticonDragon();
            System.out.println("");
            d.breathFireAttack(h,this);
        }
        // monster found and fought
        else
        {    
            m.monsterEncounter(h, this);
            
        }
        // print out
        for(Object y: dungeon)
        {
            if(y == null || y == p)
            {
                System.out.print("_");
            }
            else if(y == h)
            {
                System.out.print("H");
            }
            //Working on Trapped Treasure feature
            else if (y == t)
            {
                System.out.print("T");
            }
            //in progress
            else if(y == d)
            {
                System.out.print("D");
            }

            else
            {
                System.out.print("M");
            }  
        }   
    }
    public void selectDifficulty()
    {
       Scanner scan = new Scanner(System.in);
       
       int input = scan.nextInt();
       
       
       if(input == 1)
       {
           System.out.println("The easy difficulty dungeon was created: ");
           System.out.println("Press 1 to Start:");
           dungeon[5] = m;
       }
       else if(input == 2)
       {
           System.out.println("The medium difficulty dungeon was created: ");
           System.out.println("Press 1 to Start:");
           dungeon[9] = m;
           dungeon[5] = m;
           dungeon[3] = t;
           dungeon[7] = p;
       }
       else if(input == 3)
       {
           System.out.println("The hard difficulty dungeon was created: ");
           System.out.println("Press 1 to Start:");
           dungeon[8] = d;
           dungeon[5] = p;
           dungeon[3] = t;
           dungeon[6] = t;
           dungeon[7] = m;
       }
    }
    public static void titleEmoto()
    {
        System.out.println("                                      /|");
        System.out.println("                                     |\\|");
        System.out.println("                                     |||");
        System.out.println("                                     |||");
        System.out.println("                                     |||");
        System.out.println("                                     |||");
        System.out.println("                                     |||");
        System.out.println("                                     |||");
        System.out.println("                                  ~-[{o}]-~");
        System.out.println("                                     |/|");
        System.out.println("                                     |/|");
        System.out.println("             ///~`     |\\\\_          `0'         =\\\\\\\\         . .");
        System.out.println("            ,  |='  ,))\\_| ~-_                    _)  \\      _/_/|");
        System.out.println("           / ,' ,;((((((    ~ \\                  `~~~\\-~-_ /~ (_/\\");
        System.out.println("         /' -~/~)))))))'\\_   _/'                      \\_  /'  D   |");
        System.out.println("        (       (((((( ~-/ ~-/                          ~-;  /    \\--_");
        System.out.println("         ~~--|   ))''    ')  `                            `~~\\_    \\   )");
        System.out.println("             :        (_  ~\\           ,                    /~~-     ./");
        System.out.println("              \\        \\_   )--__  /(_/)                   |    )    )|");
        System.out.println("    ___       |_     \\__/~-__    ~~   ,'      /,_;,   __--(   _/      |");
        System.out.println("  //~~\\`\\    /' ~~~----|     ~~~~~~~~'        \\-  ((~~    __-~        |");
        System.out.println("((()   `\\`\\_(_     _-~~-\\                      ``~~ ~~~~~~   \\_      /");
        System.out.println(" )))     ~----'   /      \\                                   )       )");
        System.out.println("  (         ;`~--'        :                                _-    ,;;(");
        System.out.println("            |    `\\       |                             _-~    ,;;;;)");
        System.out.println("            |    /'`\\     ;                          _-~          _/");
        System.out.println("           /~   /    |    )                         /;;;''  ,;;:-~");
        System.out.println("          |    /     / | /                         |;;'   ,''");
        System.out.println("          /   /     |  \\\\|                         |   ,;(");
        System.out.println("        _/  /'       \\  \\_)                   .---__\\_    \\,--._______");
        System.out.println("       ( )|'         (~-_|                   (;;'  ;;;~~~/' `;;|  `;;;\\");
        System.out.println("        ) `\\_         |-_;;--__               ~~~----__/'    /'_______/");
        System.out.println("        `----'       (   `~--_ ~~~;;------------~~~~~ ;;;'_/'");
        System.out.println("                     `~~~~~~~~'~~~-----....___;;;____---~~");
        
    }
    
}

