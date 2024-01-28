def cat_dog(str):
  c = 0
  d = 0
  for x in range (len (str) - 2):
    if (str [x] == 'c' and str [x + 1] == 'a' and str [x + 2] == 't'):
      c = c + 1
  for i in range (len (str) - 2):
    if (str [i] == 'd' and str [i + 1] == 'o' and str [i + 2] == 'g'):
      d = d + 1
  if (c == d):
    return True
  return False
