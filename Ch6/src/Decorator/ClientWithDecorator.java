package Decorator;

class ClientWithDecorator {
    public static void main(String[] args){
        IService decorator = new Decorator();
        System.out.println(decorator.runSomeThing());
    }
}
