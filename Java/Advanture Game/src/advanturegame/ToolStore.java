/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advanturegame;

/**
 *
 * @author ASUS
 */
public class ToolStore extends NormalLoc {
    
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }
    
    public boolean getLocation()
    {
        System.out.println("Money: "+player.getMoney());
        System.out.println("1. Weapons");
        System.out.println("2. Armors");
        System.out.println("3.Exit");
        System.out.print("Your selection: ");
        int selTool=input.nextInt();
        int itemID;
        switch(selTool)
        {
            case 1:
                itemID=weaponMenu();
                buyWeapon(itemID);
                break;
            case 2:
                itemID=armorMenu();
                buyArmor(itemID);
                break;
            case 3:
                break;
            default:
        }
        return true;   
    }
    public int weaponMenu()
    {
        System.out.println("1. Pistola < Price: 25, Damage: 2>");
        System.out.println("2. Sword < Price: 35, Damage: 3>");
        System.out.println("3. Shotgun < Price: 45, Damage: 7>");
        System.out.println("4.Exit"); 
        System.out.print("Select a weapon: "); 
        int selArmorID=input.nextInt();
        return selArmorID;
        
    }
    
     public int armorMenu()
    {
        System.out.println("1. Light < Price: 15, Strength: 1>");
        System.out.println("2. Medium < Price: 25, Strength: 3>");
        System.out.println("3. Heavy < Price: 40, Strength: 5>");
        System.out.println("4.Exit");
        System.out.print("Select an armor: ");
        int selWeaponID=input.nextInt();
        return selWeaponID;
        
    }
    
    public void buyArmor(int itemID)
    {
        int strength=0,price=0;
        String aName=null;
            switch(itemID)
            {
                case 1:
                    strength=1;
                    price=15;
                    aName="Light";
                    break;
                case 2:
                    strength=3;
                    price=25;
                    aName="Medium";
                    break;
                case 3:
                    strength=5;
                    price=40;
                    aName="Heavy";
                    break;
                case 4:
                    System.out.print("Exiting...");
                    break;
                default:
                     System.out.println("Invalid operation!");
                     break;
            }
            
            if(price>0)
            {
                if(player.getMoney()>=price)
                {
                    player.getInv().setaPower(strength);
                    player.getInv().setArmour(aName);
                    player.setMoney(player.getMoney()-price);
                    System.out.println(aName+" is bought, armor strength is "+player.getInv().getaPower()+" and balance is "+player.getMoney());
            }
                else
                {
                    System.out.println("Insufficient Balance!");
                }
            }
    }
    
    public void buyWeapon(int itemID)
    {
        int damage=0,price=0;
        String wName=null;
            switch(itemID)
            {
                case 1:
                    damage=2;
                    price=25;
                    wName="Pistola";
                    break;
                case 2:
                    damage=3;
                    price=35;
                    wName="Sword";
                    break;
                case 3:
                    damage=7;
                    price=45;
                    wName="Shotgun";
                    break;
                case 4:
                    System.out.print("Exiting...");
                    break;
                default:
                     System.out.println("Invalid operattion!");
                     break;
            }
            
            if(price>0)
            {
                if(player.getMoney()>=price)
                {
                    player.getInv().setwDamage(damage);
                    player.getInv().setWeapon(wName);
                    player.setMoney(player.getMoney()-price);
                    System.out.println(wName+" is bought, previous damage: "+player.getDamage()+ ", new damage: "+ 
                            player.getTotalDamage());
            }
                else
                {
                    System.out.println("Insufficient Balance!");
                }
            }
        
       
    }
    
}
