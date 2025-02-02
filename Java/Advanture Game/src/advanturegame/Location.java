/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advanturegame;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public abstract class Location 
{
    protected Player player;
    protected String name;
    
    Scanner input= new Scanner(System.in);
     
    public Location(Player player){
        this.player=player;
        this.name=name;
    }
    
    public abstract boolean getLocation();

    public Player getPlayer() {
        return player;
    }

    public String getName() {
        return name;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
