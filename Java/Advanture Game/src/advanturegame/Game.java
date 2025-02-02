/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advanturegame;

import java.util.Scanner;


public class Game {
       Scanner input=new Scanner(System.in);
       Player player;
       Location location;
       
       public void logIn()
       {
        Scanner input=new Scanner(System.in);
        System.out.println("---WELCOME TO THE SURVIVAL GAME---\n");
        System.out.println("What is your name?");
        String playerName=input.nextLine().toUpperCase();
        player=new Player(playerName);
        System.out.println("WELCOME "+playerName+" :)");
        player.selectCharacter();
        start();
       }
       
       public void start()
       {
           while(true)
           {
           System.out.println();
           System.out.println("******************************************");
           System.out.println();
           System.out.println("Choose a place to go");
           System.out.println("1. Safe Home - To rest and get health");
           System.out.println("2. Cave - Zombies may appear");
           System.out.println("3. Forest - Vampires may appear");
           System.out.println("4. River - Bears may appear");
           System.out.println("5. Ruins - Witches may appear");
           System.out.println("6. Store - You can buy iventory");
           System.out.print("Your selection: ");
           int choiceLoc=input.nextInt();
           while(choiceLoc<1 || choiceLoc>5)
           {
               System.out.print("Please enter a correct location: ");
               choiceLoc=input.nextInt();
           }
           switch(choiceLoc)
           {
                case 1:
                   location =new SafeHome(player);
                   break;
                case 2:
                   location=new Cave(player);
                   break;
                case 3:
                   location=new Forest(player);
                   break;
                case 4:
                   location=new River(player);
                   break;
                case 5:
                    location=new Ruins(player);
                    break;
                case 6:
                   location=new ToolStore(player);
                   break;
                default:
                    location =new SafeHome(player);
                    break;
           }// switch
           
           if(player.getInv().isFirewood() && player.getInv().isWater()&& player.getInv().isFood()&&player.getInv().isTool())
           {
               System.out.println("YOU COLLECTED ALL THE ITEMS AND WON THE GAME :)");
               System.out.println("THANK YOU FOR PLAYING THE SURVIVAL GAME");
               break;
           }
           
           if(!location.getLocation())
           {
               System.out.println("GAME OVER");
               System.out.print("Do you want to play again? (1:YES , 2:NO): ");
               int choice=input.nextInt();
               System.out.println();
               if(choice==1)
               {
                    Game game=new Game();
                    game.logIn(); 
               }
               break;
           }
           }
       }
}
