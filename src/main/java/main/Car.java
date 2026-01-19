//Nimi: Aida Liukkonen
//Päivämäärä: 19.1.2026
//Tehtävä: viikko2

package main;

public class Car {
    private String brand;
    private String model;
    private int speed;

    //Oletusrakentaja
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }
    // Status
    public void status() {
        System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed + " km/h");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Kiihdytys
    public void accelerate(int amount) {
        speed += amount;
    }

    // Hidastus
    public void decelerate(int amount) {
        if (amount >= speed) {
            speed = 0;
        } else {
            speed -= amount;
        }
    }


    
}
