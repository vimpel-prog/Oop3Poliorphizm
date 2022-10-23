package fauna;

import java.util.Objects;

public class Zemno extends Animals{
    String livingEnvironment;

    public Zemno(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zemno zemno = (Zemno) o;
        return Objects.equals(livingEnvironment, zemno.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }

    @Override
    public String toString() {
        return "Zemno{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
