import java.util.Scanner;

public class TaskFour{
public static void main(String... args){
Scanner input = new Scanner(System.in);

int larger = 0;
int index = 0;
for (;index < 2; index++){
System.out.println("Enter your number");
int userInput = input.nextInt();
if (userInput > larger){
larger = userInput;
}
}
System.out.println("The larger is: " + larger);
}
}
