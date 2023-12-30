package Interface;

class Whale extends Mammal implements swimmable{
    Whale(){
        myClass="고래";
    }

    @Override
    public void swim(){
        System.out.println(myClass + " 수영 중. 어프!!! 어프!!!");
    }
}
