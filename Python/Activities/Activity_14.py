
# Recursive function to get Fibonacci number
def fibonacci(n):
    if n <= 2:
        return 1   # Base case
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

# Ask user how many numbers to generate
count = int(input("How many Fibonacci numbers do you want? "))

# Generate and print Fibonacci sequence
print("Fibonacci sequence:")

for i in range(1, count + 1):
    print(fibonacci(i), end=" ")
