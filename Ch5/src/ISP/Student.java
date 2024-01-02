package ISP;

import java.util.Date;

class Student extends Human{
    String sNumber;

    Student(String name, Date birthDay, String number, String sNumber){
        super(name, birthDay, number);
        this.sNumber = sNumber;
    }
    void study(){
        System.out.println("공부하다");
    }
}
