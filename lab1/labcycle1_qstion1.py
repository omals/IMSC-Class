# -*- coding: utf-8 -*-
"""labcycle1_qstion1.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1X1tuIXaPJxxzL5c2WFcdTaL1kbeUuMC2

1. Develop a program to read a four-digit number and find its  
 a.Sum of digits  
 b.Reverse  
 c.Difference between the product of digits at the odd position and the product of digits at the even position.
"""

sum=rev=0
pro_odd=pro_eve=1
n=int(input("enter a 4 digitno. "))#asking input from the user
#1      #finding the sum and reverse of first digit
dig=n%10  
rev=rev*10+dig
sum+=dig
n=n//10
pro_odd*=dig
#2      #finding the sum and reverse of second digit
dig=n%10
rev=rev*10+dig
sum+=dig
n=n//10
pro_eve*=dig
#3    #finding the sum and reverse of third digit
dig=n%10
rev=rev*10+dig
sum+=dig
n=n//10
pro_odd*=dig
#4   #finding the sum and reverse of fourth digit
dig=n%10
rev=rev*10+dig
sum+=dig
n=n//10
pro_eve*=dig    
print("1. sum of digits",sum) #printing the sum
print("2. reverse",rev)    #printing the reverse
print("3. diiference of thier products",pro_odd-pro_eve)  #printing the difference between product of odd and even digits