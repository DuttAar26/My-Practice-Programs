def count_evens(nums):
  x = 0
  for i in range (len (nums)):
    if (nums[i] % 2 == 0):
      x = x + 1
  return x