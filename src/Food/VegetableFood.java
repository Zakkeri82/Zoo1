package Food;

public abstract class VegetableFood extends Food {
    String typeVegetableFood;

    public String getTypeVegetableFood() {
        return typeVegetableFood;
    }

    public VegetableFood(int weight) {
        super(weight);
    }
}
