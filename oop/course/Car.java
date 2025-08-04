package pertemuan3.oop.course;

import java.util.*;
public class Car {
    // attribute
    String nameCar;
    protected String brand ;
    int price;

    // method
    protected void drive() {
        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan nama mobil : ");
        brand = i.nextLine();
        System.out.println("Mobil " +brand + " melaju...");
    }
    // Car(String nameCar, String brand){
    //     this.nameCar = nameCar;
    //     this.brand =brand;
    // }

    Car(String text){
        System.out.println(text +" buatan indonesia");
    }

    Car(){ 
        System.out.println("Ini adalah constructor"); 
    } 

    void stop() {
        System.out.println("Mobil berhenti.");
    }

}

/**
 * InnerCar
 */
 class InnerCar {

    public static void main(String[] args) {
        Car car = new Car("mobil smk");
        Car car2 = new Car();
        car.drive();

        car.nameCar = "toyota";
    }

}