package Proxy;

class ClientWithNoProxy {
    public static void main(String[] args){
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}
