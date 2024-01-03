package Decorator;

class Service implements IService{
    @Override
    public String runSomeThing(){
        return "서비스 짱";
    }
}
