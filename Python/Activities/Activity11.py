# Creating a dictionary with fruits and their prices
fruit_prices = {
    "apple": 1.50,
    "banana": 0.75,
    "cherry": 3.00,
    "date": 5.00,
    "elderberry": 7.00,
    "fig": 2.50
}

# Ask the user to input a fruit name
fruit_to_check = input("Enter the fruit you want to check: ").lower()

# Check if the fruit is available in the dictionary
if fruit_to_check in fruit_prices:
    print(f"The price of {fruit_to_check} is ${fruit_prices[fruit_to_check]}")
else:
    print(f"{fruit_to_check.capitalize()} is not available.")
