import java.util.Scanner;

public class TaskNine{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("Enter your age");
int userInput = input.nextInt();
if (userInput < 18 ){
System.out.println("child");
}
if (userInput == 18){
System.out.println("teen");
}
if (userInput > 18){
System.out.println("adult");
}
}
}
