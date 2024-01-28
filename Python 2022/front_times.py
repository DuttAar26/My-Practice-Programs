def front_times(str, n):
  x = ""
  if (len (str) < 3):
    for i in range (n):
      x = str + x
  else:
    for i in range (n):
      x = str [0:3] + x
  return x