package fauna;

public class Mleko extends Animals{
    String livingEnvironment;
    int velocity;

    public Mleko(String name, int age, String livingEnvironment, int velocity) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.velocity = velocity;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getVelocity() {
        return velocity;
    }

    public void walk(){

    }
}
