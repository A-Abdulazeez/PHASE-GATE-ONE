public class ArrayFunctions {

public static int [] removeZero (int  [] numbers){
int [] array = new int [numbers.length];

for(int index = 0; index < numbers.length; index++){
for (int indices = index + 1; indices < numbers.length; indices++){
if (numbers[index] < numbers[indices]){
int temp = numbers[index];
numbers[index] = numbers[indices];
numbers[indices] = temp;
array = numbers;
}
}
}
return array;
}


}
