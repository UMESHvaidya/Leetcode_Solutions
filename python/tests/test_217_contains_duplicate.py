import unittest
import importlib.util
import os
import sys

class TestContainsDuplicate(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        # Locate the solution module dynamically to handle the hyphenated, dot-prefixed filename
        dir_path = os.path.dirname(os.path.abspath(__file__))
        solution_path = os.path.join(dir_path, '../solutions/217.contains-duplicate.py')
        
        spec = importlib.util.spec_from_file_location("solution", solution_path)
        solution_module = importlib.util.module_from_spec(spec)
        spec.loader.exec_module(solution_module)
        cls.Solution = solution_module.Solution

    def test_has_duplicates(self):
        sol = self.Solution()
        self.assertTrue(sol.containsDuplicate([1, 2, 3, 1]))
        self.assertTrue(sol.containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]))

    def test_no_duplicates(self):
        sol = self.Solution()
        self.assertFalse(sol.containsDuplicate([1, 2, 3, 4]))
        self.assertFalse(sol.containsDuplicate([]))
        self.assertFalse(sol.containsDuplicate([100]))

if __name__ == '__main__':
    unittest.main()
