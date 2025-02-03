import pandas as pd

# Reading the Excel file
df = pd.read_excel('contacts.xlsx')  # Make sure 'contacts.xlsx' is the path to your file

# 1. Print the number of rows and columns
rows, columns = df.shape
print(f'Number of rows: {rows}, Number of columns: {columns}')

# 2. Print the data in the Emails column only
print("\nData in the Emails column:")
print(df['Email'])

# 3. Sort the data based on FirstName in ascending order and print the data
sorted_df = df.sort_values('FirstName', ascending=True)
print("\nData sorted by FirstName in ascending order:")
print(sorted_df)
