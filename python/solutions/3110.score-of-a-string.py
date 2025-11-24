class Solution:
    def scoreOfString(self, s: str) -> int:
        score = 0
        for i in range(len(s) - 1):
            score += abs(ord(s[i]) - ord(s[i+1]))
        return score

# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1: Example from problem description
    s1 = "hello"
    expected1 = 13 # |h-e| + |e-l| + |l-l| + |l-o| = |104-101| + |101-108| + |108-108| + |108-111| = 3 + 7 + 0 + 3 = 13
    result1 = solution.scoreOfString(s1)
    print(f"Input: '{s1}', Expected: {expected1}, Got: {result1}")
    assert result1 == expected1, f"Test Case 1 Failed: Expected {expected1}, Got {result1}"

    # Test case 2: Another example
    s2 = "zaz"
    expected2 = 4 # |z-a| + |a-z| = |122-97| + |97-122| = 25 + 25 = 50. Wait, should be 25 + 25 = 50. Ah, it's absolute difference, so just 25+25 = 50. My math was wrong.
    # Recalculating: |z-a| + |a-z| = |122-97| + |97-122| = 25 + 25 = 50.
    expected2 = 50
    result2 = solution.scoreOfString(s2)
    print(f"Input: '{s2}', Expected: {expected2}, Got: {result2}")
    assert result2 == expected2, f"Test Case 2 Failed: Expected {expected2}, Got {result2}"

    # Test case 3: Single character string (score should be 0)
    s3 = "a"
    expected3 = 0
    result3 = solution.scoreOfString(s3)
    print(f"Input: '{s3}', Expected: {expected3}, Got: {result3}")
    assert result3 == expected3, f"Test Case 3 Failed: Expected {expected3}, Got {result3}"

    # Test case 4: Empty string (score should be 0)
    s4 = ""
    expected4 = 0
    result4 = solution.scoreOfString(s4)
    print(f"Input: '{s4}', Expected: {expected4}, Got: {result4}")
    assert result4 == expected4, f"Test Case 4 Failed: Expected {expected4}, Got {result4}"

    print("All test cases passed!")