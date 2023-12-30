package Polymorphism;

class Driver2 {
    public static void main(String[] args){
        Animal[] animals = new Animal[5];

        animals[0] = new Animal();
        animals[1] = new Mouse();
        animals[2] = new Cat();
        animals[3] = new Dog();
        animals[4] = new Calf();

        for(Animal a : animals) a.showName();
    }
}
