import java.util.Scanner;

public class TaskFour{
public static void main(String... args){
Scanner input = new Scanner(System.in);


int product = 1;
int index = 0;
for (;index < 2; index++){
System.out.println("Enter your number");
int userInput = input.nextInt();
product *= userInput;
}
System.out.println("The product is: " + product);
}
}
