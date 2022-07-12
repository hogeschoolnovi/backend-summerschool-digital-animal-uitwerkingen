public class Main {

    public static void main(String[] args) {

        DigitalAnimal tami = new DigitalAnimal("kees",  Species.DOG,  Gender.MALE );
        System.out.println(tami.getAge());
        System.out.println(tami.getFoodBar());
        tami.feedAnimal(tami, "hamburger");
        System.out.println(tami.getFoodBar());
        tami.feedAnimal(tami, "candy");
        System.out.println(tami.getFoodBar());
        Poop.poops(tami);
        System.out.println(tami.getFoodBar());
    }
}
