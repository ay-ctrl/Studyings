/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advanturegame;

/**
 *
 * @author ASUS
 */
public class Cave extends BattleLoc{
    
    public Cave(Player player) {
        super(player, "Cave",new Zombie(),"food");
    }
    
}
