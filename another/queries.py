import pandas as pd

# Load the extracted CSV file
file_path =  r"c:\Users\lives\Downloads\Goods Items HSN and Rates.csv"  # Replace with the path to your extracted file
data = pd.read_csv( r"c:\Users\lives\Downloads\Goods Items HSN and Rates.csv")

# Define the SQL table name
table_name = "HSNDetails"

# Generate SQL INSERT statements
with open("insert_queries.sql", "w") as file:
    for _, row in data.iterrows():
        query = f"""
        INSERT INTO {table_name} (item_code, item_name, item_type, gst_percentage, hsn_code, gst_value)
        VALUES ('{row['Item Code']}', '{row['Item Name']}', '{row['Item Type']}', {row['GST %e']}, '{row['HSN Code']}', '{row['GST %']}');
        """
        file.write(query)

print("SQL queries have been generated and saved to 'insert_queries.sql'")