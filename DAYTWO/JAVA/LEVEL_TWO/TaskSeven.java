import java.util.Scanner;

public class TaskSeven{
public static void main(String... args){
Scanner input = new Scanner(System.in);

String password = "admin123";

System.out.println("Enter your password");
String userInput = input.nextLine();

if (userInput == password){
System.out.println("Access granted");
}
else{
System.out.println("Access denied");
}
}
}
