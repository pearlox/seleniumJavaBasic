public class BaseClass {

//    BaseClass() {
//        System.out.println("Base Class constructor");
//    }

    public void disp() {
        System.out.println("in base class display");
    }
}

class SubClass extends BaseClass {

//    SubClass() {
//        System.out.println("Subclass constructor");
//    }

    public void disp() {
        super.disp();
        System.out.println("in sub class display");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.disp();

//        BaseClass baseClass = new BaseClass();
//        baseClass.disp();
//
//        BaseClass baseClass1 = new SubClass();
//        baseClass1.disp();

    }
}


