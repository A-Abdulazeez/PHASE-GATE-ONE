import java.util.Arrays;

public class SmallToLarge{

public static int largestNum(int [] arrayNumber){

int largest = arrayNumber[0];
for (int index = 1; index < arrayNumber.length; index++){
if (arrayNumber[index] > largest) largest = arrayNumber[index];
}
return largest;
}


public static int smallestNum(int [] arrayNumber){

int smallest = arrayNumber[0];
for (int index = 1; index < arrayNumber.length; index++){
if (arrayNumber[index] < smallest) smallest = arrayNumber[index];
}
return smallest;
}


public static int [] rearrange (int [] arrayNumber){

int smallest = smallestNum(arrayNumber);
int largest = largestNum(arrayNumber);

int newArrayLength = largest - smallest + 1;
int [] newArray = new int[newArrayLength];

int count = 0;
for (int indices = smallest ; indices <= largest; indices++){
newArray[count++] = indices;
}
return newArray;
}


}
