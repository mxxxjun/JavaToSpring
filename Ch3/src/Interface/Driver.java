package Interface;

class Driver {
    public static void main(String[] args){
        flyable fly1 = new Bat();
        fly1.fly();

        flyable fly2 = new Sparrow();
        fly2.fly();

        swimmable[] swimmables = new swimmable[2];

        swimmables[0] = new Whale();
        swimmables[1] = new Penguin();

        for(swimmable swim : swimmables) swim.swim();
    }
}
