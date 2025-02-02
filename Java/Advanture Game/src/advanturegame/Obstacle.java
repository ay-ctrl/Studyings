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
public class Obstacle {
    
    private String name;
    private int damage, health, award,maxNum;

    public Obstacle(String name, int damage, int health, int award, int maxNum) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.award = award;
        this.maxNum = maxNum;
    }

        public int count()
    {
        Random rand=new Random();
        return rand.nextInt(maxNum)+1;
        
    }
    
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getAward() {
        return award;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }
    
    
    
}
