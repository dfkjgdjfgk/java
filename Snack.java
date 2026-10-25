package maayan;

public class Snack {
    private String name;
    private int weight;
    private double price;
    private int rank; // 1-5

    // פעולה בונה
    public Snack(String name, int weight, double price, int rank) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.rank = rank;
    }

    // פעולות Getters
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getRank() {
        return rank;
    }

    // פעולות Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    // פעולה לתיאור העצם
    public String toString() {
        return "Snack [Name: " + name + ", Weight: " + weight + "g, Price: " + price + "₪, Rank: " + rank + "]";
    }

    // פעולה המושווה משקל בין החטיף הנוכחי לחטיף נוסף
    public boolean hasSameWeight(Snack other) {
        if (other == null) {
            return false;
        }
        return this.weight == other.getWeight();
    }
}
