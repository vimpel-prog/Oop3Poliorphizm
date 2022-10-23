package fauna;

import java.util.Objects;

public class Flyings extends Birds {
    String moveType;

    public Flyings(String name, int age, String livingEnvironment, String moveType) {
        super(name, age, livingEnvironment);
        this.moveType = moveType;
    }

    public String getMoveType() {
        return moveType;
    }

    public void fly(){

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flyings flyings = (Flyings) o;
        return Objects.equals(moveType, flyings.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moveType);
    }

    @Override
    public String toString() {
        return "Flyings{" +
                "moveType='" + moveType + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



