
try:
    raise NameError("This is a custom NameError")

except NameError:
    print("A NameError occurred! The variable is not defined.")

print("Program is still running successfully.")
