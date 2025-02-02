# -*- coding: utf-8 -*-
"""
Created on Sat Feb  3 14:57:42 2024

***** PRINT WITH PARAMETER "letter_case" *****

@author: AYSE
"""


def yaz(*args,case="noncase",sep=" ",end="\n",**kwargs):
    
    for i,value in enumerate(args):
        if not isinstance(value,str):
            value=str(value)
        
        if case=='upper':
            value=value.upper()
        elif case=='lower':
            value=value.lower()
            
        end_str= sep if i<(len(args)-1) else end
        print(value,end=end_str,**kwargs)
        
yaz("nisa",12,12,[1,2],case="upper",end="abc")
