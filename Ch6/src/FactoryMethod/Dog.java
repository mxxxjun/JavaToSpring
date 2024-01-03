package FactoryMethod;

class Dog extends Animal{
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
