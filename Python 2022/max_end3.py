def max_end3(nums):
  if (nums [0] < nums [len (nums) - 1]):
    for x in range (len (nums)):
      nums [x] = nums [len (nums) - 1]
  else:
    for x in range (len (nums)):
      nums [x] = nums [0]
  return nums
