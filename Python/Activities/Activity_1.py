
# Ask user for inputs
name = input("Enter your name: ")
age = int(input("Enter your age: "))

# Get the current year
import datetime
current_year = datetime.datetime.now().year

# Calculate the year when user turns 100
year_when_100 = current_year + (100 - age)

# Print the result
print(f"Hello {name}! You will turn 100 years old in the year {year_when_100}.")
