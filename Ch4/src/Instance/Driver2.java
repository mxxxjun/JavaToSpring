package Instance;

class Driver2 {
    public static void main(String[] args){
        Flyable bat = new Bat();
        Flyable sparrow = new Sparrow();

        System.out.println(bat instanceof Flyable);
        System.out.println(bat instanceof Bat);

        System.out.println(sparrow instanceof Flyable);
        System.out.println(sparrow instanceof Sparrow);
    }
}
