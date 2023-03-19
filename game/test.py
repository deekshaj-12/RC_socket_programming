def display(b1):
    for i in range(3):
        for j in range(3):
            print(b1[i][j], end="")
        print()
    # Other operations on the matrix

# Creating a 2D array (matrix)
my_matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

# Calling the function and passing the matrix as an argument
display(my_matrix)