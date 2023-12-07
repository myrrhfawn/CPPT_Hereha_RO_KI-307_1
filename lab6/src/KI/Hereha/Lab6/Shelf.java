package KI.Hereha.Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Параметризований клас, що реалізує предметну область "Шафа".
 * @param <T> Тип елементів, які можна розміщувати у шафі
 */
public class Shelf<T extends Comparable<T>> {
    private List<T> items;

    /**
     * Конструктор класу
     */
    public Shelf() {
        this.items = new ArrayList<>();
    }

    /**
     * Розміщення елемента у шафі.
     * @param item Елемент для розміщення
     */
    public void placeItem(T item) {
        items.add(item);
    }

    /**
     * Виймання мінімального елемента з шафи.
     * @return Мінімальний елемент
     */
    public T takeMinItem() {
        if (items.isEmpty()) {
            throw new IllegalStateException("Шафа порожня");
        }

        T minItem = Collections.min(items);
        items.remove(minItem);
        return minItem;
    }

    /**
     * Виймання максимального елемента з шафи.
     * @return Максимальний елемент
     */
    public T takeMaxItem() {
        if (items.isEmpty()) {
            throw new IllegalStateException("Шафа порожня");
        }

        T maxItem = Collections.max(items);
        items.remove(maxItem);
        return maxItem;
    }

    /**
     * Отримання усіх елементів у шафі.
     * @return Список елементів
     */
    public List<T> getAllItems() {
        return new ArrayList<>(items);
    }
}