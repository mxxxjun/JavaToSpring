package TemplateCallback;

class Soldier {
    void runContext(Strategy strategy){
        System.out.println("전투 시작");
        strategy.runSomething();
        System.out.println("전투 종료");
    }
}
