num = int(input("Give me a number: "))
x = range(1, num)
for elem in x:
    if (num % elem == 0):
        print (elem)
print (num)