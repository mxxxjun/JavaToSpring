package Animal;

class Driver03 {
    public static void main(String[] args){
        Animal[] animals = new Animal[7];
        animals[0] = new Animal();
        animals[1] = new Mammal();
        animals[2] = new Birds();
        animals[3] = new Whale();
        animals[4] = new Bat();
        animals[5] = new Sparrow();
        animals[6] = new Penguin();

        for(Animal animal : animals) animal.showMe();
    }
}
