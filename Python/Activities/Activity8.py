def is_first_last_same(numbers):
    return numbers[0] == numbers[-1] if numbers else False  
input_list = input("Enter numbers separated by spaces: ")
num_list = [int(i) for i in input_list.split()]
result = is_first_last_same(num_list)
if result:
    print("True: The first and last number are the same.")
else:
    print("False: The first and last number are not the same.")
