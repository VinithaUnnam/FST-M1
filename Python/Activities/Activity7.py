def sum_of_list(elements):
    return sum(elements)
input_list = input("Enter numbers separated by spaces: ")
num_list = [int(i) for i in input_list.split()]
result = sum_of_list(num_list)
print(f"The sum of the elements in the list is: {result}")
