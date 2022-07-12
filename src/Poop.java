public class Poop {
    public static void poops(DigitalAnimal digitalAnimal){
        int foodStatus = digitalAnimal.getFoodBar();
        digitalAnimal.setFoodBar(foodStatus - 20);
        System.out.println(digitalAnimal.getName() + " has pooped!");
    }
}
