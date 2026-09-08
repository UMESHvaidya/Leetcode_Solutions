class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        """Return the value that occurs once when all others occur twice."""
        unique_number = 0

        for number in nums:
            unique_number ^= number

        return unique_number
