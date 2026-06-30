
# Import pandas
import pandas as pd

# Create data dictionary
data = {
    "FirstName": ["Satvik", "Avinash", "Lahri"],
    "LastName": ["Shah", "Kati", "Rath"],
    "Email": ["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],
    "PhoneNumber": ["4537829158", "5892184058", "4528727830"]
}

# Create DataFrame
df = pd.DataFrame(data)

# Print DataFrame
print(df)

# Write DataFrame to Excel file
df.to_excel("sample.xlsx", index=False)
