public class MyClass {
    public void method1() {
        System.out.println("m1");
    }

    public void method2(int x) {
        System.out.println(x + "m2");
    }

    public int method3() {
        System.out.println("m3");
        return 10;
    }

    public void method4(int x, int y) {
        System.out.println(x+y +"m4" );
    }

    public int method4(int x) {
        System.out.println(x +"m4" );
        return x*2;
    }
}
