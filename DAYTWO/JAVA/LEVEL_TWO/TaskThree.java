import java.util.Scanner;

public class TaskThree{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("Enter your score");
int userInput = input.nextInt();
if (userInput >= 50){
System.out.println("You passed");
}
else{
System.out.println("you failed");
}
}
}
