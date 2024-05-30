/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cw.zoosystem;

/**
 *
 * @author ADMIN
 */
public class ZooSystem {

    public static void main(String[] args) {
        Animal lion = new Lion("Leo", 5);
        Animal elephant = new Elephant("Ella", 10);
        Animal monkey = new Monkey("Momo", 3);

        // Demonstrate polymorphism
        System.out.println("\nLion");
        lion.makeSound();
        lion.eat();
        lion.makeSound(3);
        lion.eat("meat");

        System.out.println("\n Elephant");
        elephant.makeSound();
        elephant.eat();
        elephant.makeSound(2);
        elephant.eat("grass");
        
        System.out.println("\nMonkey");
        monkey.makeSound();
        monkey.eat();
        monkey.makeSound(4);
        monkey.eat("bananas");

        // You can also use polymorphism to handle these animals in a more generic way
        Animal[] zooAnimals = { lion, elephant, monkey };
        for (Animal animal : zooAnimals) {
            animal.makeSound();
            animal.eat();
        }
    }
}

    

