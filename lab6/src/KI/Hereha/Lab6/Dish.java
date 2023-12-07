package KI.Hereha.Lab6;

/**
 * Клас для предметів, які розміщуються у шафі.
 */
public class Dish implements Comparable<Dish> {
    private String name;
    private double weight;

    public Dish(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Dish other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}