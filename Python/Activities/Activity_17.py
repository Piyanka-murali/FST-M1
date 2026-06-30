
# Import pandas
import pandas as pd

# Create a dictionary with data
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

# Create DataFrame
df = pd.DataFrame(data)

# Print DataFrame
print(df)

# Write DataFrame to CSV file
df.to_csv("sample.csv", index=False)
