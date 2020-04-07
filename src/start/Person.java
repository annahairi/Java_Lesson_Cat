package start;

import Animal.Cat;
import Animal.Dog;

public class Person {
    public static void hiCat()
    {
        System.out.println("Hi" + ", " + Cat.name);
    }
    public static void changeCatName(String myFavoriteName)
    {
        Cat.name = myFavoriteName;
    }
    public static void playWithDog()
    {
        System.out.println("Let's play!");
        Dog.gaf();
        Dog.getAge();
        Dog.appendYear(20);
        System.out.println("___________________________");
    }

}
