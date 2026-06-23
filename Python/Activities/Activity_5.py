
# Ask the user for a number
num = int(input("Enter a number: "))

# Generate multiplication table
print(f"\nMultiplication Table of {num}:\n")

for i in range(1, 11):
    print(f"{num} x {i} = {num * i}")
