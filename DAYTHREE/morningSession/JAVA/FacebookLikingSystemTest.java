import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacebookLikingSystemTest{

@Test
public void testForOnlyOneLike(){
String [] people = {"tayo"};
String expected = FacebookLikingSystem.likingSystem(people);
String actual = "tayo likes this";
assertEquals(expected,actual);
}

@Test
public void testForOnlytwoLikes(){
String [] people = {"tayo","aina"};
String expected = FacebookLikingSystem.likingSystem(people);
String actual = "tayo, aina likes this";
assertEquals(expected,actual);
}

@Test
public void testForOnlyThreeLikes(){
String [] people = {"tayo","aina","azeez"};
String expected = FacebookLikingSystem.likingSystem(people);
String actual = "tayo, aina, azeez likes this";
assertEquals(expected,actual);
}
