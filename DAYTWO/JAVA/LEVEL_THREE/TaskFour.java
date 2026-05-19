import java.util.Scanner;

public class TaskFour{
public static void main(String... args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your number");
int userInput = input.nextInt();

int index = 1;
for (; index <= 12;index++){
int result = userInput * index ;
System.out.println(userInput + "x" + index + "=" + result);
}

}
}
