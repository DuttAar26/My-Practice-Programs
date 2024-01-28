def end_other(a, b):
  if (a == b):
    return True
  if (len (a) > len (b)):
    if (b.lower() == a[len (a) - len (b): len (a)].lower()):
      return True
  if (len (b) > len (a)):
    if (a.lower() == b[len (b) - len (a): len (b)].lower()):
      return True
  return False
