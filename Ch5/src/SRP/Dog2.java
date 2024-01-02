package SRP;

abstract class Dog2 {
    abstract void act();
}

class dogMale extends Dog2{
    @Override
    void act(){
        System.out.println("한쪽 다리를 들고 소변을 보다.");
    }
}

class dogFemale extends Dog2{
    @Override
    void act(){
        System.out.println("뒷다리 두개를 앉은 자세로 소변을 보다.");
    }
}
