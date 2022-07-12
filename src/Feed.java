public abstract class Feed extends Food{
    public void feedAnimal(DigitalAnimal digitalAnimal, String snack){
        int bar = digitalAnimal.getFoodBar();
        int food = 0;
        if(digitalAnimal.getFoodBar() < 100){
            if( snack.equals("hamburger")){
                food = super.getHamburger();
            } else{
                food = super.getCandy();
            }
            checkThatFoodBarNeverPasses100(bar, food, digitalAnimal);
        }
    }

    public void checkThatFoodBarNeverPasses100(int bar, int food, DigitalAnimal digitalAnimal){
        if(bar + food >= 100){
            digitalAnimal.setFoodBar(100);
        }else {
            digitalAnimal.setFoodBar(bar + food);
        }
    }
}
