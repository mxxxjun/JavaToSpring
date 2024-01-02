package ISP;

import java.util.Date;

class Soldier extends Human{
    String aNumber;

    Soldier(String name, Date birthDay, String number, String aNumber){
        super(name, birthDay, number);
        this.aNumber = aNumber;
    }

    void train(){
        System.out.println("훈련하다");
    }
}
