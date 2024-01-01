package Interface;

class Speaker implements SpeakAble{
    @Override
    public void sayYes(){
        System.out.println("I say NO!!!");
    }
}

class JavaTest{
    public static void main(String[] args){
        System.out.println(SpeakAble.absoluteZeroPoint);
        System.out.println(SpeakAble.PI);

        Speaker reporter = new Speaker();
        reporter.sayYes();

        //SpeakAble.absoluteZeroPoint = -12;
        //SpeakAble.PI = 21;
    }
}
