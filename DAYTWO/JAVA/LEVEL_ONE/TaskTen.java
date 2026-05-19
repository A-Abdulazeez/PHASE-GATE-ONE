import java.util.Scanner;

public class TaskTen{
public static void main(String... args){
Scanner input = new Scanner(System.in);

int averageOfnumbers = 0;
int sumOfNumbers = 0;
int count = 0;

int index = 0;
for (;index < 3; index++){
System.out.println("Enter your number");
int userInput = input.nextInt();
count += 1;
sumOfNumbers += userInput;
averageOfnumbers = sumOfNumbers / count;
}
System.out.println("The average is: " + averageOfnumbers);
}
}
