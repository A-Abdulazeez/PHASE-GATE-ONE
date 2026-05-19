import java.util.Scanner;

public class TaskTwo{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("Enter your number");
int userInput = input.nextInt();
if (userInput < 0){
System.out.println("The number is negative");
}
else{
System.out.println("The number is odd");
}
}
}
