import java.util.Arrays;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindSumTest{

@Test
public void testThatFunctionTakesinArrayNumbersAndRegularNumberAndWorks(){
int [] arrayNumber = {1,2,3,4,5,6,7,8,9};
int regularNumber = 3;
int [] expected = {1, 2};
int [] actual = FindSum.sumArray(arrayNumber, regularNumber);
assertArrayEquals(expected,actual);
}

@Test
public void testThatFunctionTakesinNegativeElementInArrayNumbersAndRegularNumberAndWorks(){
int [] arrayNumber = {1,2,3,4,5,6,7,8,-2};
int regularNumber = 3;
int [] expected = FindSum.sumArray(arrayNumber, regularNumber);
int [] actual = {1, 2};
assertArrayEquals(expected,actual);
}

@Test
public void testThatFunctionTakesinAllNegativeElementInArrayNumbersAndNegativeRegularNumberAndWorks(){
int [] arrayNumber = {-1,-2,-3,-4,-5,-6,-7,-8,-2};
int regularNumber = -5;
int [] expected = FindSum.sumArray(arrayNumber, regularNumber);
int [] actual = {-1, -4};
assertArrayEquals(expected,actual);
}

}
