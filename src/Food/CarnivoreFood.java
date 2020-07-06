package Food;

public abstract class CarnivoreFood extends Food {
    String typeCarnivoreFood;

    public String getTypeCarnivoreFood() {
        return typeCarnivoreFood;
    }

    public CarnivoreFood(int weight) {
        super(weight);
    }
}
