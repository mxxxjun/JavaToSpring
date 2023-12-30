package Animal;

class Driver01 {
    public static void main(String[] args){
        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Birds bird = new Birds();
        Whale whale = new Whale();
        Bat bat = new Bat();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        animal.showMe();
        mammal.showMe();
        bird.showMe();
        whale.showMe();
        bat.showMe();
        sparrow.showMe();
        penguin.showMe();
    }
}
