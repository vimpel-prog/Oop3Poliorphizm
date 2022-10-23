package fauna;

import java.util.Objects;

public class NonFlyings extends Birds {
    String moveType;

    public NonFlyings(String name, int age, String livingEnvironment, String moveType) {
        super(name, age, livingEnvironment);
        this.moveType = moveType;
    }

    public String getMoveType() {
        return moveType;
    }

    public void walk() {

    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public String toString() {
        return "NonFlyings{" +
                "moveType='" + moveType + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonFlyings that = (NonFlyings) o;
        return Objects.equals(moveType, that.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moveType);
    }
}
