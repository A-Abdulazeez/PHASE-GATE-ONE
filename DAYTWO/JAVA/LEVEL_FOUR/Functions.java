public class Functions{

public static int sumOf(int firstNumber, int secondNumber){
int total = firstNumber +  secondNumber;
return total;
}

public static String evenNumber(int number){
if (number % 2 == 0){
return "even number";
}
else{ 
return "not even number";
}
}
public static int squareOF(int number){
return number * number;
}

public static double temperatureConverter(double celsius){
double fahrenheit = celsius * (9/5) + 32;
return fahrenheit;
}

public static boolean isprime(int number){
int count = 0;
for(int index = 2; index < number; index++){
if ( number % index == 0){
count++;
}
}
if (count > 2){
return false;
}
else{
return true;
}
}

public static int largestOf(int firstNumber,int secondNumber,int thirdNumber){
int largest = firstNumber;
if (secondNumber > firstNumber ){
largest = secondNumber;
}
if (thirdNumber > secondNumber){
largest = thirdNumber;
}
return largest;
}

public static double simpleInterestOf(double principal, double rate, double time){
double result = (principal * rate/100 * time) / 100;
return result;
}

public static double areaOfRectangle(double length, double width){
double result = length * width;
return result;
}


public static void main(String... args){
System.out.println(sumOf(2,2));
System.out.println(areaOfRectangle(10,10));
System.out.println(evenNumber(2));
System.out.println(squareOF(2));
System.out.println(temperatureConverter(1));
System.out.println(largestOf(8,6,5));
System.out.println(simpleInterestOf(10000, 4, 5));
System.out.println(isprime(7));
}
}
