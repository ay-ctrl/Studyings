/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advanturegame;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public abstract class BattleLoc extends Location{
    
    protected Obstacle obstacle;
    protected String locItem;
    public BattleLoc(Player player, String name,Obstacle obstacle,String locItem) {
        super(player);
        this.obstacle=obstacle;
        this.name=name;
        this.locItem=locItem;
    }
    

    public boolean getLocation()
    {
        int obsCount=obstacle.count();
        System.out.println("You are in "+this.getName());
        System.out.println("Watch out, there can be "+obsCount+ " "+obstacle.getName()+"s around");
        System.out.print("(F)Fight or (E)escape: ");
        String selCase=input.nextLine();
        if(selCase.toUpperCase().equals("F"))
        {
            if(combat(obsCount))
            {
                System.out.println("You killed all enemies in "+this.getName());
                if(this.locItem.equals("food") && player.getInv().isFood()==false)
                {
                    System.out.println("You recieved food");
                    player.getInv().setFood(true);
                }
                else if(this.locItem.equals("water") && player.getInv().isWater()==false)
                {
                    System.out.println("You recieved water");
                    player.getInv().setWater(true);
                }
                else if(this.locItem.equals("firewood") && player.getInv().isFirewood()==false)
                {
                    System.out.println("You recieved firewood");
                    player.getInv().setFirewood(true);
                }
                return true;
            }
            else if(player.getHealth()<=0)
            {
                return false;
            }
        }
        else if(selCase.equals("E"))
        {
            System.out.println("You escaped");
        }
        return true;
    }
    
    public boolean combat(int obsCount)
    {       
        playerStats();
        enemyStats();
        int defObsHealth=obstacle.getHealth();
        for(int i=0;i<obsCount;i++)
        {
            boolean escaped=false;
            System.out.println("**************************");
            System.out.println("Watch out "+obstacle.getName()+" is coming to you!");
           while(player.getHealth()>0 && obstacle.getHealth()>0)
           {
               System.out.print("(F)Fight or (E)Escape: ");
               String selCase=input.nextLine();
               if(selCase.toUpperCase().equals("F"))
               {
                   System.out.println("You hit the "+obstacle.getName()+" ");
                   obstacle.setHealth(obstacle.getHealth()-player.getTotalDamage());
                   printAfterHit();
                   if(obstacle.getHealth()>0)
                   {
                        System.out.println(obstacle.getName()+ " hit you!");
                        player.setHealth(player.getHealth()-(obstacle.getDamage()-player.getInv().getaPower()));
                         printAfterHit();
                   }
               }else{
                   System.out.println("You escaped");
                   escaped=true;
                   break;
               }
           }
           if(escaped)
           {
               return false;
           }
           
               if(player.getHealth()>0 && obstacle.getHealth()<=0)
           {
               System.out.println("You killed the enemy!");
               player.setMoney(player.getMoney()+obstacle.getAward());
               System.out.println("Updated money: "+player.getMoney());
               obstacle.setHealth(defObsHealth);
           }
           else
           {
               System.out.println("Enemy killed you, you are died");
               return false;
           }
        }
        
        return true; 
    }

    private void playerStats() {
        System.out.println("Player stats: ");
        System.out.println("Health: "+ player.getHealth());
        System.out.println("Damage: "+player.getTotalDamage());
        System.out.println("Money: "+player.getMoney());
        if(player.getInv().getWeapon()!=null)
        {
            System.out.println("Weapon name: "+player.getInv().getWeapon());
        }
        if(player.getInv().getArmor()!=null)
        {
            System.out.println("Aromor name: "+player.getInv().getArmor());
        }
        
        
    }

    private void enemyStats() {
        System.out.println("\n"+obstacle.getName()+" stats: ");
        System.out.println("Health: "+ obstacle.getHealth());
        System.out.println("Damage: "+obstacle.getDamage());
        System.out.println("Money: "+obstacle.getAward());
        
    }
    
    private void printAfterHit()
    {
        System.out.println("Player health: "+player.getHealth());
        if(obstacle.getHealth()<0)
        {
            obstacle.setHealth(0);
        }
        System.out.println(obstacle.getName()+" health: "+obstacle.getHealth()+"\n");
    }
    
}
