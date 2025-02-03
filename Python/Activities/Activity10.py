# Function to print numbers divisible by 5
def print_divisible_by_5(input_tuple):
    for num in input_tuple:
        if num % 5 == 0:
            print(num)

# Ask the user to input a tuple of numbers
input_str = input("Enter numbers separated by spaces: ")

# Convert the input string to a tuple of integers
input_tuple = tuple(int(i) for i in input_str.split())

# Call the function to print numbers divisible by 5
print("Numbers divisible by 5:")
print_divisible_by_5(input_tuple)
