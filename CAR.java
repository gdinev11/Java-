public class CAR {
    int year;
    String brand;
    int maxSpeed;

    public CAR()
    {
//        this.year = 2020;
//        this.brand = "BMW";
//        this.maxSpeed = 180;
    }
    public CAR(int year, String brand, int maxSpeed)
    {
        this.year = year;
        this.brand = brand;
        this.maxSpeed = maxSpeed;

    }
    public void printCar()
    {
        System.out.println("Year: " + year);
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed);
    }

    public int getYear() {
        return this.year;
    }

    public String getBrand() { return this.brand; }

    public int getMaxSpeed() { return this.maxSpeed; }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
