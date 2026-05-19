import java.util.Scanner;

public class TaskSix{
public static void main(String... args){
Scanner input = new Scanner(System.in);


System.out.println("Enter the width ");
double width = input.nextDouble();
System.out.println("Enter the length ");
double length = input.nextDouble();

double area = width * length;
System.out.println("The area is: " + area);
}
}
