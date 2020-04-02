package start;

import Animal.Cat;

public class Main {

    public static void main(String[] args) {
   //     System.out.println(Cat.weight);

      //  Cat.weight = 21323;
        int currentCatWeight = Cat.showWeight();
     //   System.out.println(currentCatWeight);

       System.out.println(Cat.showWeight());

        System.out.println();
        Person.hiCat();
        Person.changeCatName("Мурка");
        Person.hiCat();
        Cat.drink();
        Cat.eat(3);
        Cat.walk();
    }
}
