package ISP;

import java.util.Date;

class Human {
    String name;
    Date birthDay;
    String number;

    public Human(String name, Date birthDay, String number) {
        this.name = name;
        this.birthDay = birthDay;
        this.number = number;
    }

    void eat(){
        System.out.println("먹다");
    }
    void sleep(){
        System.out.println("자다");
    }
    void intro(){
        System.out.println("소개하다");
    }
}
