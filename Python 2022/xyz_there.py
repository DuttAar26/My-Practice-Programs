def xyz_there(str):
  if (str[0: 1] == 'x' and str[1: 2] == 'y' and str[2: 3] == 'z'):
      return True
  for i in range (len (str) - 3):
    if (str[i: i + 1] != '.' and str[i + 1: i + 2] == 'x' and str[i + 2: i + 3] == 'y' and str[i + 3: i + 4] == 'z'):
      return True
  return False
  
