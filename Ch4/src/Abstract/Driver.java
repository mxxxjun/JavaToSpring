package Abstract;

class Driver {
    public static void main(String[] args){
        Animal[] animals = new Animal[5];

        animals[0] = new Mouse();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Calf();
        animals[4] = new Chick();

        for(Animal a : animals) a.shout();
    }
}
