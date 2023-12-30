package Interface;

class Bat extends Birds implements flyable{
    Bat(){
        myClass = "박쥐";
    }

    @Override
    public void fly(){
        System.out.println(myClass + "  날고 있음.. 슈웅~~~ 슈웅~~~");
    }
}
