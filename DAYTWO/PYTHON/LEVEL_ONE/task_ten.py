average_of_numbers = 0;
sum_of_numbers = 0;
count = 0;
for loop in range(3):
	user_input = int(input("Enter your number: "))
	sum_of_numbers += user_input
	count += 1;
	average_of_numbers = sum_of_numbers / count

print("The average is: " , average_of_numbers)
