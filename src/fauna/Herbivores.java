package fauna;

import java.util.Objects;

public class Herbivores extends Mleko {
    String foodType;

    public Herbivores(String name, int age, String livingEnvironment, int velocity, String foodType) {
        super(name, age, livingEnvironment, velocity);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    public void graze(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(foodType, that.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "foodType='" + foodType + '\'' +
                '}';
    }
}
