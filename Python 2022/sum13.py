def sum13(nums):
  elem_sum = 0
  index = 0

  while index < len(nums):
    if nums[index] != 13:
      elem_sum += nums[index]
    else:
      index += 1 
    index += 1

  return elem_sum