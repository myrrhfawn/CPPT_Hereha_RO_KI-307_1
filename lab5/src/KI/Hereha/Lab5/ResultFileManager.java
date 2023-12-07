package KI.Hereha.Lab5;
import java.io.*;

public class ResultFileManager {

    /**
     * Запис результату у текстовий файл.
     * @param result Результат обчислень
     * @param fileName Ім'я файлу
     * @throws IOException Виникає у випадку помилки запису у файл
     */
    public static void writeResultToTextFile(double result, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Результат обчислень: y = " + result);
        }
    }

    /**
     * Читання результату з текстового файлу.
     * @param fileName Ім'я файлу
     * @return Результат обчислень
     * @throws IOException Виникає у випадку помилки читання з файлу
     */
    public static double readResultFromTextFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            // Видаліть всі символи, що не є цифрами або крапкою
            line = line.replaceAll("[^\\d.]", "");
            return Double.parseDouble(line);
        }
    }

    /**
     * Запис результату у двійковий файл.
     * @param result Результат обчислень
     * @param fileName Ім'я файлу
     * @throws IOException Виникає у випадку помилки запису у файл
     */
    public static void writeResultToBinaryFile(double result, String fileName) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeDouble(result);
        }
    }

    /**
     * Читання результату з двійкового файлу.
     * @param fileName Ім'я файлу
     * @return Результат обчислень
     * @throws IOException Виникає у випадку помилки читання з файлу
     */
    public static double readResultFromBinaryFile(String fileName) throws IOException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return inputStream.readDouble();
        }
    }
}
