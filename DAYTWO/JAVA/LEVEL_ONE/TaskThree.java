import java.util.Scanner;

public class TaskThree{
public static void main(String... args){
Scanner input = new Scanner(System.in);


int sum = 0;
int index = 0;
for (;index < 2; index++){
System.out.println("Enter your number");
int userInput = input.nextInt();
sum += userInput;
}
System.out.println("The sum is: " + sum);
}
}
