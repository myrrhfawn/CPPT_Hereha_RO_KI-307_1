package lab1;
import java.io.*;
import java.util.Scanner;


/**
* Клас Lab1HerehaKI307 реалізує програму згідно варіанту 6 до лабораторної роботи №1
*/
public class Lab1HerehaKI307 {
	
	/**
	* Статичний метод main є точкою входу в програму
	*
	*@author Hereha Rostyslav
	* @param args
	* @throws FileNotFoundException
	*
	*/
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір квадратної матриці: ");
        int matrixSize = scanner.nextInt();

        // Перевірка, чи введено коректний розмір матриці
        if (matrixSize <= 0) {
            System.out.println("Некоректний розмір матриці. Програма завершує роботу.");
            return;
        }

        System.out.println("Введіть символ-заповнювач: ");
        char fillCharacter = scanner.next().charAt(0);
        
        int fillCounter = 0;
        int step = 1;
        // Створення та заповнення зубчатого масиву
        char[][] jaggedArray = new char[matrixSize][];
        for (int i = 0; i < matrixSize; i++) {
            jaggedArray[i] = new char[matrixSize];
            for (int j = 0; j < matrixSize; j++) {
            	if(j <= fillCounter) {
                	jaggedArray[i][j] = fillCharacter;

            	}
            	if(j >= matrixSize - fillCounter - 1) {
            		jaggedArray[i][j] = fillCharacter;
            	}
            	if (fillCounter == matrixSize/2) {
            		step = -1;
            	}
            }
        	fillCounter = fillCounter + step;
        }

        // Виведення масиву на екран
        System.out.println("Згенерований зубчатий масив:");
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Запис масиву у текстовий файл
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    writer.print(jaggedArray[i][j] + " ");
                }
                writer.println();
            }
            System.out.println("Масив був записаний у файл 'output.txt'.");
        } catch (IOException e) {
            System.out.println("Помилка при записі у файл.");
            e.printStackTrace();
        }
    }

}