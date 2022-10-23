package fauna;

import java.util.Objects;

public class Predators extends Mleko {
    String foodType;

    public Predators(String name, int age, String livingEnvironment, int velocity, String foodType) {
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

    public void hunt(){

    }

    @Override
    public String toString() {
        return "Predators{" +
                "foodType='" + foodType + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", velocity=" + velocity +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators predators = (Predators) o;
        return Objects.equals(foodType, predators.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodType);
    }
}
