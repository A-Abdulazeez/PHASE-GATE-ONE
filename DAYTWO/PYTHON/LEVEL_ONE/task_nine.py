user_input = int(input("Enter price of the item: "))

taxOnItem = (10/100) * user_input
taxAdded = taxOnItem + user_input

print("The tax added is: " , taxAdded)
