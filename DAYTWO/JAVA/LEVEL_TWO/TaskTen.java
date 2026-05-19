import java.util.Scanner;

public class TaskTen{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.println("Enter your number");
int userInput = input.nextInt();

if (userInput % 3 == 0 && userInput % 5 == 0){
System.out.printf("%d is divisible by 3 and 5 %n", userInput);
}
else{
System.out.printf("%d is not divisible by 3 and 5 %n", userInput);
}
}
}
