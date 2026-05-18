import java.util.*;

public class NumberGuessingApp {
public static void main(String... azeez) {
Scanner input = new Scanner(System.in);
Random rand = new Random();

int randomGuess = rand.nextInt(100);
int count = 0; 
int userInput = 0;

while(true){
System.out.println("Enter a number");
userInput = input.nextInt();

if (userInput < 1 || userInput > 100){
System.out.println("Please enter a number between 1 and 100");
continue;
}
else{
count += 1;
if (randomGuess < userInput) {
System.out.println("lower - Try again");
}
if (randomGuess > userInput) {
System.out.println("Higher - Try again");
}
if (randomGuess == userInput || count == 5){
break;
}
}
}
System.out.println("============FINAL SUMMARY============");
System.out.println("The correct number is: " + randomGuess);
System.out.println("The number of attempts is: " + count);

if (randomGuess == userInput && count == 1) System.out.println("your rating is: Legendary");
else if (randomGuess == userInput && count == 2) System.out.println("your rating is: Excellent");
else if (randomGuess == userInput && count == 3 || count == 4) System.out.println("your rating is: Good");
else if (randomGuess == userInput && count == 5) System.out.println("your rating is: Close!");
else {
System.out.println("No win = Better luck");
}
System.out.println("=====================================");
}
}

