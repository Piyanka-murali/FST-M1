
import pandas as pd

# Read the Excel file
df = pd.read_excel("sample.xlsx")

# Print full data
print("Full Data:\n", df)

# ✅ 1. Print number of rows and columns
print("\nNumber of rows and columns:", df.shape)

# ✅ 2. Print only Email column
print("\nEmails column:")
print(df["Email"])

# ✅ 3. Sort by FirstName (Ascending)
print("\nSorted by FirstName (Ascending):")
print(df.sort_values("FirstName"))