package TemplateMethod;

class CatPattern extends Animal{
    @Override
    void play() {
        System.out.println("야옹~ 야옹~");
    }

    @Override
    //Hook(갈고리) 메소드 Overriding
    void runSomething(){
        System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑");
    }
}
