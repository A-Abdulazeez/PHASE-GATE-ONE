import java.util.Scanner;

public class TaskSeven{
public static void main(String... args){
Scanner input = new Scanner(System.in);


int sum = 0;
int index = 0;
for (; index < 5;index++){
System.out.println("Enter your number");
int userInput = input.nextInt();
sum += index;
}
System.out.println("The sum of your numbers is: " + sum);


}
}
