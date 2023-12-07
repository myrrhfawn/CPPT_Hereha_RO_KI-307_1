package KI.Hereha.Lab6;

import java.util.List;

public class ShelfDriver {
    public static void main(String[] args) {
        // Створення шафи для книг
        Shelf<Book> bookShelf = new Shelf<>();

        // Розміщення книг у шафі
        bookShelf.placeItem(new Book("Java Programming", 300));
        bookShelf.placeItem(new Book("Data Structures", 250));

        // Вивід усіх книг у шафі
        System.out.println("Книги у шафі:");
        List<Book> allBooks = bookShelf.getAllItems();
        for (Book book : allBooks) {
            System.out.println(book);
        }

        // Виймання мінімальної кількості сторінок
        Book minPageCountBook = bookShelf.takeMinItem();
        System.out.println("Мінімальна кількість сторінок: " + minPageCountBook.getPageCount());

        // Створення шафи для посуду
        Shelf<Dish> dishShelf = new Shelf<>();

        // Розміщення посуду у шафі
        dishShelf.placeItem(new Dish("Plate", 0.5));
        dishShelf.placeItem(new Dish("Cup", 0.3));

        // Вивід усього посуду у шафі
        System.out.println("Посуд у шафі:");
        List<Dish> allDishes = dishShelf.getAllItems();
        for (Dish dish : allDishes) {
            System.out.println(dish);
        }

        // Виймання максимальної ваги
        Dish maxWeightDish = dishShelf.takeMaxItem();
        System.out.println("Максимальна вага посуду: " + maxWeightDish.getWeight());
    }
}