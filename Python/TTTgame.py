# -*- coding: utf-8 -*-
"""
Created on Fri Feb  2 08:46:50 2024
***TIC TAC TOE GAME***
@author: AYSE
"""

import sys,os


Game_Board=[["___","___","___"],
            ["___","___","___"],
            ["___","___","___"]]

Winning_Situations=[[[0,0],[0,1],[0,2]],
                    [[1,0],[1,1],[1,2]],
                    [[2,0],[2,1],[2,2]],
                    [[0,0],[1,0],[2,0]],
                    [[0,1],[1,1],[2,1]],
                    [[0,2],[1,2],[2,2]],
                    [[0,2],[1,1],[2,0]],
                    [[0,0],[1,1],[2,2]]]
x_situation=[]
o_situation=[]
order=1
won=True
while(won):
    print("\n"*3)
    for row in Game_Board:
        print("\t".expandtabs(14),*row,sep="\t"*2,end="\n"*2)
    if order%2==0:
        print("ORDER IS IN X".center(61))
    else:
        print("ORDER IS IN O".center(61))   
    print()
    row_loc=int(input("WRITE THE ROW AS 1,2,3: ".rjust(42)))-1
    if row_loc==-1: # 0 for quit
        break
    col_loc=int(input("WRITE THE COLUMN AS 1,2,3: ".rjust(44)))-1
    if col_loc==-1: # 0 for quit
        break
    if Game_Board[row_loc][col_loc]=='___' and order%2==0:
        Game_Board[row_loc][col_loc]= " X "
        x_situation+=[[row_loc,col_loc]]
        order+=1
    elif Game_Board[row_loc][col_loc]=='___' and order%2==1:
        Game_Board[row_loc][col_loc]= " O "
        o_situation+=[[row_loc,col_loc]]
        order+=1
    else:
        print("THIS PLACE IS FULL!".rjust(40))
    print()
   # print('\033c')
        
    for conds in Winning_Situations:
        x=[z for z in x_situation if z in conds]
        o=[z for z in o_situation if z in conds]
        if len(x)==len(conds):
            print("WINNER IS X".rjust(35))
            won=False
            sys.exit()
        if len(o)==len(conds):
            print("WINNER IS O".rjust(35))
            won=False
            sys.exit()
print(sum(1,2,3))
