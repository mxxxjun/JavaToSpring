package SRP;

class Dog1 {
    final static Boolean male = true;
    final static Boolean female = false;
    Boolean sex;

    void act(){
        if(this.sex==male) System.out.println("한쪽 다리를 들고 소변을 보다");
        else System.out.println("뒷다리 두 개를 굽혀 앉은 자세로 소변을 보다");
    }
}
