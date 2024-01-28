def has22(nums):
  for x in range (1, len (nums)):
    if (nums[x] == 2 and nums[x - 1]  == 2):
      return True
  return False
