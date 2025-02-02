/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advanturegame;

import java.util.Scanner;




class Player 
{
    Scanner input=new Scanner(System.in);
    Inventory inv= new Inventory();
    private int damage,money,health,realHealth;
    private String name,cName;
    
    public void selectCharacter()
    {
        switch(characterMenu())
        {
            case 1:
                initPlayer("Wizard",5,15,25);
                break;
            case 2:
                initPlayer("Archor",7,12,15);
                break;
            case 3:
                initPlayer("Knight",10,8,10);
                break;
            default:
                initPlayer("Wizard",5,15,25);
                break;
        }
        System.out.println("\n"+getcName()+" "+this.name+", Damage: "+getDamage()+", Health: "+getHealth()+", Money: "+getMoney());
    }
     public void initPlayer(String name,int damage,int health,int money)
     {
                setcName(name);
                setDamage(damage);
                setHealth(health);
                setMoney(money);
                setRealHealth(health);
     }
    public int characterMenu()
    {
        System.out.println("Please choose a character to play with");
        System.out.println("1.Wizard, Damage:5 ,Health:15 ,Money:25");
        System.out.println("2.Archor, Damage:7 ,Health:12 ,Money:15");
        System.out.println("3.Knight, Damage:10 ,Health:8 ,Money:10");
        System.out.print("Your decide: ");
        int choice=input.nextInt();
        while((choice<1 || choice>3))
        {
            System.out.print("Please enter a correct number: ");
            choice=input.nextInt();
        }

        return choice;
    }

    public Player(String name) {
        this.name = name;
    }
    
    
    public int getTotalDamage()
    {
        return this.damage + getInv().getwDamage();
    }
    public Inventory getInv() {
        return inv;
    }

    public int getDamage() {
        return damage;
    }

    public int getMoney() {
        return money;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getcName() {
        return cName;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getRealHealth() {
        return realHealth;
    }

    public void setRealHealth(int realHealth) {
        this.realHealth = realHealth;
    }
    
    
    
    
    
    
}//class
