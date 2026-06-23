
# Recursive function to calculate sum from 0 to n
def recursive_sum(n):
    if n == 0:   # Base case
        return 0
    else:
        return n + recursive_sum(n - 1)

# Call the function for numbers from 0 to 10
result = recursive_sum(10)

# Print result
print("Sum from 0 to 10 is:", result)
