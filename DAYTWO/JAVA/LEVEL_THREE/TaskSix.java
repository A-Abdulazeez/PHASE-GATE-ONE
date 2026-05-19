import java.util.Scanner;

public class TaskSix{
public static void main(String... args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your number");
int userInput = input.nextInt();

int sum = 0;
int index = 0;
for (; index <= userInput;index++){
sum += index;
}
System.out.println("The sum of numbers to the your number is: " + sum);


}
}
