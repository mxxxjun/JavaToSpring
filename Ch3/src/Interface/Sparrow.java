package Interface;

class Sparrow extends Birds implements  flyable{
    Sparrow(){
        myClass = "참새";
    }

    @Override
    public void fly(){
        System.out.println(myClass + "  날고 있음.. 퍼덕!! 퍼덕!!");
    }
}
