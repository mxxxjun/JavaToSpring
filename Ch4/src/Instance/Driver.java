package Instance;

class Driver {
    public static void main(String[] args){
        Animal animal = new Animal();
        Birds bird = new Birds();
        Penguin penguin = new Penguin();

        System.out.println(animal instanceof Animal);

        System.out.println(bird instanceof Animal);
        System.out.println(bird instanceof Birds);

        System.out.println(penguin instanceof Animal);
        System.out.println(penguin instanceof Birds);
        System.out.println(penguin instanceof Penguin);
    }
}
