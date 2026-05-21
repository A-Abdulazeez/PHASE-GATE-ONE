import java.util.Arrays;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmallToLargeTest{

@Test
public void testThatFunctionTakesinArrayNumbersAndWorks(){
int [] arrayNumber = {1,9};
int [] expected = {1,2,3,4,5,6,7,8,9};
int [] actual = SmallToLarge.rearrange(arrayNumber);
assertArrayEquals(expected,actual);
}

@Test
public void testThatFunctionTakesinpositivetiveArrayNumbersAndWorks(){
int [] arrayNumber = {1,9};
int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
int [] actual = SmallToLarge.rearrange(arrayNumber);
assertArrayEquals(expected,actual);
}
}
