def string_bits(str):
  i = ""
  for x in range (len (str)):
    if (x % 2 == 0):
      i = i + str [x: x + 1] 
  return i
