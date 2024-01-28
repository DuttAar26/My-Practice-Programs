def count_hi(str):
  x = 0
  for i in range (len (str) - 1):
    if (str[i] == 'h' and str[i + 1] == 'i'):
      x = x + 1
  return x
