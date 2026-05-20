import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MiniParkingTest{


@Test
public void testThatFunctionReturnszeroSpaces(){
int [] expected = new int[20];
int [] actual = MiniParking.carSlots(0);
assertArrayEquals(expected,actual);
}

@Test
public void testThatFunctionReturnsfullparkedSpaces(){
int [] expected = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
int [] actual = MiniParking.carSlots(20);
assertArrayEquals(expected,actual);
}

@Test
public void testThatFunctionReturnstenparkedSpaces(){
int [] expected = {1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0};
int [] actual = MiniParking.carSlots(10);
assertArrayEquals(expected,actual);
}









}


