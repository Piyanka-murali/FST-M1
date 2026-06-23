
# Create a dictionary of fruits and prices
fruit_shop = {
    "apple": 100,
    "banana": 40,
    "orange": 80,
    "mango": 120,
    "grapes": 90
}

# Ask user for a fruit
fruit = input("Enter the fruit name: ").lower()

# Check if fruit is available
if fruit in fruit_shop:
    print(f"Yes, {fruit} is available. Price = {fruit_shop[fruit]}")
else:
    print(f"Sorry, {fruit} is not available.")
