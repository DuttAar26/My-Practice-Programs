import random
a = random.randint(1, 9)
x = int(input("Enter a number: "))
count = 0
if a < x:
    print ("Your number is too big")
    count = count + 1
if a > x:
    print ("Your number is too small")
    count = count + 1
if a == x:
    print ("You got the number!")
    print (count)
