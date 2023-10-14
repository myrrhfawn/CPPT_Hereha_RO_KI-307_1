package KI307.Hereha.Lab4;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
* Клас <code>ExpressionCalculatorDriver</code> драйвер для обчислення виразу tan(x)/sin(2x)
* @author Rostyslav Hereha
* @version 1.0
*/
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