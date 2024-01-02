package ISP;

import java.util.Date;

class Driver {
    public static void main(String[] args){
        Human kStudent = new Student("김학생", new Date(2000, 01, 01),
                "20000101-1234567", "201935255");
        Human kSoldier = new Soldier("이군인", new Date(1999, 12, 12),
                "19991212-1234567", "20-123456");

        System.out.println(kStudent.name);
        System.out.println(kSoldier.name);

        System.out.println(kStudent.birthDay);
        System.out.println(kSoldier.birthDay);

        System.out.println(kStudent.number);
        System.out.println(kSoldier.number);

        System.out.println(((Student)kStudent).sNumber);
        System.out.println(((Soldier)kSoldier).aNumber);

        kStudent.eat();
        kSoldier.eat();

        kStudent.sleep();
        kSoldier.sleep();

        kStudent.intro();
        kSoldier.intro();

        ((Student) kStudent).study();
        ((Soldier) kSoldier).train();
    }
}
