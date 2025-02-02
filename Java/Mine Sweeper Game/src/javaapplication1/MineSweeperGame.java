/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class MineSweeperGame {
    
     public static void runGame()
    {
        Scanner input= new Scanner(System.in);
        int[][] gameBoard;
        
        System.out.println("---WELCOME TO THE MINESWEEPER GAME---");
        System.out.println("ENTER THE ROW AND COLUMN SIZES TO MAKE THE GAME TABLE AS YOU WISH");
        System.out.print("Row size: ");
        int rowSize=input.nextInt();
        System.out.print("Column size: ");
        int columnSize=input.nextInt();
        
        gameBoard=new int[rowSize][columnSize];
        int boardSize=rowSize*columnSize;
        int mineNumber=boardSize/4;
        makeGameBoard(gameBoard);
        
        boolean canPlay=true;
        int rowEnter,colEnter;
        int attempt=0;
        while(canPlay)
        {
            System.out.println("Enter the row and column to choose a point");
            System.out.print("Row: ");
            rowEnter=input.nextInt();
            System.out.print("Column: ");
            colEnter=input.nextInt();
            
            if(gameBoard[rowEnter][colEnter]==-1)
            {
                canPlay=false;
                System.out.println("You lost the game, game over :(");
            }
            else
            {
                if(gameBoard[rowEnter][colEnter]==0)
                {
                if(colEnter!=0)
                {
                    if(gameBoard[rowEnter][colEnter-1]==-1)
                    {
                        gameBoard[rowEnter][colEnter]++;
                    }
                }
                
                if(rowEnter!=rowSize-1)
                {
                     if(gameBoard[rowEnter+1][colEnter]==-1)
                    {
                        gameBoard[rowEnter][colEnter]++;
                    }
               
                } 
                if(rowEnter!=0)
                { 
                    if(gameBoard[rowEnter-1][colEnter]==-1)
                    {
                    gameBoard[rowEnter][colEnter]++;
                    }
                }
                
                if(colEnter!=columnSize-1)
                {
                    if(gameBoard[rowEnter][colEnter+1]==-1)
                    {
                        gameBoard[rowEnter][colEnter]++;
                    }
                }
              
                if(gameBoard[rowEnter][colEnter]==0)
                {
                    gameBoard[rowEnter][colEnter]=-2;
                }
                attempt++;
                }
                else
                {
                    System.out.println("Please enter another position, you already opened this point.");
                }
            }
            if(attempt==boardSize-mineNumber-1)
            {
                System.out.println("You won the game, yuppy :)");
                printBoard(gameBoard);
                break;
            }
            printBoard(gameBoard);
        }
        
        
    }
    
    public static void makeGameBoard(int[][] gameBoard)
    {
        Random rand =new Random();
        int boardSize=gameBoard.length*gameBoard[0].length;
        int mineNumber=boardSize/4;
        while(mineNumber>=0)
        {
            
            int randColumn=rand.nextInt(gameBoard[0].length);
            int randRow=rand.nextInt(gameBoard.length);
            if(gameBoard[randRow][randColumn]==0)
            {
                mineNumber--;
                gameBoard[randRow][randColumn]=-1;
                printBoard(gameBoard);
            }
           
        }
    }
    
    public static void printBoard(int[][] gameBoard)
    {
        for(int[] row: gameBoard)
        {
            for(int value: row)
            {
                if(value==-1)
                {
                    System.out.print(" "+0+" ");
                }
                else
                {
                     System.out.print(" "+value+" "); 
                }
                
                
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
