
//Creating objects from the class
//Car is a class that represents a generic car.
//It has two instance variables: brand and speed.
//It has one method: drive(), which describes an action the car can perform.

//A class is like a blueprint 
//An object is a real-world instance of a class
//Objects store data and perform actions

public class Main {

	public static void main(String[] args) {
        Car myCar = new Car();   // Creating an object
        myCar.brand = "Tesla";
        myCar.speed = 100;
        
        myCar.drive();  // Calling a method on the object

	}

}
//Class = Blueprint
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " mph!");
    }
}
