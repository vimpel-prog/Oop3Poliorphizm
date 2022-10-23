package fauna;

public class Birds extends Animals {
    String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt(){

    }
}
