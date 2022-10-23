import fauna.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car mers = new Car("Mercedes",
                "benz",
                2005,
                "Germany",
                "Yello",220f,
                2.8f,
                "hand",
                "sedan",
                "a123bb123",
                false,
                5,
                new Car.key(true,
                        false),
                new Car.insurance(LocalDate.now().plusYears(2),
                        1500f,
                        "12345"));
        mers.information();

        Train lastocka = new Train("Ласточка","B-901",2011,"Russia","",301,3500,0,"Belarus RailwayStation","Minsk-Passenger",11);
        Train leningrad = new Train("Ленинград","D-125",2019,"Russia","",270,1700,0,"Leningrad RailwayStation","Leningrad-Passenger",8);
        System.out.println(lastocka.toString());
        System.out.println(leningrad.toString());

        Bus bus1 = new Bus("BMW","f3",2008,"RF","Yello",140);
        System.out.println(bus1.toString());
        bus1.refill();
        lastocka.refill();
        mers.refill();

        Herbivores gazel = new Herbivores("Gazel", 3, "forest", 40, "grass");
        Herbivores ziraph = new Herbivores("Raphik", 5, "tropici", 20, "grass");
        Herbivores horse = new Herbivores("Gvidon", 4, "Ferma", 35, "seno");

        Predators giena = new Predators("Giena", 1, "pustina", 28, "meat");
        Predators tiger = new Predators("Tigra", 6, "pustina", 45, "meat");
        Predators bear = new Predators("Misha", 7, "forest", 35, "meat");

        Zemno frog = new Zemno("Jaba", 2,"boloto");
        Zemno uzh = new Zemno("udav", 8, "forest");

        NonFlyings pavlin = new NonFlyings("Pavlin", 3, "forest","hodit");
        NonFlyings pingvin = new NonFlyings("Pingvin", 2, "forest","hodit");
        NonFlyings dodo = new NonFlyings("Ptica Dodo", 1, "forest","hodit");

        Flyings chayka = new Flyings("Chayka", 3, "sky", "fly");
        Flyings albatros = new Flyings("Albatros", 2, "sky", "fly");
        Flyings sokol = new Flyings("Sokol", 1, "sky", "fly");

        System.out.println(pavlin);

    }
}