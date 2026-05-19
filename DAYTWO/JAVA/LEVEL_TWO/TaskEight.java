import java.util.Scanner;

public class TaskEight{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a day number");
int userInput = input.nextInt();
if (userInput == 1){
System.out.println("Sunday");
}
else if (userInput == 2){
System.out.println("monday");
}
else if (userInput == 3){
System.out.println("Tuesday");
}
else if (userInput == 4){
System.out.println("Wednesday");
}
else if (userInput == 5){
System.out.println("Thursday");
}
else if (userInput == 6){
System.out.println("friday");
}
else if (userInput == 7){
System.out.println("Saturday");
}
}
}
