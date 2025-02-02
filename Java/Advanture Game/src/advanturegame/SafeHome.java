/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advanturegame;

/**
 *
 * @author ASUS
 */
public class SafeHome extends NormalLoc {
    
    
    public SafeHome(Player player) {
        super(player, "Safe Home");
    }
    
    @Override
    public boolean getLocation(){
        player.setHealth(player.getRealHealth());
        System.out.println("Your are full of cravings");
        System.out.println("Now you are in safe home");
        return true;
    }
    
    
}
