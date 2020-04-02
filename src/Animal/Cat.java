package Animal;

public class Cat {
  private static int weight = 100;
  public static String name = "Barsik";

    public static void drink() {
        System.out.println("Cat drink");
    }

    public static void eat(int countTimes) {
        int a = 0;
        for (int i = 0; i < countTimes; i++)
        {

       //     int b;
       //     b = 11;
      //      System.out.println(b);
            System.out.println("Cat eat " + " Current weight " + weight);
            weight = weight + 1;
        }
    }
    public static int showWeight()
    {
        return weight;
     //   System.out.println(weight);
    }
    public static void walk()
    {
        System.out.println("Cat walks");
    }
}