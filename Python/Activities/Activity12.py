# Recursive function to calculate the sum of numbers from 0 to n
def sum_recursive(n):
    # Base case: when n is 0, return 0
    if n == 0:
        return 0
    else:
        # Recursive case: sum of numbers from 0 to n is n + sum of numbers from 0 to n-1
        return n + sum_recursive(n - 1)

# Calculate the sum of numbers from 0 to 10
result = sum_recursive(10)

# Print the result
print(f"The sum of numbers from 0 to 10 is: {result}")
