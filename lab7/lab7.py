def main():
    matrix_size = int(input("Введіть розмір квадратної матриці: "))

    # Перевірка, чи введено коректний розмір матриці
    if matrix_size <= 0:
        print("Некоректний розмір матриці. Програма завершує роботу.")
        return
    fill_character = input("Введіть символ-заповнювач: ")[0]
    matrix = []
    pos = 0
    for i in range(matrix_size):
        row = []
        if i >= matrix_size / 2:
            if i != matrix_size / 2:
                pos = pos - 1
        else:
            pos = pos + 1
        for j in range(matrix_size):
            if j < pos or j > matrix_size - pos - 1:
                row.append(fill_character)
        matrix.append(row)
    pos = 0
    for i in range(matrix_size):
        if i >= matrix_size / 2:
            if i != matrix_size / 2:
                pos = pos - 1
        else:
            pos = pos + 1
        for j in range(matrix_size):
            if j < pos or j > matrix_size - pos - 1:
                print(f"{fill_character} ", end="")
            else:
                print("  ", end="")
        print("")

if __name__ == "__main__":
    main()