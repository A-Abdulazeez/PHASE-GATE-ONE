import java.util.Arrays;

public class FindSum{
public static int [] sumArray (int [] arrayNumber, int regularNumber){

int [] newArray = {};
int indices = 0;
int index = 0;
for( ;indices < arrayNumber.length; indices ++){ 
for (; index < arrayNumber.length ;index++){
if (arrayNumber[indices] + arrayNumber[index] == regularNumber) {
newArray = new int [] {arrayNumber[indices] , arrayNumber[index]};
return newArray;
} 
}
}
return newArray;
}


}
