import java.util.Scanner;

public class TaskEight{
public static void main(String... args){
Scanner input = new Scanner(System.in);


int sum = 0;
int userInput = 0;

while(true){
System.out.println("Enter your number");
userInput = input.nextInt();
sum += userInput;

if(userInput == 0){
break;
}
}
System.out.println("The sum of your numbers is: " + sum);


}
}
