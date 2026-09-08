# LeetCode Solutions

A growing collection of LeetCode solutions written in Java and Python. Each file is a focused, standalone implementation intended for practice and reference.

## Repository layout

```text
.
├── src/com/leetcode/       # Java solutions
└── python/solutions/       # Python solutions
```

## Solutions

| # | Problem | Difficulty | Language |
| --- | --- | --- | --- |
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | Python |
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Easy | Python |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | Java |
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy | Python |
| 136 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | Python |
| 944 | [Delete Columns to Make Sorted](https://leetcode.com/problems/delete-columns-to-make-sorted/) | Easy | Java |
| 1299 | [Replace Elements with Greatest Element on Right Side](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/) | Easy | Java |
| 1323 | [Maximum 69 Number](https://leetcode.com/problems/maximum-69-number/) | Easy | Java |
| 1614 | [Maximum Nesting Depth of the Parentheses](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/) | Easy | Java |
| 1678 | [Goal Parser Interpretation](https://leetcode.com/problems/goal-parser-interpretation/) | Easy | Java |
| 1684 | [Count the Number of Consistent Strings](https://leetcode.com/problems/count-the-number-of-consistent-strings/) | Easy | Java |
| 1689 | [Partitioning Into Minimum Number of Deci-Binary Numbers](https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/) | Medium | Java |
| 1704 | [Determine if String Halves Are Alike](https://leetcode.com/problems/determine-if-string-halves-are-alike/) | Easy | Java |
| 1748 | [Sum of Unique Elements](https://leetcode.com/problems/sum-of-unique-elements/) | Easy | Java |
| 1773 | [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/) | Easy | Java |
| 2879 | [Display the First Three Rows](https://leetcode.com/problems/display-the-first-three-rows/) | Easy | Python / Pandas |
| 3110 | [Score of a String](https://leetcode.com/problems/score-of-a-string/) | Easy | Python |

> `Decode_String_394.java` is an in-progress implementation of [Decode String](https://leetcode.com/problems/decode-string/).

## Adding a solution

1. Create a solution file in the language directory.
2. Name Python files as `<problem-number>.<problem-slug>.py`.
3. Keep the implementation compatible with the function or class signature expected by LeetCode.
4. Add the problem to the table above.
5. Test the solution against the examples before committing.

## Running solutions locally

Python solution files can be executed directly when they contain a test block:

```bash
python3 python/solutions/3110.score-of-a-string.py
```

Java solutions are in the `com.leetcode` package and can be compiled from the repository root:

```bash
javac -d out src/com/leetcode/Valid_Parentheses_20.java
java -cp out com.leetcode.Valid_Parentheses_20
```

## License

This repository currently does not specify a license.
