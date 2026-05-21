from unittest import TestCase
from find_sum_function import *

class test_find_sum_function(TestCase):
	def test_that_function_works(self):
		arrayNumber = [1,2,3,4,5,6,7,8,9];
		regularNumber = 3;
		expected = [1, 2];
		actual = sumArray(arrayNumber, regularNumber);
		self.assertListEqual(expected,actual);
