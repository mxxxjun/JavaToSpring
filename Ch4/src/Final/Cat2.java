package Final;

class Cat2 {
    final static int staticConst1 = 1;
    final static int staticConst2;

    final int objectConst1 = 1;
    final int objectConst2;

    static{
        staticConst2 = 2;
    }

    Cat2(){
        objectConst2 = 2;

        final int localConst1 = 1;
        final int localConst2;
        localConst2=4;
    }
}
