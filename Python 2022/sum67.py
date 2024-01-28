def sum67(nums):
  index = total = 0
  while index < len(nums):
    if nums[index] == 6:
      while nums[index] != 7:
        index += 1
      index += 1
    else:
      total += nums[index]
      index += 1
  return total