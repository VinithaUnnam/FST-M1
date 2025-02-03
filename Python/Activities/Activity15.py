try:
    # Intentionally cause a NameError by referencing an undefined variable
    print(undeclared_variable)
except NameError as e:
    # Handle the NameError by printing a message
    print(f"Error: {e}")

# Program continues after handling the error
print("The program continues running after handling the error.")
