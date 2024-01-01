package This;

class Penguin {
    int var = 10;

    void test(){
        int var = 20;

        System.out.println(var);
        System.out.println(this.var);
    }
}
