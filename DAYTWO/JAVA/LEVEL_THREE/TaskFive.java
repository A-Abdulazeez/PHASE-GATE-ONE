import java.util.Scanner;

public class TaskFive{
public static void main(String... args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your number");
int userInput = input.nextInt();

int result = 0;
int index = 0;
for (; index <= userInput;index++){
result = userInput * index ;
}
System.out.println("Factorial is: " + result);


}
}
