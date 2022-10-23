package fauna;
public abstract class Animals {
    String name;
    int age;

    public Animals(String name, int age) {
        this.name = name!=null&&!name.isBlank() ? name : "default";
        this.age = Math.max(age,0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat(){

    }
    public void sleep(){

    }
    public void move(){

    }
}
