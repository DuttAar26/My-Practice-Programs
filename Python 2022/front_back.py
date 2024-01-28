def front_back(str):
  if len (str) < 2:
    return str
  if len (str) < 3:
    return str[1:len (str)] + str[0:1]
  else:
    return str[len (str) - 1: len (str)] + str[1: len (str) - 1] + str[0:1]