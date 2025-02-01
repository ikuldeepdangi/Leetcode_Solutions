class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = []
        n = len(nums)

        for i in range(n):
            digit1 = nums[i]
            rem = target - digit1
            for j in range(n):
                if rem == nums[j] and i != j:
                   result.append(i)
                   result.append(j)
                   return result
            i += 1
            
            





            
        