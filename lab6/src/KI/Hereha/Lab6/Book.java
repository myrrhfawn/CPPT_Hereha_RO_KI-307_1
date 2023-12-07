package KI.Hereha.Lab6;

/**
 * Клас для предметів, які розміщуються у шафі.
 */
public class Book implements Comparable<Book> {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.pageCount, other.pageCount);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}