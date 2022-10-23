public abstract class Transport {
    protected String brand;
    protected String model;
    protected int productionYear;
    protected String productionCountry;
    protected String color;
    protected float maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, float maxSpeed) {
        this.brand = validValue(brand);
        this.model = validValue(model);
        this.productionYear = Math.max(productionYear,1);
        this.productionCountry = validValue(productionCountry);
        this.color = validValue(color);
        this.maxSpeed = Math.max(maxSpeed,1);
    }

    public Transport() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color!=null&&!color.isBlank()) {
            this.color = color;
        }
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed,1);
    }
    protected static String validValue(String name) {
        if (name != null && !name.isBlank()) {
            return name;
        } else {
            return "не указано";
        }
    }

    protected abstract void refill();
}
