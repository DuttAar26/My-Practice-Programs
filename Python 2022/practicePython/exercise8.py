x = input("First player: Enter rock, paper, or scissors: ")
y = input("Second player: Enter rock, paper, or scissors: ")
if (x == "rock"):
    if (y == "paper"):
        print("Second player won")
    if (y == "rock"):
        print ("tie")
    if (y == "scissors"):
        print("First player won")
if (x == "paper"):
    if (y == "paper"):
        print ("tie")
    if (y == "rock"):
        print ("First player won")  
    if (y == "scissors"):
        print ("Second player won")
if (x == "scissors"):
    if (y == "paper"):
        print ("First player won")  
    if (y == "rock"):
        print ("Second player won")
    if (y == "scissors"):
        print ("tie")
