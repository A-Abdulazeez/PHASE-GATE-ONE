import java.util.Scanner;

public class TaskFive{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.println("Enter your temperature in celsius");
double celsius = input.nextDouble();
double fahrenheit = celsius * (9/5) + 32;

System.out.println("The conversion in fahrenheit is: " + fahrenheit);
}
}
