x = int(input("Enter a number: "))
count = 0
for element in range (1, x):
    if element > 1 and element < x and x % element == 0 and count == 0:
        count = count + 1
        print ("This is not a prime number")
if (count == 0):
    print ("This is a prime number")

