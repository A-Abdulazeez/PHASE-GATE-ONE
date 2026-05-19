import java.util.Scanner;

public class TaskSeven{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the radius of the circle ");
double radius = input.nextDouble();

double circumference =  2 * Math.pi * radius;
System.out.println("The circumference is: " + circumference);
}
}
