def no_teen_sum(a, b, c):
  return fix_teen(a) + fix_teen(b) + fix_teen(c)

def fix_teen(n):
     teen = [13, 14, 17, 18, 19]
     if n in teen:
        return 0
     else:
        return n