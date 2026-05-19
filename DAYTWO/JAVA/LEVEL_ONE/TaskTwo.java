import java.util.Scanner;

public class TaskTwo{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("what is your age");
int userAge = input.nextInt();

System.out.printf("you will be %d in 5 years time %n", userAge+5 );
}
}
