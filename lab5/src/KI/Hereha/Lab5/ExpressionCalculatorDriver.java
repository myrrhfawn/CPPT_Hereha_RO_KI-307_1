package KI.Hereha.Lab5;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import KI.Hereha.Lab5.ExpressionCalculator;
import KI.Hereha.Lab5.ResultFileManager;

public class ExpressionCalculatorDriver {
	/**
	* @param args
	*/
    public static void main(String[] args) {
    	
        try (Scanner scanner = new Scanner(System.in)) {
        	System.out.println("Введіть x: ");
     		double x = scanner.nextInt();
            double result = ExpressionCalculator.calculateExpression(x); // Приклад виклику з обчисленням для x=45 градусів
            System.out.println("Результат обчислень: y = " + result);
            ExpressionCalculator.writeResultToFile(result);
            
            ResultFileManager.writeResultToTextFile(result, "result.txt");

            // Запис результату у двійковий файл
            ResultFileManager.writeResultToBinaryFile(result, "result.dat");

            // Читання результату з текстового файлу
            double textResult = ResultFileManager.readResultFromTextFile("result.txt");
            System.out.println("Прочитаний результат з текстового файлу: " + textResult);

            // Читання результату з двійкового файлу
            double binaryResult = ResultFileManager.readResultFromBinaryFile("result.dat");
            System.out.println("Прочитаний результат з двійкового файлу: " + binaryResult);
            
        } catch (ArithmeticException e) {
        	// Блок перехоплює помилки обчислень виразу
            System.err.println("Помилка обчислень: " + e.getMessage());
        } catch (IOException e) {
        	// Блок перехоплює помилки запису в файл
            System.err.println("Помилка запису до файлу: " + e.getMessage());
        } catch (InputMismatchException e) {
        	// Блок перехоплює помилки з неправильним вводом х
            System.err.println("Помилка неправильний тип введених даних: " + e.getMessage());
        } catch (Exception e) {
        	// Блок перехоплює інші помилки
            System.err.println("Помилка: " + e);
        }
        
    }
}