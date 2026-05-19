import java.util.Scanner;

public class TaskNine{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the price of the item ");
int userNumber = input.nextInt();

int taxOnItem = (10/100) * userNumber;

int taxAdded = taxOnItem + userNumber;

System.out.println("The tax added is: " + taxAdded);
}
}
