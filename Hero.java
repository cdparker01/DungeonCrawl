/*
 * To change his license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DugeonCrawl;
import DungeonCrawl;

/**
 *
 * @author cdparker01
 */
public class Hero extends Being
{
    int strength = 10;
    public int health = 20;
    String name = "Hero";
    
    public int attack(Monster m)
    {
        m.health = m.health - this.strength;
        
        return m.health;
    }
    public int getHealth()
    {
        return this.health;
    }
    public void emtoHero()
    {
        //20
        System.out.println("      _,.");
        System.out.println("    ,` -.)");
        System.out.println("   ( _/-\\\\-._");
        System.out.println("  /,|`--._,-^|            ,");
        System.out.println("  \\_| |`-._/||          ,'|");
        System.out.println("    |  `-, / |         /  /");
        System.out.println("    |     || |        /  /");
        System.out.println("     `r-._||/   __   /  /");
        System.out.println(" __,-<_     )`-/  `./  /");
        System.out.println("'  \\   `---'   \\   /  /");
        System.out.println("    |           |./  /");
        System.out.println("    /           //  /");
        System.out.println("\\_/' \\         |/  /");
        System.out.println(" |    |   _,^-'/  /");
        System.out.println(" |    , ``  (\\/  /_");
        System.out.println("  \\,.->._    \\X-=/^");
        System.out.println("  (  /   `-._//^`");
        System.out.println("   `Y-.____(__}");
        System.out.println("    |     {__)");
        System.out.println("          ()");
        
    }
}


