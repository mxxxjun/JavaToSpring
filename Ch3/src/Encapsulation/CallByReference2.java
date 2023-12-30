package Encapsulation;

class CallByReference2 {
    public static void main(String[] args){
        Animal ref_a = new Animal();
        Animal ref_b = new Animal();

        System.out.println(ref_a);
        System.out.println(ref_b);
        System.out.println();
        ref_b = ref_a;
        System.out.println(ref_a);
        System.out.println(ref_b);
    }
}
