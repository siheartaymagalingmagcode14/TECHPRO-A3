package Quarter3.Seatwork2;

class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Beep beep!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}