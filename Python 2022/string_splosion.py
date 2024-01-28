def string_splosion(str):
  i = ""
  j = len (str)
  for x in range (j):
    i = i + str [0: x + 1]
  return i