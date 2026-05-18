import random

count = 0; 
user_input = 0;
random_guess = random.randrange(101)

while(True):
	user_input = int(input("Enter a number: "))

	if (user_input < 1 or user_input > 100):
		print("Please enter a number between 1 and 100");
		continue;
	else:
		count += 1;
		if (random_guess < user_input):
			print("lower - Try again")

		if (random_guess > user_input) :
			print("Higher - Try again")

		if (random_guess == user_input or count == 5):
			break;



print("============FINAL SUMMARY============");
print("The correct number is: " , random_guess);
print("The number of attempts is: " , count);

if (random_guess == user_input and count == 1):
	print("your rating is: Legendary");
elif (random_guess == user_input and count == 2):
	print("your rating is: Excellent");
elif (random_guess == user_input and count == 3 or count == 4):
	print("your rating is: Good");
elif (random_guess == user_input and count == 5):
	print("your rating is: Close!");
else :
	print("No win = Better luck");


print("=====================================");
