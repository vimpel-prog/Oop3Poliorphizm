import java.time.LocalDate;

public class Car extends Transport{
    private final String kuzovType;
    private final int sitsNumbers;
    private float engineVolume;
    private final key key;
    private final insurance insurance;
    private String transmission;
    private String regNumber;
    private boolean winterTires;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, float maxSpeed, float engineVolume, String transmission, String kuzovType, String regNumber, boolean winterTires, int sitsNumbers, Car.key key, Car.insurance insurance) {
        super(brand,model,productionYear,productionCountry,color,maxSpeed);
        this.kuzovType = validValue(kuzovType);
        this.sitsNumbers = Math.max(sitsNumbers, 0);
        this.key = key;
        this.insurance = insurance;
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setRegNumber(regNumber);
        setWinterTires(winterTires);
    }



    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0 ? engineVolume : 0;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validValue(transmission);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = validValue(regNumber);
    }

    public boolean getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public String getKuzovType() {
        return kuzovType;
    }

    public int getSitsNumbers() {
        return sitsNumbers;
    }

    public void information() {
        System.out.println(brand + " " + model + " , сборка " + productionCountry +
                " , цвет кузова — " + getColor() +
                " , объем двигателя — " + engineVolume +
                " л, год выпуска — " + productionYear +
                " коробка передач: " + transmission +
                " тип кузова: " + kuzovType +
                " регистрационный номер: " + regNumber +
                " колличество мест: " + sitsNumbers +
                " резина: " + winterTires);
    }

    public void changeSeasonWheels(Car car) {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth <= 4 || currentMonth >= 11;
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String s = "АВЕКМНОРСТУХ";
        return s.contains("" + symbol);
    }

    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChar = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChar[0]) &&
                isNumber(regNumberChar[1]) &&
                isNumber(regNumberChar[2]) &&
                isNumber(regNumberChar[3]) &&
                isNumberLetter(regNumberChar[4]) &&
                isNumberLetter(regNumberChar[5]) &&
                isNumber(regNumberChar[6]) &&
                isNumber(regNumberChar[7]) &&
                isNumber(regNumberChar[8]);
    }

    @Override
    protected void refill() {
        System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }

    public static class key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    public static class insurance {
        private final LocalDate validUntil;
        private final float price;
        private final String number;

        public insurance(LocalDate validUntil, float price, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.price = Math.max(price, 1.0f);
            this.number = validValue(number);
        }

        public void isValidNumber() {
            if (number.length() != 9) System.out.println("номер страховки не корректный");
        }

        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }
    }
}
