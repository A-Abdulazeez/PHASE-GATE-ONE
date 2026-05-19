def sumOf( firstNumber, secondNumber):
	total = firstNumber +  secondNumber
	return total


def evenNumber(number):
	if (number % 2 == 0):
		return "even number"

	else:
		return "not even number"


def squareOF(number):
	return number * number;


def temperatureConverter(celsius):
	fahrenheit = celsius * (9/5) + 32;
	return fahrenheit;


def isprime(number):
	count = 0;
	for index in range(2,number):
		if ( number % index == 0):
			count += 1
	if (count > 2):
		return False

	else:
		return True


def largestOf(firstNumber,secondNumber,thirdNumber):
	largest = firstNumber
	if (secondNumber > firstNumber ):
		largest = secondNumber;

	if (thirdNumber > secondNumber):
		largest = thirdNumber;

	return largest;


def simpleInterestOf(principal,rate, time):
	result = (principal * (rate/100) * time) / 100;
	return result;


def areaOfRectangle(length, width):
	result = length * width
	return result




print(sumOf(2,2))
print(areaOfRectangle(10,10))
print(evenNumber(2))
print(squareOF(2))
print(temperatureConverter(1))
print(largestOf(8,6,5))
print(simpleInterestOf(10000, 4, 5))
print(isprime(7))
