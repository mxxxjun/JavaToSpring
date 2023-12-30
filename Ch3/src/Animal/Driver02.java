package Animal;

class Driver02 {
    public static void main(String[] args){
        Animal animal = new Animal();
        Animal mammal = new Mammal();
        Animal bird = new Birds();
        Animal whale = new Whale();
        Animal bat = new Bat();
        Animal sparrow = new Sparrow();
        Animal penguin = new Penguin();

        animal.showMe();
        mammal.showMe();
        bird.showMe();
        whale.showMe();
        bat.showMe();
        sparrow.showMe();
        penguin.showMe();
    }
}
