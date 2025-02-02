/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advanturegame;

/**
 *
 * @author ASUS
 */
class Inventory {
    public boolean water,food,firewood,tool;
    public String weapon,armor;
    public int wDamage,aPower;
    
    public Inventory()
    {
        water=false;
        food=false;
        firewood=false;
        tool=false;
        weapon=null;
        armor=null;
        wDamage=0;
        aPower=0;
    }

    public boolean isTool(){
        return tool;
    }
    
    public boolean isWater() {
        return water;
    }

    public boolean isFood() {
        return food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getArmor() {
        return armor;
    }

    public int getwDamage() {
        return wDamage;
    }

    public int getaPower() {
        return aPower;
    }

    public void setWater(boolean water) {
        this.water = water;
    }
    
    public void setTool(boolean tool){
        this.tool=tool;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setArmour(String armour) {
        this.armor = armour;
    }

    public void setwDamage(int wDamage) {
        this.wDamage = wDamage;
    }

    public void setaPower(int aPower) {
        this.aPower = aPower;
    }
    
    
    
    
}//class
