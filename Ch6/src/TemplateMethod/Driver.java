package TemplateMethod;

class Driver {
    public static void main(String[] args){
        Animal bolt = new DogPattern();
        Animal kitty = new CatPattern();

        bolt.playWithOwner();

        System.out.println();
        System.out.println();

        kitty.playWithOwner();
    }
}
