package Encapsulation;

class EncapsulationCar {
    private String brand;
    private String model;
    private int year;

    public EncapsulationCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Starting the engine of the " + brand + " " + model);
    }
}
class Main3 {
    public static void main(String[] args) {
        EncapsulationCar car = new EncapsulationCar("Maruthi Suzuki","Swift",2018);

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        car.setYear(2022);
        System.out.println("Updated Year: " + car.getYear());

        car.startEngine();
    }
}
