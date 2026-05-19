import java.util.Scanner;

public class TaskTen{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("Enter your number");
int userInput = input.nextInt();

int count = 0;
int index = 0;
for (; index < userInput;index++){

count += 1;
index++;
}
System.out.println("The count of your numbers is: " + count);


}
}
