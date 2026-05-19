import java.util.Scanner;

public class TaskFive{
public static void main(String... args){
Scanner input = new Scanner(System.in);

int largest = 0;
int index = 0;
for (;index < 3; index++){
System.out.println("Enter your number");
int userInput = input.nextInt();
if (userInput > largest){
largest = userInput;
}
}
System.out.println("The largest is: " + largest);
}
}
