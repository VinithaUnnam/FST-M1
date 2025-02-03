# Function to generate Fibonacci sequence up to n numbers
def generate_fibonacci(n):
    fib_sequence = []
    a, b = 0, 1
    for _ in range(n):
        fib_sequence.append(b)
        a, b = b, a + b
    return fib_sequence

# Ask the user how many Fibonacci numbers to generate
num = int(input("How many Fibonacci numbers would you like to generate? "))

# Generate the Fibonacci sequence
fibonacci_numbers = generate_fibonacci(num)

# Print the result
print(f"The first {num} Fibonacci numbers are: {fibonacci_numbers}")
