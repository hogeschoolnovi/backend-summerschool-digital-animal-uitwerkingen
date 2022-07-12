public class DigitalAnimal extends Feed {

    private final String name;
    private final Enum<Species> species;
    private int foodBar;
    private final Enum<Gender> gender;
    private int age;
    private int attentionBar;

    public DigitalAnimal(String name, Enum<Species> species, Enum<Gender> gender) {
        this.name = name;
        this.species = species;
        this.foodBar = 40;
        this.gender = gender;
        this.age = 0;
        this.attentionBar = 40;
    }

    public String getName() {
        return name;
    }

    public Enum<Species> getSpecies() {
        return species;
    }

    public int getFoodBar() {
        return foodBar;
    }

    public Enum<Gender> getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getAttentionBar() {
        return attentionBar;
    }

    public void setFoodBar(int foodBar) {
        this.foodBar = foodBar;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAttentionBar(int attentionBar) {
        this.attentionBar = attentionBar;
    }
}
