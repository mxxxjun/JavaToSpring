package UML;

class Penguin extends Animal{
    public String habitat;

    public void showHabitat(){
        System.out.printf("%s는 %s에 살아\n", name, habitat);
    }
}
