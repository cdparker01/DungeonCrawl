/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DugeonCrawl;
import DungeonCrawl.Monster;
import DungeonCrawl.Hero;
import DungeonCrawl.TrappedTreasure;
import DungeonCrawl.Potions;
import DungeonCrawl.Dragon;



import java.util.Scanner;

/**
 *
 * @author cdparker01
 */
public class Test 
{
    public static Object[] dungeon = new Object[10];

   
    public static void main(String[] args)
    {
        Dragon dra = new Dragon();
        Potions p = new Potions();
        Monster m = new Monster();
        Dungeon d = new Dungeon();
        Hero h = new Hero();
        TrappedTreasure t = new TrappedTreasure();
        d.createDungeon(m,h,t,p,dra);
        
        

        while(d.heroSpot != dungeon.length - 1 && h.health > 0)
        {   
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            String opp = scan.nextLine();
            
            if(input == 1)
            { 
                System.out.println("\nHero moves Forward");
                d.moveHero(input,t,h,p,dra,m);
                
            }
            else
            {
                System.out.println("Error wrong key entered");
            }
            
            System.out.println("\nEnter 1 to move Forward:");
        }
        
        if(h.health > 0)
        {
            System.out.println("\nYOU WIN! The Hero finished the dungeon");
            h.emtoHero();
        }
        else
        {
            System.out.println("\nGAME OVER: The Hero was killed");
            Test.end();
        }
        
    }
    public static void end()
    {
        //25
        System.out.println("                           ,--.");
        System.out.println("                          {    }");
        System.out.println("                          K,   }");
        System.out.println("                         /  `Y`");
        System.out.println("                    _   /   /");    
        System.out.println("                   {_'-K.__/");
        System.out.println("                     `/-.__L._");
        System.out.println("                     /  ' /`\\_}");
        System.out.println("                    /  ' /     ");
        System.out.println("            ____   /  ' /");
        System.out.println("     ,-'~~~~    ~~/  ' /_");
        System.out.println("   ,'             ``~~~%%',");
        System.out.println("  (                     %  Y");
        System.out.println(" {                      %% I");
        System.out.println("{      -                 %  `.");
        System.out.println("|       ',                %  )");
        System.out.println("|        |   ,..__      __. Y");
        System.out.println("|    .,_./  Y ' / ^Y   J   )|");
        System.out.println("\\           |' /   |   |   ||");
        System.out.println(" \\          L_/    . _ (_,.'(");
        System.out.println("  \\,   ,      ^^\"\"' / |      )");
        System.out.println("    \\_  \\          /,L]     /");
        System.out.println("      '-_`-,       ` `   ./`");
        System.out.println("         `-(_            )");
        System.out.println("             ^^\\..___,.--`");
    }
}
