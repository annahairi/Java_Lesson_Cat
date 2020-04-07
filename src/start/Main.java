package start;

import Animal.Cat;
import Animal.Dog;

public class Main {

    public static void main(String[] args) {


    /** temp **/
//  System.out.println(Cat.weight);
//  Cat.weight = 21323;
//  System.out.println(currentCatWeight);

    /** cat methods calling**/
        //cat's weight
        int currentCatWeight = Cat.showWeight();
        System.out.println(Cat.showWeight());

        // person's actions with the cat
        System.out.println("Person:");
        System.out.println("________________________");
        Person.hiCat();
        Person.changeCatName("Мурка");
        Person.hiCat();
        System.out.println("________________________");

        //cat drinks
        Cat.drink();
        System.out.println("________________________");

        //cat eats
        Cat.eat(3);
        System.out.println("________________________");

        //cat walks
        Cat.walk();
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");

        /**dog methods calling**/
        //dog is barking
        System.out.println("Dog's methods:");
        Dog.gaf();

        //getting dog's age
        System.out.println("________________________");
        Dog.getAge();

        //increasing of dog's age
        System.out.println("________________________");
        Dog.appendYear(5);

        //person's actions
        System.out.println("________________________");
        System.out.println("Person:");
        Person.playWithDog();
    }
}
