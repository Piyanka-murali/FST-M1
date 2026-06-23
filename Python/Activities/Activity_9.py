
# Two lists
list1 = [10, 15, 20, 25, 30]
list2 = [5, 8, 13, 22, 40]

# New list
result = []

# Add odd numbers from list1
for num in list1:
    if num % 2 != 0:
        result.append(num)

# Add even numbers from list2
for num in list2:
    if num % 2 == 0:
        result.append(num)

# Print result
print("New list:", result)
