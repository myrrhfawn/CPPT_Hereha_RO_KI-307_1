package KI.Hereha.Lab5;

import java.io.FileWriter;
import java.io.IOException;

public class ExpressionCalculator {
	// функція для обчислення виразу
    public static double calculateExpression(double x) {
        double tanX = Math.tan(x);
        double sin2X = Math.sin(2 * x);

        if (sin2X == 0) {
        	// створимо виключення вищого рівня з поясненням причини
            throw new ArithmeticException("Ділення на нуль: sin(2x) = 0");
        }

        return tanX / sin2X;
    }

    public static void writeResultToFile(double result) throws IOException {
        try (FileWriter writer = new FileWriter("result.txt")) {
            writer.write("Результат обчислень: y = " + result);
        }
    }
}
