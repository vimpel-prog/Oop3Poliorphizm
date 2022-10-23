public class Train extends Transport{
    private double ticketPrice;
    private int travelTimeMinutes;
    private String startStation;
    private String finishStation;
    private int carCount;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, float maxSpeed, double ticketPrice, int travelTimeMinutes, String startStation, String finishStation, int carCount) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.ticketPrice = Math.max(ticketPrice,1);
        this.travelTimeMinutes = Math.max(travelTimeMinutes,1);
        this.startStation = validValue(startStation);
        this.finishStation = validValue(finishStation);
        this.carCount = Math.max(carCount,1);
    }

    @Override
    public String toString() {
        return "Train{" +
                "ticketPrice=" + ticketPrice +
                ", travelTimeMinutes=" + travelTimeMinutes +
                ", startStation='" + startStation + '\'' +
                ", finishStation='" + finishStation + '\'' +
                ", carCount=" + carCount +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    protected void refill() {
        System.out.println("нужно заправлять дизелем");
    }
}
