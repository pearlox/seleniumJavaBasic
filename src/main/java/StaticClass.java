public class StaticClass {

    static {
        System.out.println("static block");
    }

    static int x = 1;
    int y = 1;

    public static void main() {
        System.out.println("test in main without arguments");
    }

    public void test() {

    }

    public static void main(String[] testaafa) {
        main();
        System.out.println("Test");

        StaticClass staticClass = new StaticClass();
        staticClass.test();

        A a = new A();
        a.increament();
        System.out.println(x);
        System.out.println(staticClass.y);

        x++;
        staticClass.y++;

        System.out.println(x);
        System.out.println(staticClass.y);
    }
}

class A {

    public void increament() {
        StaticClass staticClass = new StaticClass();
        StaticClass.x++;
        staticClass.y++;
    }
}
