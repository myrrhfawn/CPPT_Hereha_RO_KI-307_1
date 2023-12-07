import math
import pickle


def calculate_expression(x):
    try:
        result = math.tan(x) / math.sin(2 * x)
        return result
    except ZeroDivisionError:
        print("Error: sin(2x) is undefined when tan(x) = 0.")
        return None


def save_to_text_file(filename, data):
    with open(filename, 'w') as file:
        for item in data:
            file.write(str(item) + '\n')


def save_to_binary_file(filename, data):
    with open(filename, 'wb') as file:
        pickle.dump(data, file)


def read_from_text_file(filename):
    data = []
    try:
        with open(filename, 'r') as file:
            for line in file:
                data.append(float(line.strip()))
    except FileNotFoundError:
        print(f"Error: File '{filename}' not found.")
    return data


def read_from_binary_file(filename):
    data = []
    try:
        with open(filename, 'rb') as file:
            data = pickle.load(file)
    except FileNotFoundError:
        print(f"Error: File '{filename}' not found.")
    return data


if __name__ == "__main__":
    x = float(input("Enter x:"))
    res = calculate_expression(x)
    print(f"result: {res}")
    x_values = [0.1, 0.2, 0.3, 0.4, 0.5]
    print(f"x_values: {x_values}")

    results = [calculate_expression(x) for x in x_values]
    print(f"results: {results}")
    save_to_text_file("results.txt", results)
    save_to_binary_file("results.dat", results)

    text_data = read_from_text_file("results.txt")
    binary_data = read_from_binary_file("results.dat")

    print("Results from text file:", text_data)
    print("Results from binary file:", binary_data)