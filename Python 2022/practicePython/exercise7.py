x = input ("Give me a list: ")
x = str(x)
for element in x:
    if (element != ","):
        if int(element) % 2 == 0:
            print(element)
    
