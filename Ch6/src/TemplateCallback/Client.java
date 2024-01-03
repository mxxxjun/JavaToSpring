package TemplateCallback;

class Client {
    public static void main(String[] args){
        Soldier rambo = new Soldier();

        rambo.runContext(new Strategy() {
            @Override
            public void runSomething() {
                System.out.println("총! 초초종총 총! 총!");
            }
        });

        System.out.println();
        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void runSomething() {
                System.out.println("칼! 카가갈 칼! 칼!");
            }
        });

        System.out.println();
        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void runSomething() {
                System.out.println("도끼! 독독..도도독 독끼!");
            }
        });
    }
}
