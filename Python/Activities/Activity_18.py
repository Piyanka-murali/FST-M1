
import pandas as pd

# Read the CSV file
df = pd.read_csv("sample.csv")

# Print entire DataFrame
print("Full Data:\n", df)

# ✅ 1. Print only Usernames column
print("\nUsernames column:")
print(df["Usernames"])

# ✅ 2. Print second row (index = 1)
print("\nSecond row (username and password):")
print(df.iloc[1])

# ✅ 3. Sort Usernames in ascending order
print("\nSorted by Usernames (Ascending):")
print(df.sort_values("Usernames"))

# ✅ 4. Sort Passwords in descending order
print("\nSorted by Passwords (Descending):")
print(df.sort_values("Passwords", ascending=False))
