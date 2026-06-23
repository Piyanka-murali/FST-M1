
# Ask user to enter numbers separated by space
user_input = input("Enter numbers separated by space: ")

# Convert input string into a list of integers
numbers = list(map(int, user_input.split()))

# Calculate sum
total = sum(numbers)

# Print result
print("The sum of the list is:", total)

