package FactoryMethod;

class Cat extends Animal{
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
