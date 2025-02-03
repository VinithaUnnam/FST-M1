import pandas as pd

# Data to be written into the CSV
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

# Creating a DataFrame
df = pd.DataFrame(data)

# Writing the DataFrame to a CSV file
df.to_csv("user_credentials.csv", index=False)

print("CSV file has been created successfully!")
