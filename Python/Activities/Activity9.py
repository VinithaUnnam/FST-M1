# Function to create a new list with odd numbers from the first list and even numbers from the second list
def create_new_list(list1, list2):
    # Get odd numbers from the first list
    odd_from_first_list = [num for num in list1 if num % 2 != 0]
    
    # Get even numbers from the second list
    even_from_second_list = [num for num in list2 if num % 2 == 0]
    
    # Combine both lists
    new_list = odd_from_first_list + even_from_second_list
    
    return new_list

# Example lists
list1 = [1, 2, 3, 4, 5, 6]
list2 = [7, 8, 9, 10, 11, 12]

# Create the new list
new_list = create_new_list(list1, list2)

# Print the result
print("New list containing odd numbers from the first list and even numbers from the second list:")
print(new_list)
