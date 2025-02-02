# -*- coding: utf-8 -*-
"""
Created on Sat Oct 19 21:52:23 2024
HANGMAN GAME 💙
@author: ASUS
"""


hangman_chart={0:((" "," "," "),
                  (" "," "," "),
                  (" "," "," "),),
               1:((" ","O"," "),
                  (" "," "," "),
                  (" "," "," "),),
               2:((" ","O"," "),
                  (" ","|"," "),
                  (" "," "," "),),
               3:((" ","O"," "),
                  ("/","|"," "),
                  (" "," "," "),),
               4:((" ","O"," "),
                  ("/","|","\\"),
                  (" "," "," "),),
               5:((" ","O"," "),
                  ("/","|","\\"),
                  ("/"," "," "),),
               6:((" ","O"," "),
                  ("/","|","\\"),
                  ("/"," ","\\"),)}

def display_man(wrong_answers):
    for line in hangman_chart[wrong_answers]:
        print("".join(line))
    
    pass

def display_hint(hint):
    print(" ".join(hint))
    print()
    print("*"*len(hint)*2)
    
def display_answer(word):
    print(" ".join(word))



words=["apple","pear","banana","spinach","peach","kiwi"]
wrong_guesses=set()
import random


def main():
    
    word=random.choice(words)
    hint=["_"]
    wrong_num=0
    is_running=True
    hint=hint*len(word)
    print("WELCOME TO THE HANGMAN GAME😊")
    while is_running:
        display_man(wrong_num)
        display_hint(hint) 
        guess=input("Guess a letter: ")
       
        if guess in word:
            for i in range(len(word)):
                if word[i]==guess:
                    hint[i]=guess
        else:
            if guess not in wrong_guesses:
                wrong_num+=1
                wrong_guesses.add(guess)
            else:
                print("You guessed that letter already!")
            
        if "_" not in hint:
            display_answer(word)
            print("YOU WON THE GAME💙")
            input("\nPress any key to quit...")
            break
        if wrong_num>=len(hangman_chart)-1:
            display_man(wrong_num)
            print("IT WAS  ",end="")
            display_answer(word)
            print("YOU LOST THE GAME😔")
            input("\nPress any key to quit...")
            break

        
        
    
if __name__=="__main__":
    main()




















